package com.example.pokedex_mtamrod.appui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
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
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(12.dp)
    ) {
        items(pokemonList) { pokemon ->
            PokemonCard(
                pokemon = pokemon,
                modifier = Modifier
                    .fillParentMaxWidth()
            )
        }
    }
}