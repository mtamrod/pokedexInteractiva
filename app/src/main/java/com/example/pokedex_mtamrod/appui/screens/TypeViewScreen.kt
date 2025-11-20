package com.example.pokedex_mtamrod.appui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pokedex_mtamrod.appui.components.PokemonCard
import com.example.pokedex_mtamrod.model.Pokemon
import com.example.pokedex_mtamrod.model.PokemonType

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TypeViewScreen(
    pokemonList: List<Pokemon>,
    modifier: Modifier = Modifier,
    onPokemonClick: (Pokemon) -> Unit
) {
    val grouped = pokemonList.groupBy { it.tipoPrincipal }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 8.dp)
    ) {
        grouped.forEach { (type, pokemonsOfType) ->
            stickyHeader {
                HeaderType(
                    type = type
                )

            }

            items(
                items = pokemonsOfType,
                key = { it.id }
            ) { pokemon ->
                PokemonCard(
                    pokemon = pokemon,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    onClick = onPokemonClick
                )
            }
        }
    }
}

@Composable
fun HeaderType(type: PokemonType) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE0E0E0)),
        color = type.color
    ) {
        Text(
            text = type.name.lowercase().replaceFirstChar { it.uppercase() },
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .clip(shape = RoundedCornerShape(20.dp)),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Black,
            color = Color.Black,
        )
    }
}
