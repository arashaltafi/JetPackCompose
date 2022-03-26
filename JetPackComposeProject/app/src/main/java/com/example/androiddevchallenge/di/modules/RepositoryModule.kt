package com.example.androiddevchallenge.di.modules

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

//    @Binds
//    fun providePetRepository(petRepository: PetRepository) : PetRepository
}
