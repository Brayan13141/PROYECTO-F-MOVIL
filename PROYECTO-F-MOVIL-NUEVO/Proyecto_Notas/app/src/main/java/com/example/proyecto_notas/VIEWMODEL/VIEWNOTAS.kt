package com.example.proyecto_notas.VIEWMODEL

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.proyecto_notas.DATA.REPO
import kotlinx.coroutines.flow.StateFlow

class VIEWNOTAS : ViewModel() {
    var UiState by mutableStateOf(NotaUiState())
    //val UI_STATE = StateFlow<NotaUiState> = UiState.asStateflow() //CON ESTE SE MODIFICA EL ESTADO
  //   private set

}

data class NotaUiState(
    val NOTADetails: NOTADetails = NOTADetails(),
    val isEntryValid: Boolean = false
)

data class NOTADetails(
    val id: Int = 0,
    val TITULO: String = "",
    val DESCRPICION: String = "",
   //  val quantity: String = "",
)