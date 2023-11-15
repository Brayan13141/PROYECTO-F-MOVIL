package com.example.proyecto_notas.componentes

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api :: class)
@Composable
fun TextFieldPerzonalizado (
    texto: String,
    onTextoCambiado:(String) -> Unit,
    etiqueta: String,
    placeholder:String,
    icono: ImageVector? = null,
    multiLinea: Boolean
) {
    OutlinedTextField(
        value = texto,
        onValueChange = onTextoCambiado,
        label = {Text(etiqueta)},
        placeholder = { Text(text = placeholder)},
        leadingIcon = {icono?.let { Icon(  imageVector =  icono, contentDescription  = null ) } },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                //Presionar "Done" en el teclado
            }
        ),
        singleLine = multiLinea, //múltiples lineas
        maxLines = Int.MAX_VALUE  //Múltiples líneas

    )

}
