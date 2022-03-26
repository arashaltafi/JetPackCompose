package com.example.androiddevchallenge.data.preferences

import android.content.Context
import androidx.core.content.edit
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.example.androiddevchallenge.model.Token

class Session(context: Context) {

    private val sharedPreferences = EncryptedSharedPreferences.create(
        context,
        FILE_NAME,
        MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(),
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    fun saveToken(token: Token) {
        sharedPreferences.edit {
            putString(TOKEN_KEY, token.access_token)
            commit()
        }
    }

    fun getToken() = sharedPreferences.getString(TOKEN_KEY, "token not found")

    companion object {
        const val FILE_NAME = "pet_auth_file_name"
        const val TOKEN_KEY = "pet_auth_token_key"
    }
}
