package com.example.proyecto_notas.Navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyecto_notas.VIEWMODEL.VIEWNOTAS
import com.example.proyecto_notas.screens.AgregarNota
import com.example.proyecto_notas.screens.NotasScreenN
import com.example.proyecto_notas.screens.notas

@Preview
@Composable
fun AdministradorNavegacion()
{
    //val View : VIEWNOTAS = viewModel()
   // val  ViewState = View
    val navControler = rememberNavController()
   NavHost(navController = navControler, startDestination = "inicio")
   {
         composable(route = "inicio")
         {
            NotasScreenN(navControler)
         }
       composable(route = "Agregar")
       {
          AgregarNota()
       }
   }

}