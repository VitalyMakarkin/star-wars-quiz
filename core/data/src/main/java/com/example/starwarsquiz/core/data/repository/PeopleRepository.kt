package com.example.starwarsquiz.core.data.repository

import com.example.starwarsquiz.core.model.data.Person
import kotlinx.coroutines.flow.Flow

interface PeopleRepository {

    fun getPeople() : Flow<List<Person>>
}