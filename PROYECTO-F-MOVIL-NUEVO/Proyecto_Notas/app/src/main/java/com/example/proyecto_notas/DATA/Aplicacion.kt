package com.example.proyecto_notas.DATA

import android.app.Application


class Aplicacion : Application(){
    val database: BDNOTAS by lazy { BDNOTAS.getDatabase(this) }
}