package com.unsadanpbt.recompositionapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.unsadanpbt.recompositionapp.components.PrimaryButton
import com.unsadanpbt.recompositionapp.components.ProductList
import com.unsadanpbt.recompositionapp.components.SearchBar
import com.unsadanpbt.recompositionapp.singleton.AppSingleton

@Composable
fun HomeScreen () {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        SearchBar(
            value = "Buscar productos",
            onValueChange = {},
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        PrimaryButton(
            text = "Buscar",
            onClick = {},
            modifier = Modifier.wrapContentWidth()
        )
    }
    Spacer(modifier = Modifier.width(16.dp))

    ProductList(
        productos = AppSingleton.productos
    )
}