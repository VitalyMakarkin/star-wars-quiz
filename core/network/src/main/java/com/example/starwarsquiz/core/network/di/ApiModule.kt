package com.example.starwarsquiz.core.network.di

import com.example.starwarsquiz.core.network.api.StarWarsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Provides
    @Singleton
    fun provideStarWarsApi(retrofit: Retrofit): StarWarsApi {
        return retrofit.create(StarWarsApi::class.java)
    }
}