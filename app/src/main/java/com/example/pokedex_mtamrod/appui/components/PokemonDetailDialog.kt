package com.example.pokedex_mtamrod.appui.components

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokedex_mtamrod.model.Pokemon

@Composable
fun PokemonDetailDialog(
    pokemon: Pokemon,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("Cerrar")
            }
        },
        title = {
            Text("${pokemon.nombre}  #${pokemon.id.toString().padStart(3, '0')}")
        },
        text = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val imageResId = pokemon.imageResId
                if (imageResId != null && imageResId != 0) {
                    Image(
                        painter = painterResource(id = imageResId),
                        contentDescription = pokemon.nombre,
                        modifier = Modifier
                            .size(250.dp)
                            .padding(end = 8.dp),
                        contentScale = ContentScale.Fit
                    )
                }

                // tipos
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    TipoChip(tipo = pokemon.tipoPrincipal)
                    pokemon.tipoSecundario?.let { TipoChip(tipo = it) }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // descripción
                Text(text = pokemon.descripcion)
            }
        }
    )
}
