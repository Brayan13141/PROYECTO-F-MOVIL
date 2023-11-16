
package com.example.proyecto_notas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyecto_notas.componentes.BotonC


@Preview
@Composable
fun NotasScreen() {
    Column(
        modifier = Modifier

            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "NOTAS", modifier = Modifier
            .height(15.dp)
            .background(Color.White))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            BotonC()
        }
//        LazyColumn(modifier = Modifier
//            .background(Color.White)
//            .height(50.dp)) {
//            //   items(notas) { nota ->
//            //  NotaItem(nota)
//            //  }
//        }
    }
    fun NotasApp(
        windowSize: WindowWidthSizeClass,
        modifier: Modifier = Modifier
    ){

    }
}