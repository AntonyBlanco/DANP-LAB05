package com.unsadanpbt.recompositionapp.singleton

import com.unsadanpbt.recompositionapp.data.entities.Product

object AppSingleton {

    val productos = listOf(

        Product(
            1,
            "Chaqueta Oversize Negra",
            189.90,
            "Chaqueta urbana oversize de algodón premium"
        ),

        Product(
            2,
            "Abrigo Largo Beige",
            249.90,
            "Abrigo elegante ideal para clima frío"
        ),

        Product(
            3,
            "Hoodie Essentials",
            139.90,
            "Sudadera cómoda con diseño minimalista"
        ),

        Product(
            4,
            "Casaca Denim Azul",
            179.90,
            "Casaca jean clásica estilo vintage"
        ),

        Product(
            5,
            "Chaqueta Bomber Verde",
            199.90,
            "Bomber moderna con acabado mate"
        ),

        Product(
            6,
            "Abrigo Coreano Gris",
            289.90,
            "Abrigo largo estilo coreano elegante"
        ),

        Product(
            7,
            "Puffer Jacket Blanca",
            229.90,
            "Chaqueta acolchada ligera y térmica"
        ),

        Product(
            8,
            "Casaca Cuero Negra",
            319.90,
            "Casaca de cuero sintético premium"
        ),

        Product(
            9,
            "Hoodie Anime Edition",
            159.90,
            "Sudadera estampada edición anime"
        ),

        Product(
            10,
            "Chaqueta Streetwear Roja",
            209.90,
            "Chaqueta moderna estilo streetwear"
        )
    )

    val carrito = mutableListOf<Product>()
}