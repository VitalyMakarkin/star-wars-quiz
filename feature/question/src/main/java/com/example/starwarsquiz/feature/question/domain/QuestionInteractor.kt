package com.example.starwarsquiz.feature.question.domain

import com.example.starwarsquiz.core.data.repository.PeopleRepository
import com.example.starwarsquiz.core.model.data.Person
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class QuestionInteractor @Inject constructor(
    private val peopleRepository: PeopleRepository
) {
    suspend fun getPeople(): Flow<List<Person>> {
        return peopleRepository.getPeople()
    }
}