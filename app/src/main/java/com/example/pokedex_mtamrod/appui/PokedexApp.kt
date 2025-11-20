package com.example.pokedex_mtamrod.appui


import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.pokedex_mtamrod.appui.screens.ListViewScreen
import com.example.pokedex_mtamrod.appui.screens.GridViewScreen
//import com.example.pokedex_mtamrod.appui.screens.TypeViewScren
import com.example.pokedex_mtamrod.data.PokemonRepository
import com.example.pokedex_mtamrod.model.Pokemon

enum class PokedexViewMode {
    LIST,
    GRID,
    //GROUPED
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokedexApp() {

    val pokemons: List<Pokemon> = PokemonRepository.getAll()

    var currentView by remember { mutableStateOf(PokedexViewMode.LIST) }

    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Pokédex de Kanto") },
                    actions = {
                        IconButton(onClick = { PokedexViewMode.LIST }) {
                            Icon(Icons.AutoMirrored.Filled.List, contentDescription = "Lista")
                        }
                        IconButton(onClick = { PokedexViewMode.GRID }) {
                            Icon(Icons.Default.GridView, contentDescription = "Cuadrícula")
                        }
                        /*
                        IconButton(onClick = { PokedexViewMode.GROUPED }) {
                            Icon(Icons.Default.Storage, contentDescription = "Agrupado")
                        }
                         */
                    }
                )
            }
        ) { innerPadding ->

            when (currentView) {
                PokedexViewMode.LIST -> ListViewScreen(
                    pokemonList = pokemons,
                    modifier = Modifier.padding(innerPadding)
                )

                PokedexViewMode.GRID -> GridViewScreen(
                    pokemonList = pokemons,
                    modifier = Modifier.padding(innerPadding)
                )

                /*
                PokedexViewMode.GROUPED -> TypeViewScren(
                    pokemonList = pokemons,
                    modifier = Modifier.padding(innerPadding)
                )
                 */
            }
        }
    }
}

