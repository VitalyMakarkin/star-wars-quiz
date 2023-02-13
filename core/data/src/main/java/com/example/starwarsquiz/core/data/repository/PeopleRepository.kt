package com.example.starwarsquiz.core.data.repository

import com.example.starwarsquiz.core.model.data.Person

interface PeopleRepository {

    fun getPeople() : List<Person>
}