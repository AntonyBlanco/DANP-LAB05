package com.unsadanpbt.recompositionapp.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.unsadanpbt.recompositionapp.navigation.Routes
import com.unsadanpbt.recompositionapp.singleton.Product

@Composable
fun ProductList(
    productos: List<Product>,
    navController: NavController
) {

    LazyColumn {

        items(productos) { producto ->

            ProductCard(
                producto = producto,
                onClick = {
                    navController.navigate(
                        "${Routes.productdetail_screen}/${producto.id}"
                    )
                }
            )
        }
    }
}