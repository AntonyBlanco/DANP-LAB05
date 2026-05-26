package com.unsadanpbt.recompositionapp.singleton

import com.unsadanpbt.recompositionapp.data.entities.Product

object AppSingleton {
    val carrito = mutableListOf<Product>()
}