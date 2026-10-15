package com.example.tarea5multimedia

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ElementoVertical(
    texto: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = texto,
        modifier = modifier.fillMaxHeight()
    )
}