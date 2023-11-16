package com.example.proyecto_notas.VIEWMODEL

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.proyecto_notas.DATA.REPO
import com.example.proyecto_notas.MODELOS.NotaEntity
import kotlinx.coroutines.flow.StateFlow

class VIEWNOTAS(private val REP : REPO) : ViewModel() {
    var UiState by mutableStateOf(NotaUiState())
        private set
    //val UI_STATE = StateFlow<NotaUiState>  //CON ESTE SE MODIFICA EL ESTADO

    fun updateUiState(NOTADetails: NOTADetails) {
        UiState = NotaUiState(NOTADetails,validateInput(NOTADetails))
    }
    private fun validateInput(uiState: NOTADetails = UiState.NOTADetails): Boolean {
        return with(uiState) {
            TITULO.isNotBlank() && DESCRPICION.isNotBlank()
        }
    }
    suspend fun saveNOTA() {
        if (validateInput()) {
            REP.insert(UiState.NOTADetails.toNota())
        }
    }



}
//CLASES JUNTAS DE EL ESTADO Y LOS DETALLES
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
//FUNCION PARA CONVERTIR UN OBJETO EN NOTA
fun NOTADetails.toNota(): NotaEntity = NotaEntity(
    0,TITULO,DESCRPICION)

//------------------------------------------------------------------------------