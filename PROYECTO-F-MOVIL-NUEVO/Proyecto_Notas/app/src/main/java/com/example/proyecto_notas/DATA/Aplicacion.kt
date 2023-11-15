package com.example.proyecto_notas.DATA

import android.app.Application
import android.content.Context


interface Aplicacion {
    val itemsRepository: REPO
}

class AppDataContainer(private val context: Context) : Aplicacion {
    override val itemsRepository: REPO by lazy {
        ROVER(BDNOTAS.getDatabase(context).DAO())
    }
}