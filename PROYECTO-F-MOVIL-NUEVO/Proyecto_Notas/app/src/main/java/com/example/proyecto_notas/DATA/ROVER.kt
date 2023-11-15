package com.example.proyecto_notas.DATA

import com.example.proyecto_notas.MODELOS.NotaEntity
import kotlinx.coroutines.flow.Flow

class ROVER(private val Dao: DAO) : REPO
{
    override fun getAllItems(): Flow<List<NotaEntity>> = Dao.getItems()

    override suspend fun insert(item: NotaEntity) = Dao.insert(item)

    override suspend fun delete(item: NotaEntity) = Dao.delete(item)

    override suspend fun update(item: NotaEntity) = Dao.update(item)
}