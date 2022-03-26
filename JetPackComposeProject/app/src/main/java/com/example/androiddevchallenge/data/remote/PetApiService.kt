package com.example.androiddevchallenge.data.remote

import com.example.androiddevchallenge.model.PetListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PetApiService {

    @GET("animals")
    suspend fun getPets(
        @Query("type") type: String = "Dog"
    ): Response<PetListResponse>

    @GET("animals")
    suspend fun getPetSpecialNeed(
        @Query("type") type: String = "Dog",
        @Query("special_needs") specialNeeds: Boolean = true
    ): Response<PetListResponse>

    @GET("animals")
    suspend fun getPets(
        @Query("type") type: String = "Dog",
        @Query("breed") breed: String
    ): Response<PetListResponse>
}
