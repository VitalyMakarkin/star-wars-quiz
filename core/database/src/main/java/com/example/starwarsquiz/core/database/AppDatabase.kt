package com.example.starwarsquiz.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.starwarsquiz.core.database.dao.PersonDao
import com.example.starwarsquiz.core.database.dao.PlanetDao
import com.example.starwarsquiz.core.database.model.PersonEntity
import com.example.starwarsquiz.core.database.model.PlanetEntity

@Database(
    entities = [
        PersonEntity::class,
        PlanetEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase(){

    abstract fun personDao(): PersonDao

    abstract fun planetDao(): PlanetDao
}