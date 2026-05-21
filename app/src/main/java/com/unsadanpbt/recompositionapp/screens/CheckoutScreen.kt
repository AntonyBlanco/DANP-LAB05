package com.unsadanpbt.recompositionapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Pantalla extra
@Composable
fun CheckoutScreen() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Compra realizada",
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Gracias por comprar en SmartMarket"
            )
        }
    }
}