package com.unsadanpbt.recompositionapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.unsadanpbt.recompositionapp.components.PrimaryButton
import com.unsadanpbt.recompositionapp.components.ProductList
import com.unsadanpbt.recompositionapp.components.SearchBar
import com.unsadanpbt.recompositionapp.data.repository.ProductRepository

@Composable
fun HomeScreen(
    navController: NavController
) {

    var search by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            SearchBar(
                value = search,
                onValueChange = {
                    search = it
                },
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            PrimaryButton(
                text = "Buscar",
                onClick = {},
                modifier = Modifier.wrapContentWidth()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        ProductList(
            productos = ProductRepository.getProducts(),
            navController = navController
        )
    }
}