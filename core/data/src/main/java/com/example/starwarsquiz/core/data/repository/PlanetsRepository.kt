package com.example.starwarsquiz.core.data.repository

import com.example.starwarsquiz.core.model.data.Planet
import kotlinx.coroutines.flow.Flow

interface PlanetsRepository {

    fun getPlanets() : Flow<List<Planet>>
}