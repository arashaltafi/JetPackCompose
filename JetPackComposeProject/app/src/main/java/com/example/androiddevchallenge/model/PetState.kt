package com.example.androiddevchallenge.model

data class PetState<T>(
    val loading: Boolean = false,
    val data: T? = null,
    val error: String? = null
) {
    val isSuccessful = error == null && !loading

    companion object {
        fun <T : Any> fromResult(result: Result<T>): PetState<T> = when (result) {
            is Result.Success -> PetState(data = result.data)
            is Result.Error -> PetState(error = result.error)
        }
    }
}
