package com.example.androiddevchallenge.data.remote

import com.example.androiddevchallenge.model.AuthInfo
import com.example.androiddevchallenge.model.Token
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface PetAuthService {

    @POST("oauth2/token")
    fun getAccessToken(
        @Body authInfo: AuthInfo,
    ): Call<Token>
}
