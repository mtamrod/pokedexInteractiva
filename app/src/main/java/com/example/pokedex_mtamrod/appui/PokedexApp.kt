package com.example.pokedex_mtamrod.appui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.pokedex_mtamrod.appui.components.PokemonDetailDialog
import com.example.pokedex_mtamrod.appui.screens.GridViewScreen
import com.example.pokedex_mtamrod.appui.screens.ListViewScreen
import com.example.pokedex_mtamrod.appui.screens.TypeViewScreen
import com.example.pokedex_mtamrod.data.PokemonRepository
import com.example.pokedex_mtamrod.model.Pokemon

enum class PokedexViewMode {
    LIST,
    GRID,
    GROUPED
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokedexApp() {

    val pokemons: List<Pokemon> = PokemonRepository.getAll()

    var currentView by remember { mutableStateOf(PokedexViewMode.LIST) }
    var selectedPokemon by remember { mutableStateOf<Pokemon?>(null) }

    MaterialTheme {
        Scaffold(
            topBar = {
                Text("Pokedex de Kanto")
            },
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(
                        selected = currentView == PokedexViewMode.LIST,
                        onClick = { currentView = PokedexViewMode.LIST },
                        icon = {
                            Icon(
                                Icons.AutoMirrored.Filled.List,
                                contentDescription = "Lista"
                            )
                        },
                        label = { Text("Lista") }
                    )
                    NavigationBarItem(
                        selected = currentView == PokedexViewMode.GRID,
                        onClick = { currentView = PokedexViewMode.GRID },
                        icon = {
                            Icon(
                                Icons.Filled.GridView,
                                contentDescription = "Cuadrícula"
                            )
                        },
                        label = { Text("Grid") }
                    )
                    NavigationBarItem(
                        selected = currentView == PokedexViewMode.GROUPED,
                        onClick = { currentView = PokedexViewMode.GROUPED },
                        icon = {
                            Icon(
                                Icons.Filled.Storage,
                                contentDescription = "Agrupado"
                            )
                        },
                        label = { Text("Tipos") }
                    )
                }
            }
        ) { innerPadding ->

            when (currentView) {
                PokedexViewMode.LIST -> ListViewScreen(
                    pokemonList = pokemons,
                    modifier = Modifier.padding(innerPadding),
                    onPokemonClick = { pokemon -> selectedPokemon = pokemon }
                )

                PokedexViewMode.GRID -> GridViewScreen(
                    pokemonList = pokemons,
                    modifier = Modifier.padding(innerPadding),
                    onPokemonClick = { pokemon -> selectedPokemon = pokemon }
                )

                PokedexViewMode.GROUPED -> TypeViewScreen(
                    pokemonList = pokemons,
                    modifier = Modifier.padding(innerPadding),
                    onPokemonClick = { pokemon -> selectedPokemon = pokemon }
                )
            }

            selectedPokemon?.let { pokemon ->
                PokemonDetailDialog(
                    pokemon = pokemon,
                    onDismiss = { selectedPokemon = null }
                )
            }
        }
    }
}

