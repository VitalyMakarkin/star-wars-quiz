package com.example.starwarsquiz.core.network.api

import com.example.starwarsquiz.core.network.model.PageResponse
import com.example.starwarsquiz.core.network.model.PersonResponse
import com.example.starwarsquiz.core.network.model.PlanetResponse
import retrofit2.http.GET

interface StarWarsApi {

    @GET("api/people")
    suspend fun getPeople(): PageResponse<List<PersonResponse>>

    @GET("api/planets")
    suspend fun getPlanets(): PageResponse<List<PlanetResponse>>
}