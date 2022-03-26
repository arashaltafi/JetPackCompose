package com.example.androiddevchallenge.model

data class Pet(
    val id: Int,
    val name: String,
    val gender: String,
    val photos: List<PetPhoto>,
    val age: String?,
    val size: String?,
    val coat: String?,
    val breeds: PetBreeds,
    val colors: PetColors
)

data class PetListResponse(
    val animals: List<Pet>
)

data class PetBreeds(
    val primary: String?,
    val secondary: String?
)

data class PetColors(
    val primary: String?,
    val secondary: String?,
    val tertiary: String?,
)

data class PetPhoto(
    val small: String,
    val medium: String,
    val large: String,
    val full: String
)
