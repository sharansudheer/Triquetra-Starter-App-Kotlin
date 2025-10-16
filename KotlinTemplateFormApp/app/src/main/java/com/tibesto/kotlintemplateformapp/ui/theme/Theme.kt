package com.tibesto.kotlintemplateformapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.hos_app.ui.theme.md_theme_light_background
import com.example.hos_app.ui.theme.md_theme_light_onPrimary
import com.example.hos_app.ui.theme.md_theme_light_primary

private val LightColors = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    background = md_theme_light_background
)

@Composable
fun SeaGoatTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = HosAppTypography,
        content = content
    )
}
