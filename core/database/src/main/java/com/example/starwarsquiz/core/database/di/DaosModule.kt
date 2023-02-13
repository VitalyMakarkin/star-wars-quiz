package com.example.starwarsquiz.core.database.di

import com.example.starwarsquiz.core.database.AppDatabase
import com.example.starwarsquiz.core.database.dao.PersonDao
import com.example.starwarsquiz.core.database.dao.PlanetDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DaosModule {

    @Provides
    fun providesPersonDao(
        database: AppDatabase
    ): PersonDao = database.personDao()

    @Provides
    fun providesPlanetDao(
        database: AppDatabase
    ): PlanetDao = database.planetDao()
}