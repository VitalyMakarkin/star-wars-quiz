package com.example.starwarsquiz.core.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "people"
)
data class PersonEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val height: Int,
    val mass: Int,
    val hairColor: String,
    val skinColor: String,
    val eyeColor: String,
    val birthYear: String,
    val gender: String
)