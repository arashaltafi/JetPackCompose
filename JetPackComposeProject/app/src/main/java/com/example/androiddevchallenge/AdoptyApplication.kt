package com.example.androiddevchallenge

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AdoptyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
