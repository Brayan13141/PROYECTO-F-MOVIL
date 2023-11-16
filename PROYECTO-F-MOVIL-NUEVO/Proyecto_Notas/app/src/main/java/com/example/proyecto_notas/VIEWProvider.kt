package com.example.proyecto_notas

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.proyecto_notas.DATA.INVENTNOTAS
import com.example.proyecto_notas.VIEWMODEL.VIEWNOTAS

object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Other Initializers
        // Initializer for ItemEntryViewModel
        initializer {
            VIEWNOTAS(INVENTNOTAS().container.itemsRepository)
        }

    }
}