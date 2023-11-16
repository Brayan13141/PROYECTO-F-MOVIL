package com.example.proyecto_notas.DATA

import android.content.Context


interface AppCont {
    val itemsRepository: REPO
}

class AppDataContainer(private val context: Context) : AppCont {

    override val itemsRepository: REPO by lazy {
        ROVER(BDNOTAS.getDatabase(context).DAO())
    }
}