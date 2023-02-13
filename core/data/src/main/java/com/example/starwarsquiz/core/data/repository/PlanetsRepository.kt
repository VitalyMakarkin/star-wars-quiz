package com.example.starwarsquiz.core.data.repository

import com.example.starwarsquiz.core.model.data.Planet

interface PlanetsRepository {

    fun getPlanets() : List<Planet>
}