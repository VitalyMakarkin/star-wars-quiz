package com.example.starwarsquiz.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PageResponse<T>(
    @SerialName("count") val count: Int,
    @SerialName("results") val results: T
)
