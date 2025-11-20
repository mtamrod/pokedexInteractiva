package com.example.pokedex_mtamrod.appui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
    modifier: Modifier = Modifier,
    onClick: (Pokemon) -> Unit = {}
) {
    Card(
        modifier = modifier
            .clickable { onClick(pokemon) },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF3F3F3)),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            val imageResId = pokemon.imageResId
            if (imageResId != null && imageResId != 0) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = pokemon.nombre,
                    modifier = Modifier
                        .size(75.dp)
                        .padding(end = 8.dp),
                    contentScale = ContentScale.Fit
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = "#${pokemon.id.toString().padStart(3, '0')}",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )

                Text(
                    text = pokemon.nombre,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Column {
                    TipoChip(tipo = pokemon.tipoPrincipal)

                    pokemon.tipoSecundario?.let {
                        Spacer(modifier = Modifier.height(4.dp))
                        TipoChip(tipo = it)
                    }
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
                color = tipo.color,
                shape = RoundedCornerShape(50)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = tipo.name,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black,
            maxLines = 1
        )
    }
}
