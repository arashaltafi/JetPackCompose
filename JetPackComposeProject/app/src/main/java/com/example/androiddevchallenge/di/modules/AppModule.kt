package com.example.androiddevchallenge.di.modules

import android.app.Application
import com.example.androiddevchallenge.data.preferences.Session
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideSession(application: Application) =
        Session(application)
}
