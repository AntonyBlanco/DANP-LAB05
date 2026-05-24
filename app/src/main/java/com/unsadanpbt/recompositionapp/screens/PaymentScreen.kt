package com.unsadanpbt.recompositionapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.unsadanpbt.recompositionapp.navigation.Routes

@Composable
fun PaymentScreen(
    navController: NavController
    ) {
    val cardName = remember { mutableStateOf("") }
    val cardNumber = remember { mutableStateOf("") }
    val expiryDate = remember { mutableStateOf("") }
    val cvv = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F8F2))
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Título de la pantalla
        Text(
            text = "Pago",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2E7D32)
        )
        Text(
            text = "Complete sus fatos de forma segura",
            color = Color.Gray,
            fontSize = 15.sp
        )

        // Tarjeta de Crédito Vista Previa
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF66BB6A),
                                Color(0xFF2E7D32)
                            )
                        )
                    )
                    .padding(24.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // Fila superior de la tarjeta
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "UnsaStyle Bank",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.CreditCard,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }

                    // Número de tarjeta
                    Text(
                        text = if (cardNumber.value.isEmpty()) "**** **** **** 2026" else cardNumber.value,
                        color = Color.White,
                        fontSize = 24.sp,
                        letterSpacing = 2.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    // Fila inferior (Nombre y Expiración)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "CARD HOLDER",
                                color = Color.White.copy(alpha = 0.7f),
                                fontSize = 12.dp.value.sp
                            )
                            Text(
                                text = if (cardName.value.isEmpty()) "Astarte" else cardName.value,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Column {
                            Text(
                                text = "EXPIRA",
                                color = Color.White.copy(alpha = 0.7f),
                                fontSize = 12.dp.value.sp
                            )
                            Text(
                                text = if (expiryDate.value.isEmpty()) "12/28" else expiryDate.value,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }

        // Campos del Formulario
        OutlinedTextField(
            value = cardName.value,
            onValueChange = { cardName.value = it },
            label = { Text("Card Holder") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        )

        OutlinedTextField(
            value = cardNumber.value,
            onValueChange = { cardNumber.value = it },
            label = { Text("Card Number") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedTextField(
                value = expiryDate.value,
                onValueChange = { expiryDate.value = it },
                label = { Text("MM/YY") },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp)
            )
            OutlinedTextField(
                value = cvv.value,
                onValueChange = { cvv.value = it },
                label = { Text("CVV") },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Resumen de la Orden
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
        }

        // Botón de Pago
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { navController.navigate(Routes.extra_screen) },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(18.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF43A047)
            )
        ) {
            Text(
                text = "Pay Now",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}