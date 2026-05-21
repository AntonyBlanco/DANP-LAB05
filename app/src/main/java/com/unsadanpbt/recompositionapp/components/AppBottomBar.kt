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
import androidx.navigation.NavController
import com.unsadanpbt.recompositionapp.R
import androidx.navigation.compose.currentBackStackEntryAsState
import com.unsadanpbt.recompositionapp.navigation.Routes

@Composable
fun AppBottonBar (
    navController: NavController
) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    NavigationBar() {
        NavigationBarItem(
            selected = currentRoute == Routes.home_screen,
            onClick = {
                navController.navigate(Routes.home_screen) {
                    launchSingleTop = true // Evitar múltiples copias de pantallas(se me crashea el andorid studio :v xd)
                }
            },
            icon = {
                /*Icon(
                    Icons.Default.Home,
                    contentDescription = null
                )*/
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null
                )
            },
            label = {
                Text("Home")
            }
        )
        NavigationBarItem(
            selected = currentRoute == Routes.cart_screen,
            onClick = {
                navController.navigate(Routes.cart_screen) {
                    launchSingleTop = true // Evitar múltiples copias de pantallas
                }
            },
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
                Text("Cart")
            }
        )
    }
}