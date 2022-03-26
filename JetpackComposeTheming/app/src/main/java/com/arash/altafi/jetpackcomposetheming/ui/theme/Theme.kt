package com.arash.altafi.jetpackcomposetheming.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

enum class ThemeType {
    PURPLE,
    RED,
    YELLOW
}

@Composable
fun JetpackComposeThemingTheme(
    colors: Colors,
    content: @Composable() () -> Unit
) {


    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}