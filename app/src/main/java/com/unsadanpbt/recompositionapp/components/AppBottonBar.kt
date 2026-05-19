package com.unsadanpbt.recompositionapp.components

// No longer recommended icons, using Material Symbols instead.
// More info https://developer.android.com/jetpack/androidx/releases/compose-material3#1.4.0
//import androidx.compose.material.icons.Icons

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.unsadanpbt.recompositionapp.R

@Composable
fun AppBottonBar () {
    NavigationBar() {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                /*Icon(
                    Icons.Default.Home,
                    contentDescription = null
                )*/
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                /*Icon(
                    Icons.Default.ShoppingCart,
                    contentDescription = null
                )*/
                Icon(
                    painter = painterResource(id = R.drawable.ic_shoppincart),
                    contentDescription = null
                )
            },
            label = {
                Text("Carrito")
            }
        )
    }
}