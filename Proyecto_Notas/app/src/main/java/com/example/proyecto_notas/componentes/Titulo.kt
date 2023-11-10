package com.example.proyecto_notas.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Titulo()
{
    var Texto  by rememberSaveable { mutableStateOf("Texto inicial") }
    var Texto1  by rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier.background(Color.White)
        .padding(10.dp)) {
       Text(text = "TITULO", modifier = Modifier
           .padding(10.dp), Color.Black, fontSize = 30.sp)
        TextField(value = Texto,
         onValueChange = {
                Texto=it
             },
            modifier = Modifier.background(Color.LightGray)
            .fillMaxWidth(),
           singleLine = false )
        //-------------------------------------------------
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value = Texto1, onValueChange = {
          Texto1=it;
        }, modifier = Modifier.background(Color.LightGray)
            .fillMaxWidth()
            .height(100.dp),
            singleLine = false )
       }

}