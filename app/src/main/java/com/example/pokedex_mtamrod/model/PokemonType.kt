package com.example.pokedex_mtamrod.model

import androidx.compose.ui.graphics.Color

enum class PokemonType(val color: Color) {

    NORMAL(Color(0xFFA8A878)),      // marrón grisáceo
    FUEGO(Color(0xFFF08030)),       // naranja fuego
    AGUA(Color(0xFF6890F0)),        // azul fuerte
    PLANTA(Color(0xFF78C850)),      // verde
    ELECTRICO(Color(0xFFF8D030)),   // amarillo eléctrico
    HIELO(Color(0xFF98D8D8)),       // azul hielo
    LUCHA(Color(0xFFC03028)),       // rojo intenso
    VENENO(Color(0xFFA040A0)),      // morado veneno
    TIERRA(Color(0xFFE0C068)),      // marrón arena
    VOLADOR(Color(0xFFA890F0)),     // violeta suave
    PSIQUICO(Color(0xFFF85888)),    // rosa brillante
    BICHO(Color(0xFFA8B820)),       // verde amarillento
    ROCA(Color(0xFFB8A038)),        // marrón piedra
    FANTASMA(Color(0xFF705898)),    // morado oscuro
    DRAGON(Color(0xFF7038F8));      // morado dragón
}
