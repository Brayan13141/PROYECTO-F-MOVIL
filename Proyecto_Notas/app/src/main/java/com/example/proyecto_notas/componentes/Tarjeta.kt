package com.example.proyecto_notas.componentes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyecto_final.modelos.Nota


//@Preview
@Composable
fun NotaItem(Nota : Nota){
    Card(
        modifier = Modifier.fillMaxWidth().padding(5.dp)
    ){
        Text(
            text = Nota.nameNote,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Start,

        )
        Text(
            text = Nota.descriptionNote,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,

            )
    }
}