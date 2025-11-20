package com.example.pokedex_mtamrod.appui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pokedex_mtamrod.model.Pokemon
import com.example.pokedex_mtamrod.appui.components.PokemonCard

@Composable
fun ListViewScreen(
    pokemonList: List<Pokemon>,
    modifier: Modifier = Modifier,
    onPokemonClick: (Pokemon) -> Unit
) {
    LazyColumn(modifier = modifier) {
        items(pokemonList, key = { it.id }) { pokemon ->
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
