package com.unsadanpbt.recompositionapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(

    primary = GreenPrimary,
    secondary = GreenLight,
    tertiary = GreenDark,

    background = CreamWhite,
    surface = Color.White,

    onPrimary = Color.White,
    onBackground = TextDark,
    onSurface = TextDark
)

@Composable
fun RecompositionAppTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}