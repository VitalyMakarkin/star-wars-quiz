package com.example.starwarsquiz.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlanetResponse(
    @SerialName("name") val name: String,
    @SerialName("diameter") val diameter: String,
    @SerialName("climate") val climate: String,
    @SerialName("terrain") val terrain: String,
    @SerialName("population") val population: String
)
