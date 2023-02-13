package com.example.starwarsquiz.core.model.data

data class Person(
    val id: Int,
    val name: String,
    val height: Int,
    val mass: Int,
    val hairColor: String,
    val skinColor: String,
    val eyeColor: String,
    val birthYear: String,
    val gender: String
    // TODO: val homeworld: Planet
)
