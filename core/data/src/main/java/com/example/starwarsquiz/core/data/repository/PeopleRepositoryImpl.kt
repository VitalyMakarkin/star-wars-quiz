package com.example.starwarsquiz.core.data.repository

import com.example.starwarsquiz.core.data.model.toPersonEntity
import com.example.starwarsquiz.core.database.dao.PersonDao
import com.example.starwarsquiz.core.database.model.toPerson
import com.example.starwarsquiz.core.model.data.Person
import com.example.starwarsquiz.core.network.api.StarWarsApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PeopleRepositoryImpl @Inject constructor(
    private val personDao: PersonDao,
    private val starWarsApi: StarWarsApi
) : PeopleRepository {

    override suspend fun getPeople(): Flow<List<Person>> {
        val result = starWarsApi.getPeople().results
        personDao.upsertPeople(result.map { it.toPersonEntity() })
        return personDao.getPeople()
            .map { it.map { it.toPerson() } }
    }
}