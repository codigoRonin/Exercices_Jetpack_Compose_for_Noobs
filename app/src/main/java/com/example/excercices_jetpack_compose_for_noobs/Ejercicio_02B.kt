@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.excercices_jetpack_compose_for_noobs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun Ejercicio_02B() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header_02B(Modifier.align(Alignment.TopCenter))
        Body_02B(Modifier.align(Alignment.Center))
        Footer_02B(Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun Header_02B(modifier: Modifier) {
    Text(
        text = "REGISTRO",
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        modifier = modifier.padding(24.dp)
    )
}

@Composable
fun Body_02B(modifier: Modifier) {
    Column(modifier = modifier) {

        var name by rememberSaveable { mutableStateOf("") }
        var surname by rememberSaveable { mutableStateOf("") }

        UserName_02B(name = name, onTextChange = { name = it })
        Spacer(modifier = Modifier.height(16.dp))
        UserSurname_02B(surname = surname, onTextChange = {surname = it})

    }

}

@Composable
fun UserName_02B(name: String, onTextChange: (String) -> Unit) {

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
fun UserSurname_02B(surname: String, onTextChange: (String) -> Unit) {

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
fun Footer_02B(modifier: Modifier) {
    Text(
        text = "Copyright IES Tubalcaín - 2023",
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        modifier = modifier.padding(bottom = 12.dp)
    )
}