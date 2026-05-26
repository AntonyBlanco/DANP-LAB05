package com.unsadanpbt.recompositionapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unsadanpbt.recompositionapp.data.repository.ProductRepository
import com.unsadanpbt.recompositionapp.singleton.AppSingleton

@Composable
fun ProductDetailScreen(
    productId: Int
) {

    val producto = ProductRepository.getProducts().find {
        it.id == productId
    }

    producto?.let {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Text(
                text = it.nombre,
                fontSize = 28.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = it.descripcion
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Precio: S/. ${it.precio}",
                fontSize = 22.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    AppSingleton.carrito.add(it)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Agregar al carrito")
            }
        }
    }
}