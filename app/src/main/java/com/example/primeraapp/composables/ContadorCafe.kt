package com.example.primeraapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CafeCounter() {
    var count by remember {mutableStateOf(0)}

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    ) {
        Text( text = "Te has tomado ${count} cafes hoy" )
        Button(
            onClick = { count++ }
        ) {
            Text(
                text = "Tomar Cafe",
                fontSize = 30.sp,
                color = Color.LightGray
            )
        }
    }
}

@Preview
@Composable
fun CafeCounterPreview() {
    CafeCounter()
}