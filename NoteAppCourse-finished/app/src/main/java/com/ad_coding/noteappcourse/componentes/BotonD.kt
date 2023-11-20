package com.ad_coding.noteappcourse.componentes

import android.widget.Switch
import android.widget.ToggleButton
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BotonD(modifier : Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }
    var Titulo by remember { mutableStateOf("NOTAS") }
    var bandera : Int
    Column {
        Text(text = Titulo,modifier = Modifier, Color.Black)
        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
                if (it==true){
                    Titulo = "NOTAS"
                    bandera=0
                }else
                {
                    Titulo = "TAREAS"}
                    bandera=1
            }
        )
    }
}


