package com.example.proyecto_final

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun NotasScreen(notas: List<Nota>, modifier: Modifier = Modifier.background(Color.White)) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "NOTAS", modifier = Modifier.background(Color.White))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /* Manejar el clic en el botón "Tareas" */ },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text("Tareas")
            }
            Button(
                onClick = { /* Manejar el clic en el botón "Notas" */ },
                modifier = Modifier.weight(1f)

            ) {
                Text("Notas")
            }
        }
        LazyColumn(modifier = Modifier.background(Color.White)){
            items(notas) { nota ->
                NotaItem(nota)
            }
        }
        Button(onClick = { /*TODO*/ },  modifier = Modifier
            .height(20.dp)
            .padding(start = 8.dp)) {
            Text("+guyvu")
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
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Blue)
        )
}

@Preview
@Composable
fun PreviewNotasScreen() {
    val notas = listOf(
        Nota("Nota 1", "Descripción de la Nota 1"),
        Nota("Nota 2", "Descripción de la Nota 2"),
        Nota("Nota 3", "Descripción de la Nota 3"),
        Nota("Nota 4", "Descripción de la Nota 4"),
        Nota("Nota 5", "Descripción de la Nota 5")
    )
    NotasScreen(notas)
}

@Composable
fun notaNueva (Nota:Nota, modifier: Modifier=Modifier){
    BasicTextField(value = TextFieldValue(Nota.nameNote), onValueChange = {
    },modifier=Modifier.padding(18.dp))
}
