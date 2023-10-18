package com.example.proyecto_final

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyecto_final.modelos.Nota
import com.example.proyecto_final.ui.theme.PROYECTO_FINALTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PROYECTO_FINALTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = Color(0xFF80CAF4) //
                ) {
                   // PreviewNotasScreen()
                }
            }
        }
    }
}


@Composable
fun NotasScreen(notas: List<Nota>) {
    var checked by remember { mutableStateOf(true) }
    var Titulo  by remember { mutableStateOf ("NOTAS") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = Titulo,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 28.sp,
            color = Color.Black
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Switch(modifier = Modifier,
                checked = checked,
                onCheckedChange = {
                    checked = it
                    if(checked)
                    {
                        Titulo="NOTAS "
                    }else{
                        Titulo="TAREAS "
                    }

                }
            )
        }
        Box(modifier = Modifier.fillMaxSize())
        {
            LazyColumn(
                modifier = Modifier
                    //.background(Color(0xFF4A90E2)) //azul
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                items(notas) { nota ->
                    NotaItem(nota)
                }
            }
            Button(modifier = Modifier
                .align(Alignment.BottomEnd) // Alinea el botón en la esquina inferior derecha
                .padding(16.dp)
                ,onClick = { /*TODO*/ }) {
                Text(text = "+",fontSize = 24.sp,)
            }
        }
    }
}

@Composable
fun NotaItem(nota: Nota) {
    Card(
        modifier = Modifier
            .border(2.dp, Color.White)
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = nota.nameNote,
                fontSize = 20.sp,
                color = Color.Black
            )
            Text(
                text = nota.descriptionNote,
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun PreviewNotasScreen() {
    val notas = listOf(
        Nota("Nota 1", "Descripción de la Nota 1"),
        Nota("Nota 2", "Descripción de la Nota 2"),
        Nota("Nota 3", "Descripción de la Nota 3"),
        Nota("Nota 4", "Descripción de la Nota 4"),
        Nota("Nota 5", "Descripción de la Nota 5"),
        Nota("Nota 6", "Descripción de la Nota 6"),
        Nota("Nota 7", "Descripción de la Nota 7"),
        Nota("Nota 8", "Descripción de la Nota 8"),
        Nota("Nota 4", "Descripción de la Nota 4"),
        Nota("Nota 5", "Descripción de la Nota 5"),
        Nota("Nota 6", "Descripción de la Nota 6"),
        Nota("Nota 7", "Descripción de la Nota 7"),
        Nota("Nota 8", "Descripción de la Nota 8")
    )
    NotasScreen(notas)
}


@Preview
@Composable
fun notaNueva(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }
    var Titulo  by remember { mutableStateOf ("NOTA") }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight())
         {
             Text(text ="NUEVO")
             Row(
                 modifier = Modifier.fillMaxWidth(),
             ) {
                 Text(text ="NUEVO",modifier = Modifier.padding(10.dp))
                 Switch(modifier = Modifier,
                     checked = checked,
                     onCheckedChange = {
                         checked = it
                         if(checked)
                         {
                             Titulo="NOTAS "
                         }else{
                             Titulo="TAREAS "
                         }

                     }
                 )
             }
        BasicTextField(value = TextFieldValue("NADA"), onValueChange = {
                }, modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(150.dp)
            .border(.5.dp, Color.White),minLines = 1, keyboardOptions = KeyboardOptions()
        )
        Box(modifier = Modifier)
        {
            BasicTextField(value = TextFieldValue("DESCRIPCIÓN"), onValueChange = {
            }, modifier = Modifier
                .padding(10.dp)
                .border(.5.dp, Color.White)
                .fillMaxWidth()
                .fillMaxHeight(),
                singleLine = false, minLines = 1, maxLines = Int.MAX_VALUE)
            //BOTON ESQUINA INFERIOR
            Button(modifier = Modifier
                .align(Alignment.BottomEnd) // Alinea el botón en la esquina inferior derecha
                .padding(16.dp)
                ,onClick = { /*TODO*/ }) {
                Text(text = "+",fontSize = 24.sp)
            }
            Button(modifier = Modifier
                .align(Alignment.CenterEnd) // Alinea el botón en la esquina inferior derecha
                .padding(16.dp)
                ,onClick = { /*TODO*/ }) {
                Text(text = "+",fontSize = 24.sp)
            }
        }
        }

}


@Composable
fun AppNotas(modifier: Modifier = Modifier)
{
    //val navController = rememberNavController()

   /* NavHost(
        navController = navController,
        startDestination = "Inicio",
        modifier = modifier
    ) {
        // Define las rutas y Composables aquí
    }*/

}

