package com.unsadanpbt.recompositionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.unsadanpbt.recompositionapp.components.AppBottonBar
import com.unsadanpbt.recompositionapp.components.AppTopBar
import com.unsadanpbt.recompositionapp.navigation.AppNavigation
import com.unsadanpbt.recompositionapp.screens.HomeScreen
import com.unsadanpbt.recompositionapp.ui.theme.RecompositionAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecompositionAppTheme {

                val navController = rememberNavController()

                Scaffold(
                    topBar = { AppTopBar() },
                    bottomBar = { AppBottonBar(navController) },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        AppNavigation(navController)
                    }
                }
            }
        }
    }
}


//@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {

    val navController = rememberNavController()
    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { AppBottonBar(navController) },
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            AppNavigation(navController)
        }
    }
}