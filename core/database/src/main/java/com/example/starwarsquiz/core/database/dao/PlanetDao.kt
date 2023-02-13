package com.example.starwarsquiz.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.starwarsquiz.core.database.model.PlanetEntity

@Dao
interface PlanetDao {

    @Query("SELECT * FROM planets")
    fun getPlanets(): List<PlanetEntity>
}