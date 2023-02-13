package com.example.starwarsquiz.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.starwarsquiz.core.model.data.Person

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

fun PersonEntity.toPerson() = Person(
    id = this.id,
    name = this.name,
    height = this.height,
    mass = this.mass,
    hairColor = this.hairColor,
    skinColor = this.skinColor,
    eyeColor = this.eyeColor,
    birthYear = this.birthYear,
    gender = this.gender
)