package com.example.proyecto_final

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class OPERACIONES : ViewModel() {
    private val ESTADO_DATOS = MutableStateFlow(DATOS())

}