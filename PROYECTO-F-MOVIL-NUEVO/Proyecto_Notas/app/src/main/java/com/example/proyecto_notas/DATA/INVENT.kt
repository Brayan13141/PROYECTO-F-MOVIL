package com.example.proyecto_notas.DATA

import android.app.Application

class INVENT : Application() {

    lateinit var container: AppCont

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}