package com.example.tarea5multimedia.ui.components // Ajusta esta línea según el paquete de tu proyecto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.tarea5multimedia.R // Asegúrate de que coincida con el paquete donde está tu recurso R

// 1.2. Función auxiliar que muestra el icono completo de la aplicación
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

// 1.1.1. Elemento Horizontal (Imagen a la izquierda y texto a la derecha)
@Composable
fun ElementoHorizontal(
    texto: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ImagenAplicacion(
            modifier = Modifier.size(56.dp)
        )

        Text(
            text = texto,
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

// 1.1.2. Elemento Vertical (Imagen arriba y texto debajo)
@Composable
fun ElementoVertical(
    texto: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ImagenAplicacion(
            modifier = Modifier.size(72.dp)
        )

        Text(
            text = texto,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

// 1.1.3. Elemento Superpuesto
@Composable
fun ElementoSuperpuesto(
    texto: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(128.dp)
            .clip(shape = RoundedCornerShape(size = 12.dp))
    ) {
        ImagenAplicacion(
            modifier = Modifier.fillMaxSize()
        )

        Text(
            text = texto,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surface.copy(
                        alpha = 0.85f
                    )
                )
                .padding(all = 8.dp)
        )
    }
}