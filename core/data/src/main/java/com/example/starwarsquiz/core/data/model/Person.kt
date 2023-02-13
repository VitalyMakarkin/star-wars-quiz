package com.example.starwarsquiz.core.data.model

import com.example.starwarsquiz.core.database.model.PersonEntity
import com.example.starwarsquiz.core.network.model.PersonResponse

fun PersonResponse.toPersonEntity() = PersonEntity(
    id = 0,
    name = this.name,
    height = this.height.toInt(),
    mass = this.mass.toInt(),
    hairColor = this.hairColor,
    skinColor = this.skinColor,
    eyeColor = this.eyeColor,
    birthYear = this.birthYear,
    gender = this.gender
)