package com.example.androiddevchallenge.model

data class AuthInfo(
    val grant_type: String = "client_credentials",
    val client_id: String,
    val client_secret: String
)
