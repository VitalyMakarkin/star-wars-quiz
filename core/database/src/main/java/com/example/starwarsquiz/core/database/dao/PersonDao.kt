package com.example.starwarsquiz.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.starwarsquiz.core.database.model.PersonEntity

@Dao
interface PersonDao {

    @Query("SELECT * FROM people")
    fun getPeople(): List<PersonEntity>
}