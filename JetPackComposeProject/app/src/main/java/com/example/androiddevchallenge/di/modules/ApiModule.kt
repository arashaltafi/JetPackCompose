package com.example.androiddevchallenge.di.modules

import com.example.androiddevchallenge.data.remote.AuthInterceptor
import com.example.androiddevchallenge.data.remote.PetApiService
import com.example.androiddevchallenge.data.remote.PetAuthService
import com.example.androiddevchallenge.data.remote.PetAuthenticator
import com.example.androiddevchallenge.utils.NetworkUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    @Provides
    @Singleton
    fun providePetApiService(
        authInterceptor: AuthInterceptor,
        petAuthenticator: PetAuthenticator
    ): PetApiService =
        retrofitBuilder
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(authInterceptor)
                    .authenticator(petAuthenticator)
                    .build()
            )
            .build()
            .create(PetApiService::class.java)

    @Provides
    @Singleton
    fun providePetAuthService(
        authInterceptor: AuthInterceptor,
    ): PetAuthService =
        retrofitBuilder
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(authInterceptor)
                    .build()
            )
            .build()
            .create(PetAuthService::class.java)

    private val retrofitBuilder =
        Retrofit.Builder()
            .baseUrl(NetworkUtils.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
}
