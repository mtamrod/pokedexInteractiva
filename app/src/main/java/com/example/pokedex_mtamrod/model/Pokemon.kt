package com.example.pokedex_mtamrod.model

data class Pokemon(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val tipoPrincipal: PokemonType,
    val tipoSecundario: PokemonType? = null,
    val imageResId: Int? = null
)
