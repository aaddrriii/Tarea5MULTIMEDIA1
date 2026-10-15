package com.example.tarea5multimedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ElementoHorizontal(
    texto: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = texto,
        modifier = modifier.fillMaxWidth()
    )
}