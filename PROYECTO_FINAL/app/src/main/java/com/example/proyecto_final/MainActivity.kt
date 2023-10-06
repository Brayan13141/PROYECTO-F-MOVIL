package com.example.proyecto_final

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyecto_final.modelos.Nota
import com.example.proyecto_final.ui.theme.PROYECTO_FINALTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PROYECTO_FINALTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PreviewNotasScreen()
                }
            }
        }
    }
}

@Composable
fun NotasScreen(notas: List<Nota>) {
    LazyColumn(modifier = Modifier.background(Color.White)){
        items(notas) { nota ->
            NotaItem(nota)
        }
    }
}
@Composable
fun NotaItem(nota: Nota) {
    BasicTextField(
        value = nota.nameNote,
        onValueChange = { /* Handle changes if needed */ },
        modifier = Modifier.padding(16.dp)
    )
    BasicTextField(
        value = nota.descriptionNote,
        onValueChange = { /* Handle changes if needed */ },
        modifier = Modifier.padding(16.dp).background(Color.Blue)
        )
}

@Composable
@Preview
fun PreviewNotasScreen() {
    val notas = listOf(
        Nota("Nota 1", "Descripción de la Nota 1"),
        Nota("Nota 2", "Descripción de la Nota 2"),
        Nota("Nota 3", "Descripción de la Nota 3")
    )
    NotasScreen(notas)
}

@Composable
fun notaNueva (Nota:Nota, modifier: Modifier=Modifier){
    BasicTextField(value = TextFieldValue(Nota.nameNote), onValueChange = {
    },modifier=Modifier.padding(18.dp))
}
