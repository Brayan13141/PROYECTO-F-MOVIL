package com.example.proyecto_notas.DATA

import com.example.proyecto_notas.MODELOS.NotaEntity
import kotlinx.coroutines.flow.Flow

interface REPO {

    fun getAllItems(): Flow<List<NotaEntity>>

    suspend fun insert(item: NotaEntity)

    suspend fun delete(item: NotaEntity)


    suspend fun update(item: NotaEntity)
}