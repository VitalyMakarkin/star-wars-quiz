package com.example.starwarsquiz.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "planets"
)
data class PlanetEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("diameter") val diameter: Int,
    @ColumnInfo("climate") val climate: String,
    @ColumnInfo("terrain") val terrain: String,
    @ColumnInfo("population") val population: Int
)
