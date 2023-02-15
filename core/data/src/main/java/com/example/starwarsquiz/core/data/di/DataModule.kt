package com.example.starwarsquiz.core.data.di

import com.example.starwarsquiz.core.data.repository.PeopleRepository
import com.example.starwarsquiz.core.data.repository.PeopleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindPeopleRepository(
        peopleRepository: PeopleRepositoryImpl
    ): PeopleRepository
}