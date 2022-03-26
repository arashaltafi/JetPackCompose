package com.example.androiddevchallenge.model

data class Token(
    val expires_in: Int?,
    val access_token: String?
) {
    val timeStamp: Int = 0
}
