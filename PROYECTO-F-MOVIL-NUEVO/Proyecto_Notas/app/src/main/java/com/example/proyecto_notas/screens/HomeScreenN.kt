package com.example.proyecto_notas.screens

import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.End
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.proyecto_final.modelos.Nota
import com.example.proyecto_notas.componentes.BotonAgregar
import com.example.proyecto_notas.componentes.BotonC
import com.example.proyecto_notas.componentes.BotonD
import com.example.proyecto_notas.componentes.NotaItem
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.tooling.preview.Preview

val notas : List<Nota> = listOf(
    Nota("NOTA1","DESCRIPCION1"),
    Nota("NOTA2","DESCRIPCION2"),
    Nota("NOTA3","DESCRIPCION3"),
    Nota("NOTA4","DESCRIPCION4"),
    Nota("NOTA5","DESCRIPCION5"),
    Nota("NOTA5","DESCRIPCION6"),
    Nota("NOTA5","DESCRIPCION7")
)

@Composable
fun NotasScreenN(navController: NavController ,list: List<Nota> = notas) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "NOTAS",modifier = Modifier
            .padding(5.dp)
            .align(Alignment.CenterHorizontally)
            ,Color.Black
            )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BotonC()
        }
         Box(  modifier = Modifier
             .fillMaxSize()
             .background(Color.Gray)) {
             LazyColumn(modifier = Modifier
                 .background(Color.White)
                 .fillMaxWidth()
                 .fillMaxHeight()
                 .padding(5.dp)) {
                 items(notas.size) {  nota ->
                     NotaItem(notas.get(nota))
                 }
             }
             Box(
                     modifier = Modifier
                         .size(100.dp, 100.dp)
                         .align(Alignment.BottomEnd) // Alinea en la parte inferior derecha
                     )
             {
                 BotonAgregar(navController, modifier = Modifier
                     .align(Alignment.BottomEnd)
                     .background(Color.LightGray))

             }

         }



    }
}



