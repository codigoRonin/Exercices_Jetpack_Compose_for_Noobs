@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.excercices_jetpack_compose_for_noobs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ejercicio_02C() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header_02C(Modifier.align(Alignment.TopCenter))
        Body_02C(Modifier.align(Alignment.Center))
        Footer_02C(Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun Header_02C(modifier: Modifier) {
    Text(
        text = "REGISTRO",
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        modifier = modifier.padding(24.dp)
    )
}

@Composable
fun Body_02C(modifier: Modifier) {
    var name by rememberSaveable { mutableStateOf("") }
    var surname by rememberSaveable { mutableStateOf("") }
    var show by rememberSaveable { mutableStateOf(false) }

    Column(modifier = modifier) {
        UserName_02C(name = name, onTextChange = { name = it })
        Spacer(modifier = Modifier.height(16.dp))
        UserSurname_02C(surname = surname, onTextChange = { surname = it })
        Spacer(modifier = Modifier.height(32.dp))
      //  Button(onClick = { show = true }, Modifier.align(Alignment.CenterHorizontally)) { Text("Concatenar") }
        ButtonBar(show = show, Modifier.align(Alignment.CenterHorizontally)) { show = !show }
        Spacer(modifier = Modifier.height(16.dp))
        ConcatNameSurname_2C(show, name, surname, Modifier.align(Alignment.CenterHorizontally))
    }
}
@Composable
fun ButtonBar(show: Boolean, modifier: Modifier, onClick: () -> Unit) {
    if (!show)
        Button(
            onClick = { onClick() }, modifier = modifier
        ) { Text("Mostrar") }
    else
        Button(
            onClick = { onClick() }, modifier = modifier
        ) { Text("Ocultar") }
}

@Composable
fun ConcatNameSurname_2C(show: Boolean, name: String, surname: String, modifier: Modifier) {
    if (show)
        Text(text = "$name $surname", modifier = modifier)
}

@Composable
fun UserName_02C(name: String, onTextChange: (String) -> Unit) {

    OutlinedTextField(
        value = name,
        onValueChange = { onTextChange(it) },
        label = { Text("Nombre") },
        placeholder = { Text("Introduce tu nombre") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Black, focusedLabelColor = Color.Black
        )
    )
}

@Composable
fun UserSurname_02C(surname: String, onTextChange: (String) -> Unit) {

    OutlinedTextField(
        value = surname,
        onValueChange = { onTextChange(it) },
        label = { Text("Apellidos") },
        placeholder = { Text("Introduce tus apellidos") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Black, focusedLabelColor = Color.Black
        )
    )
}

@Composable
fun Footer_02C(modifier: Modifier) {
    Text(
        text = "Copyright IES Tubalcaín - 2023",
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        modifier = modifier.padding(bottom = 12.dp)
    )
}