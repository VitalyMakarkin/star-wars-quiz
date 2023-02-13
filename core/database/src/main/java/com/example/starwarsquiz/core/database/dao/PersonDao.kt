package com.example.starwarsquiz.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.starwarsquiz.core.database.model.PersonEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonDao {

    @Query("SELECT * FROM people")
    fun getPeople(): Flow<List<PersonEntity>>

    @Upsert
    suspend fun upsertPeople(personEntities: List<PersonEntity>)
}