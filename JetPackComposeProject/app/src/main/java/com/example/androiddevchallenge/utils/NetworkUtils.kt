package com.example.androiddevchallenge.utils

import com.example.androiddevchallenge.model.Result
import retrofit2.Response

object NetworkUtils {

    const val BASE_URL = "https://api.petfinder.com/v2/"
    const val CLIENT_ID = "nNQA8PZYVmRQ4pWz2aBbdUt2IWudFaOkfZ74Els9ge5WALBmG1"
    const val SECRET_KEY = "WvE5Mwu3kUGaIYtpHwd4C1J9ePxnEtgKIJX7sxAn"
}

fun <T : Any> Response<T>.call(): Result<T> {
    val response = body()
    return if (this.isSuccessful && response != null) {
        Result.Success(response)
    } else
        Result.Error(errorBody().toString())
}
