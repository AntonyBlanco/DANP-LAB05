package com.unsadanpbt.recompositionapp.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.unsadanpbt.recompositionapp.screens.HomeScreen

@Composable
fun AppNavigation (
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.home_screen,
        modifier = modifier,

        builder = {
            composable(Routes.home_screen){
                HomeScreen()
            }
            composable(Routes.productdetail_screen){
                //ProductDetailScreen()
            }
            composable(Routes.cart_screen){
                //CartScreen()
            }
            composable(Routes.extra_screen){
                //ExtraScreen()
            }
        }
    )
}