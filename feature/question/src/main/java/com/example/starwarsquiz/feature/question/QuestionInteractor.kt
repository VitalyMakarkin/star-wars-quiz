package com.example.starwarsquiz.feature.question

import com.example.starwarsquiz.core.data.repository.PeopleRepository
import javax.inject.Inject

class QuestionInteractor @Inject constructor(
    private val peopleRepository: PeopleRepository
)