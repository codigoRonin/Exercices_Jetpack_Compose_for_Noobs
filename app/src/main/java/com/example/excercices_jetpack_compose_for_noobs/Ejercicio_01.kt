package com.example.excercices_jetpack_compose_for_noobs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .weight(1f), Alignment.Center) {
            Text(text = "Ejemplo1")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Red)
                    .weight(1f), Alignment.Center) {
                Text(text = "Ejemplo2")
            }
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Green)
                    .weight(1f), Alignment.Center) {
                Text(text = "Ejemplo3")
            }
        }

        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .weight(1f), Alignment.BottomCenter) {
            Text(text = "Ejemplo2")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview_01() {
        MyComplexLayout()
}