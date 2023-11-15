package com.example.proyecto_notas.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BotonGuardar(onClick: () -> Unit){
    Button(
        onClick = {onClick()},
        modifier = Modifier
    ) {
        Text(text = "Agregar")
    }
}


@Composable
@Preview
fun Previ(){
    BotonGuardar (onClick = {})
}