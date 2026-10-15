package com.example.tarea5multimedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ElementoSuperpuesto(
    texto: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = texto,
        modifier = modifier
            .padding(16.dp)
    )
}