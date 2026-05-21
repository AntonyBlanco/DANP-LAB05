package com.unsadanpbt.recompositionapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.unsadanpbt.recompositionapp.screens.*

@Composable
fun AppNavigation(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Routes.home_screen
    ) {

        composable(Routes.home_screen) {
            HomeScreen(navController)
        }

        composable(
            "${Routes.productdetail_screen}/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {

            val id = it.arguments?.getInt("id") ?: 0

            ProductDetailScreen(id)
        }

        composable(Routes.cart_screen) {
            CartScreen(navController)
        }

        composable(Routes.extra_screen) {
            CheckoutScreen()
        }
    }
}