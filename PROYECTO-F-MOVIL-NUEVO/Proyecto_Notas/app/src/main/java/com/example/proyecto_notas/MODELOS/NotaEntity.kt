package com.example.proyecto_notas.MODELOS

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity//(tableName = "NotaEntity")
data class NotaEntity (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    @ColumnInfo(name = "Titulo")
    val Titulo: String,
    @ColumnInfo(name = "Descripcion")
    val Descripcion: Double

)