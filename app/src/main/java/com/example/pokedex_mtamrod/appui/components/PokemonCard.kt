package com.example.pokedex_mtamrod.appui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pokedex_mtamrod.model.Pokemon
import com.example.pokedex_mtamrod.model.PokemonType

@Composable
fun PokemonCard(
    pokemon: Pokemon,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF3F3F3) // color base neutro
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(12.dp)
        ) {

            // Imagen drawable
            val imageResId = pokemon.imageResId

            if (imageResId != null && imageResId != 0) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = pokemon.nombre,
                    modifier = Modifier.size(90.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(8.dp))
            }

            // Nombre del Pokémon
            Text(
                text = pokemon.nombre,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Tarjetas de tipos
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                TipoChip(tipo = pokemon.tipoPrincipal)

                pokemon.tipoSecundario?.let {
                    TipoChip(tipo = it)
                }
            }
        }
    }
}

@Composable
fun TipoChip(tipo: PokemonType) {
    Box(
        modifier = Modifier
            .background(
                color = Color.Black.copy(alpha = 0.10f),
                shape = RoundedCornerShape(50)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = tipo.name, // Tipo de la lista enum de tipos
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black
        )
    }
}
