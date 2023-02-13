package com.example.starwarsquiz.core.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "planets"
)
data class PlanetEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val diameter: Int,
    val climate: String,
    val terrain: String,
    val population: Int
)
