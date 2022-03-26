package com.example.androiddevchallenge.ui.navigation

sealed class Screen(open val route: String = "") {
    object Home : Screen("home")
    object DogDetail : Screen("dog_detail")
}
