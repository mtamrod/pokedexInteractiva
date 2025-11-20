package com.example.pokedex_mtamrod.data

import com.example.pokedex_mtamrod.model.Pokemon
import com.example.pokedex_mtamrod.model.PokemonType

object PokemonRepository {
    private val pokemons: List<Pokemon> = listOf(

        // 001 – 025
        Pokemon(1, "Bulbasaur",
            "Nace con una semilla en el lomo que crece absorbiendo luz solar. Este Pokémon combina la energía de la planta con su propio cuerpo para fortalecerse día a día.",
            PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(2, "Ivysaur",
            "La planta de su espalda ha brotado en un bulbo más grande. Cuando está por evolucionar, su cuerpo se vuelve más pesado y prefiere permanecer expuesto al sol.",
            PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(3, "Venusaur",
            "La gran flor de su lomo libera un aroma dulce que tranquiliza a quienes lo rodean. Cuando capta suficiente energía solar, puede desatar un poder descomunal.",
            PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(4, "Charmander",
            "La llama de su cola refleja su vitalidad. Si está animado, la llama arde con fuerza; si está débil, disminuye de tamaño y brillo.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(5, "Charmeleon",
            "Se vuelve agresivo cuando lucha y su cola arde con un resplandor intenso. Busca siempre oponentes fuertes para satisfacer su espíritu combativo.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(6, "Charizard",
            "Escupe llamaradas tan calientes que pueden fundir rocas. Surca los cielos en busca de rivales dignos, evitando enfrentarse a quienes considera débiles.",
            PokemonType.FUEGO, PokemonType.VOLADOR, 0
        ),

        Pokemon(7, "Squirtle",
            "Se esconde en su resistente caparazón para protegerse. Nada con destreza y dispara chorros de agua para defenderse de cualquier amenaza.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(8, "Wartortle",
            "Sus orejas y cola peludas indican su vejez: cuanto más grandes, más experimentado es. Nada velozmente agitando su cola como un timón.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(9, "Blastoise",
            "Los potentes cañones de su caparazón pueden disparar agua a alta presión. Su peso le brinda estabilidad para soportar el retroceso de los chorros.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(10, "Caterpie",
            "Su cuerpo desprende un olor peculiar que usa para ahuyentar depredadores. Come vorazmente hojas para crecer rápidamente antes de evolucionar.",
            PokemonType.BICHO, null, 0
        ),

        Pokemon(11, "Metapod",
            "Su dura coraza lo protege mientras su cuerpo blando sufre una intensa transformación interna. Evita moverse para conservar energía.",
            PokemonType.BICHO, null, 0
        ),

        Pokemon(12, "Butterfree",
            "Sus alas repelen el agua gracias a un polvo especial, permitiéndole volar incluso bajo la lluvia. Propaga esporas y polen con gran precisión.",
            PokemonType.BICHO, PokemonType.VOLADOR, 0
        ),

        Pokemon(13, "Weedle",
            "Su aguijón venenoso es su principal defensa. Suele ocultarse entre la hierba y las hojas de los bosques para evitar a sus depredadores.",
            PokemonType.BICHO, PokemonType.VENENO, 0
        ),

        Pokemon(14, "Kakuna",
            "Permanece casi inmóvil, endureciendo su capullo mientras se prepara para evolucionar. Aun así, su aguijón es capaz de defenderlo si es necesario.",
            PokemonType.BICHO, PokemonType.VENENO, 0
        ),

        Pokemon(15, "Beedrill",
            "Vuela rápidamente y ataca con sus afilados aguijones. Protege su colmena con fiereza y puede lanzar ofensivas coordinadas junto a otros de su especie.",
            PokemonType.BICHO, PokemonType.VENENO, 0
        ),

        Pokemon(16, "Pidgey",
            "Es dócil y prefiere evitar los conflictos. Levanta polvo con sus alas para confundir a sus enemigos mientras escapa.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(17, "Pidgeotto",
            "Extremadamente territorial, patrulla grandes extensiones en busca de intrusos. Su vista es tan aguda que detecta presas desde gran altura.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(18, "Pidgeot",
            "Vuela a velocidades increíbles y exhibe un plumaje majestuoso. Ataca con precisión a sus presas gracias a su impresionante agilidad.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(19, "Rattata",
            "Es muy nervioso y se mantiene siempre alerta. Sus incisivos crecen constantemente, por lo que necesita roer objetos para desgastarlos.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(20, "Raticate",
            "Nada con habilidad usando su cola como timón. Sus colmillos son fuertes y pueden romper incluso materiales duros.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(21, "Spearow",
            "Grita enérgicamente para avisar a otros de su especie del peligro. Sus alas pequeñas le permiten volar rápido en trayectos cortos.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(22, "Fearow",
            "Puede mantenerse en vuelo durante horas sin cansarse. Su pico largo y resistente le permite capturar presas incluso en madrigueras estrechas.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(23, "Ekans",
            "Desliza su cuerpo sigilosamente para acechar a sus presas. Se enrosca alrededor de su objetivo para inmovilizarlo y evitar que escape.",
            PokemonType.VENENO, null, 0
        ),

        Pokemon(24, "Arbok",
            "El dibujo de su pecho varía según la región y sirve para intimidar. Aprieta con tal fuerza que puede partir la respiración de su oponente.",
            PokemonType.VENENO, null, 0
        ),

        Pokemon(25, "Pikachu",
            "Acumula electricidad en sus mejillas. Cuando se emociona o se enfada, liberan chispas que pueden sorprender incluso a enemigos más grandes.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(26, "Raichu",
        "Almacena una gran cantidad de electricidad en su cuerpo. Cuando se sobrecarga, descarga la energía en el suelo, dejando marcas quemadas a su alrededor.",
        PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(27, "Sandshrew",
        "Vive en zonas áridas y se enrolla formando una bola para protegerse de ataques. Su piel seca y dura lo protege del calor extremo.",
        PokemonType.TIERRA, null, 0
        ),

        Pokemon(28, "Sandslash",
        "Su cuerpo está cubierto de púas afiladas que utiliza para atacar y defenderse. Puede excavar túneles con gran velocidad.",
        PokemonType.TIERRA, null, 0
        ),

        Pokemon(29, "Nidoran♀",
        "Aunque es pequeño, posee un veneno fuerte en su cuerno. Usa sus bigotes para detectar el peligro en su entorno.",
        PokemonType.VENENO, null, 0
        ),

        Pokemon(30, "Nidorina",
        "Es más tranquila que su forma previa y prefiere evitar las peleas. Conserva el veneno en su cuerno, aunque lo usa solo si se ve acorralada.",
        PokemonType.VENENO, null, 0
        ),

        Pokemon(31, "Nidoqueen",
        "Su cuerpo está cubierto de gruesas escamas que actúan como armadura. Protege con ferocidad a sus crías y a su territorio.",
        PokemonType.VENENO, PokemonType.TIERRA, 0
        ),

        Pokemon(32, "Nidoran♂",
        "Más impulsivo que su contraparte femenina, busca intimidar con su cuerno venenoso. Reacciona rápidamente ante cualquier amenaza.",
        PokemonType.VENENO, null, 0
        ),

        Pokemon(33, "Nidorino",
        "Su cuerno es extremadamente duro y libera toxinas al perforar. Se lanza contra oponentes más grandes sin dudarlo.",
        PokemonType.VENENO, null, 0
        ),

        Pokemon(34, "Nidoking",
        "Posee una fuerza brutal y un temperamento feroz. Su cola puede destruir rocas y su cuerno libera venenos muy potentes.",
        PokemonType.VENENO, PokemonType.TIERRA, 0
        ),

        Pokemon(35, "Clefairy",
        "Atrae la luz de la luna, que parece energizarlo. Se reúnen en grupo durante noches despejadas para bailar alegremente.",
        PokemonType.NORMAL, null, 0
        ),

        Pokemon(36, "Clefable",
        "De naturaleza tímida, evita el contacto con humanos. Sus grandes orejas pueden detectar incluso los sonidos más suaves.",
        PokemonType.NORMAL, null, 0
        ),

        Pokemon(37, "Vulpix",
        "Nace con una sola cola que se divide en varias a medida que crece. Exhala llamas suaves cuando está relajado.",
        PokemonType.FUEGO, null, 0
        ),

        Pokemon(38, "Ninetales",
        "Se dice que cada una de sus nueve colas contiene un poder místico. Puede lanzar maldiciones a quien lo maltrate.",
        PokemonType.FUEGO, null, 0
        ),

        Pokemon(39, "Jigglypuff",
        "Su dulce voz tiene un efecto soporífero. Canta hasta que su oponente cae rendido, enfadándose si nadie la escucha.",
        PokemonType.NORMAL, null, 0
        ),

        Pokemon(40, "Wigglytuff",
        "Su cuerpo es extremadamente suave y puede inflarse hasta alcanzar un gran tamaño. Sus ojos brillantes deslumbran a cualquiera que los mire.",
        PokemonType.NORMAL, null, 0
        ),

        Pokemon(41, "Zubat",
        "No tiene ojos, por lo que usa ultrasonidos para orientarse. Evita la luz del sol y forma grandes colonias en cuevas.",
        PokemonType.VENENO, PokemonType.VOLADOR, 0
        ),

        Pokemon(42, "Golbat",
        "Se abalanza sobre sus presas para absorber su energía. Emite poderosos chillidos que confunden a sus oponentes.",
        PokemonType.VENENO, PokemonType.VOLADOR, 0
        ),

        Pokemon(43, "Oddish",
        "Sale de noche para sembrarse en lugares húmedos. Sus hojas absorben energía lunar para mantenerse saludable.",
        PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(44, "Gloom",
        "El aroma que desprende puede ser desagradable, aunque usa sus olores para atraer o repeler. Guarda polen tóxico en sus flores.",
        PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(45, "Vileplume",
        "Sus pétalos producen polen venenoso que libera al agitarse. Aunque pesado, puede desprender una fragancia agradable cuando está tranquilo.",
        PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(46, "Paras",
        "Vive en simbiosis con los hongos de su espalda. A medida que crece, los hongos comienzan a controlar sus movimientos.",
        PokemonType.BICHO, PokemonType.PLANTA, 0
        ),

        Pokemon(47, "Parasect",
        "El hongo ha tomado el control total del cuerpo. Libera esporas que alteran el comportamiento de otros seres vivos.",
        PokemonType.BICHO, PokemonType.PLANTA, 0
        ),

        Pokemon(48, "Venonat",
        "Sus ojos compuestos pueden ver incluso en la oscuridad. Su cuerpo está cubierto de un vello que almacena toxinas.",
        PokemonType.BICHO, PokemonType.VENENO, 0
        ),

        Pokemon(49, "Venomoth",
        "Sus alas difunden un polvo escamado que puede causar varios efectos. Cambia el tipo de polvo según la situación.",
        PokemonType.BICHO, PokemonType.VENENO, 0
        ),

        Pokemon(50, "Diglett",
        "Vive bajo tierra cavando a gran velocidad. Su piel es muy sensible a la luz, por lo que rara vez se muestra en la superficie.",
        PokemonType.TIERRA, null, 0
        ),

        Pokemon(51, "Dugtrio",
            "Tres Diglett que trabajan en perfecta sincronía. Puede cavar túneles profundos en pocos minutos, desestabilizando incluso terrenos firmes.",
            PokemonType.TIERRA, null, 0
        ),

        Pokemon(52, "Meowth",
            "Extremadamente ágil y curioso. Adora los objetos brillantes y puede caminar silenciosamente para robar sin ser detectado.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(53, "Persian",
            "Elegante y orgulloso, no tolera el desorden. Se mueve con una agilidad impecable y ataca con sus afiladas garras cuando se enfurece.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(54, "Psyduck",
            "Sufre constantes dolores de cabeza que pueden desatar poderes psíquicos incontrolables. A menudo parece distraído o confundido.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(55, "Golduck",
            "Nada con una gracia extraordinaria, moviéndose como si deslizara por el agua. Sus habilidades psíquicas se vuelven más precisas al concentrarse.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(56, "Mankey",
            "Se irrita con facilidad y puede entrar en un ataque de furia. A pesar de ello, es rápido y muy coordinado al luchar.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(57, "Primeape",
            "Una vez enfadado, no se calma hasta encontrar a su objetivo. Su agresividad va acompañada de una velocidad sorprendente.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(58, "Growlithe",
            "Leal y valiente, protege a su entrenador con devoción. Su excelente olfato puede recordar aromas durante años.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(59, "Arcanine",
            "Su velocidad es legendaria; muchos relatos antiguos dicen que recorre grandes distancias en un instante. Inspira respeto con su porte majestuoso.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(60, "Poliwag",
            "Su piel es tan fina que permite ver sus entrañas. Se desplaza mejor en el agua, donde su cola le da un control preciso.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(61, "Poliwhirl",
            "La espiral de su abdomen hipnotiza a quienes lo observan. Mantiene su piel húmeda para poder respirar adecuadamente.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(62, "Poliwrath",
            "Fuerte y resistente, nada a contracorriente sin esfuerzo. Usa sus robustos brazos para luchar con enorme potencia.",
            PokemonType.AGUA, PokemonType.LUCHA, 0
        ),

        Pokemon(63, "Abra",
            "Pasa la mayor parte del día dormido. Incluso dormido, es capaz de teletransportarse automáticamente para evitar el peligro.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(64, "Kadabra",
            "Su presencia altera los campos electromagnéticos. Lleva siempre una cuchara que canaliza sus habilidades psíquicas.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(65, "Alakazam",
            "Posee un intelecto sobresaliente y una memoria imposible de medir. Sus cucharas se doblan con el poder de su mente.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(66, "Machop",
            "Entrena constantemente para aumentar su fuerza. Puede levantar objetos mucho más pesados que él con sorprendente facilidad.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(67, "Machoke",
            "Su musculatura es tan poderosa que debe usar un cinturón especial para limitar su fuerza. Ayuda a realizar trabajos pesados.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(68, "Machamp",
            "Sus cuatro brazos le permiten atacar con múltiples golpes simultáneos. Puede ejecutar movimientos precisos incluso a gran velocidad.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(69, "Bellsprout",
            "Su cuerpo flexible le permite esquivar ataques con facilidad. Atrae a sus presas con un dulzor antes de atraparlas.",
            PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(70, "Weepinbell",
            "Aunque parece lento, puede colgarse de ramas para atacar por sorpresa. Produce un ácido que disuelve casi cualquier cosa.",
            PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(71, "Victreebel",
            "Su aroma dulce atrae a las presas hacia su cavidad interna. Usa lianas para capturar objetos o enemigos distraídos.",
            PokemonType.PLANTA, PokemonType.VENENO, 0
        ),

        Pokemon(72, "Tentacool",
            "Su cuerpo gelatinoso es casi transparente bajo el agua. Sus tentáculos contienen toxinas que pueden causar parálisis.",
            PokemonType.AGUA, PokemonType.VENENO, 0
        ),

        Pokemon(73, "Tentacruel",
            "Sus tentáculos se extienden enormemente al atacar. Puede inundar un área con una lluvia de toxinas para defenderse.",
            PokemonType.AGUA, PokemonType.VENENO, 0
        ),

        Pokemon(74, "Geodude",
            "Se confunde a menudo con una roca común. Aunque parece estático, puede rodar cuesta abajo para embestir a sus enemigos.",
            PokemonType.ROCA, PokemonType.TIERRA, 0
        ),

        Pokemon(75, "Graveler",
            "Rueda colina abajo sin preocuparse por lo que destruye en el camino. Para escalar montañas, usa sus cuatro extremidades.",
            PokemonType.ROCA, PokemonType.TIERRA, 0
        ),

        Pokemon(76, "Golem",
            "Su cuerpo de roca es extremadamente duro y pesado. Cuando rueda, nada puede detenerlo y puede causar auténticos temblores al impactar.",
            PokemonType.ROCA, PokemonType.TIERRA, 0
        ),

        Pokemon(77, "Ponyta",
            "Sus patas son fuertes desde muy joven y gana velocidad rápidamente al entrenar. Las llamas de su crin arden más intensamente cuando corre.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(78, "Rapidash",
            "Corre con tanta elegancia que parece flotar sobre el suelo. Puede alcanzar velocidades sorprendentes cuando confía en su entrenador.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(79, "Slowpoke",
            "Su reacción es tan lenta que a veces olvida lo que estaba haciendo. Sin embargo, es sorprendentemente resistente al dolor.",
            PokemonType.AGUA, PokemonType.PSIQUICO, 0
        ),

        Pokemon(80, "Slowbro",
            "Al ser mordido por un Shellder, su poder aumentó. Su relación simbiótica le permite usar habilidades psíquicas de manera más estable.",
            PokemonType.AGUA, PokemonType.PSIQUICO, 0
        ),

        Pokemon(81, "Magnemite",
            "Se mantiene flotando gracias a la energía electromagnética. A menudo causa interferencias en aparatos electrónicos cuando se acerca.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(82, "Magneton",
            "Tres Magnemite unidos generan campos magnéticos más potentes. Su presencia puede alterar brújulas y sistemas eléctricos enteros.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(83, "Farfetch'd",
            "Siempre lleva un puerro que usa como arma y herramienta. Es muy territorial y protege su planta con verdadero orgullo.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(84, "Doduo",
            "Sus dos cabezas coordinan sus movimientos perfectamente. Ambas pueden turnarse para dormir mientras la otra vigila.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(85, "Dodrio",
            "La tercera cabeza aumenta su agilidad y capacidad de reacción. Puede correr a gran velocidad sin perder el equilibrio.",
            PokemonType.NORMAL, PokemonType.VOLADOR, 0
        ),

        Pokemon(86, "Seel",
            "Adora el frío y se desliza con gracia por el hielo. A pesar de su aspecto torpe en tierra, en el agua es un nadador experto.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(87, "Dewgong",
            "Su cuerpo resiste temperaturas extremadamente bajas. Nada con tal armonía que puede recorrer largas distancias sin fatigarse.",
            PokemonType.AGUA, PokemonType.HIELO, 0
        ),

        Pokemon(88, "Grimer",
            "Compuesto de lodo tóxico, deja un rastro contaminado a su paso. Se alimenta de residuos y lugares contaminados.",
            PokemonType.VENENO, null, 0
        ),

        Pokemon(89, "Muk",
            "Su hedor es tan fuerte que puede hacer desmayar a un enemigo. Su cuerpo viscoso absorbe cualquier sustancia en la que se posa.",
            PokemonType.VENENO, null, 0
        ),

        Pokemon(90, "Shellder",
            "Su concha es extremadamente resistente. Si se siente amenazado, se cierra de golpe, atrapando a posibles atacantes dentro.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(91, "Cloyster",
            "Su interior es casi imposible de ver, incluso para expertos. Puede lanzar espinas de su concha con una precisión aterradora.",
            PokemonType.AGUA, PokemonType.HIELO, 0
        ),

        Pokemon(92, "Gastly",
            "Se compone casi por completo de gas venenoso. Puede atravesar muros y desaparecer en el aire cuando se siente en peligro.",
            PokemonType.FANTASMA, PokemonType.VENENO, 0
        ),

        Pokemon(93, "Haunter",
            "Su risa puede helar la sangre incluso del más valiente. Le gusta acechar en la oscuridad y paralizar con su toque helado.",
            PokemonType.FANTASMA, PokemonType.VENENO, 0
        ),

        Pokemon(94, "Gengar",
            "Preferido por las sombras, aparece detrás de sus víctimas sin que se den cuenta. Disfruta jugando bromas que pueden resultar peligrosas.",
            PokemonType.FANTASMA, PokemonType.VENENO, 0
        ),

        Pokemon(95, "Onix",
            "Su cuerpo rocoso serpentea bajo tierra a gran velocidad. A medida que envejece, sus rocas se endurecen hasta volverse como diamante.",
            PokemonType.ROCA, PokemonType.TIERRA, 0
        ),

        Pokemon(96, "Drowzee",
            "Induce sueños en los humanos para alimentarse de ellos. Se dice que puede identificar la pureza de un sueño por su sabor.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(97, "Hypno",
            "Utiliza su péndulo para hipnotizar con precisión. Controla sueños y emociones, pudiendo inducir estados profundos de trance.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(98, "Krabby",
            "Se desplaza lateralmente usando sus fuertes pinzas para defenderse. Se le encuentra con frecuencia en playas y orillas de ríos.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(99, "Kingler",
            "Su pinza mayor es extremadamente poderosa, capaz de aplastar metales. Aunque pesada, la usa con una fuerza impresionante.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(100, "Voltorb",
            "Su apariencia similar a una Poké Ball ha causado muchos sustos. Acumula energía interna y puede estallar si se sobresalta.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(101, "Electrode",
            "Acumula grandes cantidades de energía eléctrica en su interior. Es tan inestable que puede explotar ante el más mínimo estímulo.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(102, "Exeggcute",
            "Un conjunto de seis organismos que piensan como una unidad. Se comunican entre sí telepáticamente y se reorganizan sin perder coordinación.",
            PokemonType.PLANTA, PokemonType.PSIQUICO, 0
        ),

        Pokemon(103, "Exeggutor",
            "Cada una de sus cabezas piensa de forma independiente, pero cooperan para usar poderosas habilidades psíquicas. Disfruta de la luz solar intensa.",
            PokemonType.PLANTA, PokemonType.PSIQUICO, 0
        ),

        Pokemon(104, "Cubone",
            "Lleva siempre el cráneo de su madre como casco. Su llanto nocturno es capaz de conmover incluso a los entrenadores más rudos.",
            PokemonType.TIERRA, null, 0
        ),

        Pokemon(105, "Marowak",
            "Ha superado su tristeza y se ha vuelto más fuerte. Maneja su hueso con gran habilidad, empleándolo como arma en combate.",
            PokemonType.TIERRA, null, 0
        ),

        Pokemon(106, "Hitmonlee",
            "Sus piernas pueden estirarse para alcanzar a sus enemigos desde lejos. Cada paso está calculado para maximizar la fuerza del impacto.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(107, "Hitmonchan",
            "Sus puñetazos son tan veloces que cortan el aire. Entrena constantemente para perfeccionar su técnica y control.",
            PokemonType.LUCHA, null, 0
        ),

        Pokemon(108, "Lickitung",
            "Su larga lengua puede alcanzar cualquier punto de su cuerpo. Explora el entorno lamiendo objetos para reconocerlos.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(109, "Koffing",
            "Contiene gases tóxicos que flotan en su interior. Se eleva gracias a estos mismos gases, que escapan cuando se agita.",
            PokemonType.VENENO, null, 0
        ),

        Pokemon(110, "Weezing",
            "Dos Koffing fusionados comparten gases internos extremadamente corrosivos. Se alimenta de desechos, purificando el aire a su manera.",
            PokemonType.VENENO, null, 0
        ),

        Pokemon(111, "Rhyhorn",
            "Corre en línea recta sin detenerse, derribando todo a su paso. Su piel dura le permite resistir impactos de gran violencia.",
            PokemonType.TIERRA, PokemonType.ROCA, 0
        ),

        Pokemon(112, "Rhydon",
            "Se mantiene erguido, aumentando su precisión al atacar. Su cuerno puede perforar incluso acero sólido.",
            PokemonType.TIERRA, PokemonType.ROCA, 0
        ),

        Pokemon(113, "Chansey",
            "Sus huevos nutritivos pueden sanar a quien los coma. Es amable y dedica gran parte de su tiempo a ayudar a los heridos.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(114, "Tangela",
            "Su cuerpo está envuelto en lianas azules que crecen constantemente. Incluso si pierde algunas, vuelven a brotar rápidamente.",
            PokemonType.PLANTA, null, 0
        ),

        Pokemon(115, "Kangaskhan",
            "Protege ferozmente a su cría, que lleva en su bolsa ventral. Aunque pacífico, no dudará en luchar si alguien amenaza a su pequeño.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(116, "Horsea",
            "Se impulsa expulsando agua por la boca con gran precisión. Suele esconderse en los corales para evitar a los depredadores.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(117, "Seadra",
            "Su temperamento es más arisco y venenoso. Se oculta entre algas y dispara chorros de agua a quienes se acercan demasiado.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(118, "Goldeen",
            "Sus aletas ondulan con la gracia de un vestido al bailar. Nada con movimientos elegantes que ocultan su fuerza real.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(119, "Seaking",
            "Cada otoño cava madrigueras en los ríos para aparearse. Es respetado por su vigor y su capacidad de nado contra corrientes fuertes.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(120, "Staryu",
            "Si pierde un brazo, lo regenera con facilidad. Su núcleo brillante parpadea con un ritmo similar al de un corazón.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(121, "Starmie",
            "Su núcleo emite una energía misteriosa que se usa en investigaciones. Puede comunicarse a través de impulsos electromagnéticos.",
            PokemonType.AGUA, PokemonType.PSIQUICO, 0
        ),

        Pokemon(122, "Mr. Mime",
            "Crea barreras invisibles agitanto sus manos como si manipulara el aire. Imita gestos para comunicarse y desconcertar a sus enemigos.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(123, "Scyther",
            "Sus guadañas brillantes cortan el aire con un zumbido feroz. Se mueve tan rápido que a veces parece haberse duplicado.",
            PokemonType.BICHO, PokemonType.VOLADOR, 0
        ),

        Pokemon(124, "Jynx",
            "Se expresa mediante movimientos rítmicos que parecen un baile. Su toque puede producir escalofríos intensos.",
            PokemonType.HIELO, PokemonType.PSIQUICO, 0
        ),

        Pokemon(125, "Electabuzz",
            "Absorbe energía eléctrica de tormentas y postes de luz. Su cuerpo emite un zumbido permanente debido a la electricidad interna.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(126, "Magmar",
            "Su cuerpo arde a temperaturas extremas, creando un aire distorsionado a su alrededor. Habita en cráteres volcánicos y expulsa llamaradas para marcar su territorio.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(127, "Pinsir",
            "Sus enormes pinzas pueden partir árboles por la mitad. Aunque no tiene alas, salta con fuerza para sujetar a sus presas con un agarre implacable.",
            PokemonType.BICHO, null, 0
        ),

        Pokemon(128, "Tauros",
            "Cuando se enfurece, embiste sin pensarlo dos veces. Sus tres colas se agitan constantemente, aumentando su ímpetu al correr.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(129, "Magikarp",
            "Es un nadador débil y vulnerable, pero increíblemente resistente. Su capacidad para sobrevivir en entornos hostiles es sorprendente.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(130, "Gyarados",
            "Se transforma en una criatura feroz cuando evoluciona. Su temperamento destructivo y su poder descomunal pueden arrasar ciudades enteras.",
            PokemonType.AGUA, PokemonType.VOLADOR, 0
        ),

        Pokemon(131, "Lapras",
            "De temperamento amable, transporta a viajeros sobre su lomo. Su inteligencia le permite comprender el habla humana con facilidad.",
            PokemonType.AGUA, PokemonType.HIELO, 0
        ),

        Pokemon(132, "Ditto",
            "Puede copiar la forma y habilidades de cualquier Pokémon que vea. Aunque su transformación no siempre es perfecta, aprende tras varios intentos.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(133, "Eevee",
            "Su inestable composición genética le permite evolucionar de múltiples maneras. Es curioso y se adapta rápidamente a distintos entornos.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(134, "Vaporeon",
            "Su cuerpo se mezcla con el agua al nadar, volviéndose casi invisible. Puede manipular moléculas de agua para ocultarse o atacar.",
            PokemonType.AGUA, null, 0
        ),

        Pokemon(135, "Jolteon",
            "Genera electricidad estática que eriza su pelaje. Al correr, puede disparar descargas que paralizan a sus oponentes.",
            PokemonType.ELECTRICO, null, 0
        ),

        Pokemon(136, "Flareon",
            "Almacena calor en su interior, elevando su temperatura corporal hasta niveles extremos. Exhala llamas intensas cuando se emociona.",
            PokemonType.FUEGO, null, 0
        ),

        Pokemon(137, "Porygon",
            "Creado mediante avanzada tecnología, puede convertir su cuerpo en datos. Se desplaza libremente a través de sistemas digitales.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(138, "Omanyte",
            "Un antiguo Pokémon revivido de un fósil. Se desplaza usando sus tentáculos y se enrosca dentro de su concha cuando se siente amenazado.",
            PokemonType.ROCA, PokemonType.AGUA, 0
        ),

        Pokemon(139, "Omastar",
            "Sus tentáculos son fuertes y flexibles, capaces de sujetar firmemente a sus presas. La dureza de su caparazón lo protegerá de casi cualquier ataque.",
            PokemonType.ROCA, PokemonType.AGUA, 0
        ),

        Pokemon(140, "Kabuto",
            "Revive de fósiles marinos y se esconde bajo la arena. Su caparazón duro lo protege, pero sigue siendo ágil en el agua.",
            PokemonType.ROCA, PokemonType.AGUA, 0
        ),

        Pokemon(141, "Kabutops",
            "Depredador veloz que usaba sus afiladas cuchillas para cortar a sus presas. Nada rápidamente persiguiendo objetivos bajo el agua.",
            PokemonType.ROCA, PokemonType.AGUA, 0
        ),

        Pokemon(142, "Aerodactyl",
            "Un antiguo Pokémon volador de carácter salvaje. Su rugido hacía temblar a sus presas antes de lanzarse en picado desde el cielo.",
            PokemonType.ROCA, PokemonType.VOLADOR, 0
        ),

        Pokemon(143, "Snorlax",
            "Pasa la mayor parte del tiempo durmiendo. Cuando despierta, necesita comer grandes cantidades de comida antes de volver a descansar.",
            PokemonType.NORMAL, null, 0
        ),

        Pokemon(144, "Articuno",
            "Controla el frío con gracia majestuosa. Donde bate sus alas, el aire se congela al instante, creando cristales de hielo en el ambiente.",
            PokemonType.HIELO, PokemonType.VOLADOR, 0
        ),

        Pokemon(145, "Zapdos",
            "Aparece durante tormentas intensas, absorbiendo electricidad del ambiente. Sus alas crean estruendos que retumban como truenos.",
            PokemonType.ELECTRICO, PokemonType.VOLADOR, 0
        ),

        Pokemon(146, "Moltres",
            "Su cuerpo llameante ilumina el cielo nocturno. Se dice que renace al sumergirse en volcanes cuando sus llamas se debilitan.",
            PokemonType.FUEGO, PokemonType.VOLADOR, 0
        ),

        Pokemon(147, "Dratini",
            "Vive en lo más profundo de lagos y ríos caudalosos. Su piel se muda con frecuencia debido a la energía interior que aún no controla.",
            PokemonType.DRAGON, null, 0
        ),

        Pokemon(148, "Dragonair",
            "Su cuerpo emite una energía misteriosa capaz de alterar el clima. La perla de su cuello brilla cuando su poder aumenta.",
            PokemonType.DRAGON, null, 0
        ),

        Pokemon(149, "Dragonite",
            "A pesar de su aspecto imponente, es amable y protector. Puede volar grandes distancias en un instante, recorriendo mares enteros.",
            PokemonType.DRAGON, PokemonType.VOLADOR, 0
        ),

        Pokemon(150, "Mewtwo",
            "Creado mediante manipulación genética, posee uno de los poderes psíquicos más devastadores. Su soledad lo vuelve distante y difícil de comprender.",
            PokemonType.PSIQUICO, null, 0
        ),

        Pokemon(151, "Mew",
            "Un Pokémon misterioso con la capacidad de aprender casi cualquier técnica. Su comportamiento juguetón contrasta con el poder que oculta.",
            PokemonType.PSIQUICO, null, 0
        )
    )

    fun getAll(): List<Pokemon> = pokemons
    fun getById(id: Int): Pokemon? = pokemons.find {it.id == id}
    fun getByType(type: PokemonType): List<Pokemon> = pokemons.filter { it.tipoPrincipal == type || it.tipoSecundario == type }
}