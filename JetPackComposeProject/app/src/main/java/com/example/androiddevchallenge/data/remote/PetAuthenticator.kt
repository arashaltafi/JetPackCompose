package com.example.androiddevchallenge.data.remote

import android.util.Log
import com.example.androiddevchallenge.data.preferences.Session
import com.example.androiddevchallenge.model.AuthInfo
import com.example.androiddevchallenge.utils.NetworkUtils
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PetAuthenticator @Inject constructor(
    private val petAuthService: PetAuthService,
    private val session: Session
) : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? {

        val token = petAuthService
            .getAccessToken(
                AuthInfo(
                    client_id = NetworkUtils.CLIENT_ID,
                    client_secret = NetworkUtils.SECRET_KEY
                )
            )
            .execute()
        Log.d("debuggg", "Authenticator fired in")
        return if (token.code() == 200) {
            session.saveToken(token.body()!!)
            Log.d("debuggg", "Authenticator refreshed token")
            response.request().newBuilder()
                .header("Authorization", "Bearer ${token.body()!!.access_token}")
                .build()
        } else null
    }
}
