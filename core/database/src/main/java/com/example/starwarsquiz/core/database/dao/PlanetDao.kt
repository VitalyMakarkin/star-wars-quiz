package com.example.starwarsquiz.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.starwarsquiz.core.database.model.PlanetEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PlanetDao {

    @Query("SELECT * FROM planets")
    fun getPlanets(): Flow<List<PlanetEntity>>
}