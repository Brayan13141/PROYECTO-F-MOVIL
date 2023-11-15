package com.example.proyecto_notas.DATA

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.proyecto_notas.MODELOS.NotaEntity

@Database(entities = [NotaEntity::class], version = 1, exportSchema = false)
abstract class BDNOTAS : RoomDatabase() {

    abstract fun DAO(): DAO

    companion object {
        @Volatile
        private var INSTANCE: BDNOTAS? = null
        fun getDatabase(context: Context): BDNOTAS {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BDNOTAS::class.java,
                    "item_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}