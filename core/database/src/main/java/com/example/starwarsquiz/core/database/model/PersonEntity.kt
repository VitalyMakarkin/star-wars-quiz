package com.example.starwarsquiz.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "people"
)
data class PersonEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("height") val height: Int,
    @ColumnInfo("mass") val mass: Int,
    @ColumnInfo("hair_Color") val hairColor: String,
    @ColumnInfo("skin_color") val skinColor: String,
    @ColumnInfo("eye_color") val eyeColor: String,
    @ColumnInfo("birth_year") val birthYear: String,
    @ColumnInfo("gender") val gender: String
)