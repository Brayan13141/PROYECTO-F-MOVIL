package com.example.proyecto_notas.DATA

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.proyecto_notas.MODELOS.NotaEntity

@Dao
interface DAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: NotaEntity)

    @Update
    suspend fun update(item: NotaEntity)

    @Delete
    suspend fun delete(item: NotaEntity)

    @Query("SELECT * from NotaEntity ORDER BY Titulo ASC")
    fun getItems(): List<NotaEntity>
}