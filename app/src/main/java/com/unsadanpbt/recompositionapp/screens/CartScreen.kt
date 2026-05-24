package com.unsadanpbt.recompositionapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.unsadanpbt.recompositionapp.navigation.Routes
import com.unsadanpbt.recompositionapp.singleton.AppSingleton

@Composable
fun CartScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Carrito de compras",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            items(AppSingleton.carrito) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {

                        Text(it.nombre)

                        Text("S/. ${it.precio}")
                    }
                }
            }
        }

        Button(
            onClick = {
                navController.navigate(Routes.payment_screen)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Continuar compra")
        }
    }
}