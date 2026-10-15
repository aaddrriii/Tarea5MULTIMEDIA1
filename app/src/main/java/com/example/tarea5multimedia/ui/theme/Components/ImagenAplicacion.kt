package com.example.tarea5multimedia.ui.theme.Components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ImagenAplicacion(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.clip(
            shape = RoundedCornerShape(size = 12.dp)
        )
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_launcher_background
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Image(
            painter = painterResource(
                id = R.drawable.ic_launcher_foreground
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
}