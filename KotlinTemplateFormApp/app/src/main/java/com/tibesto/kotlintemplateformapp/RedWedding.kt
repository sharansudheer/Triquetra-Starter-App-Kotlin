package com.tibesto.kotlintemplateformapp
import com.tibesto.kotlintemplateformapp.presentation.navigation.NavGraph
import com.tibesto.kotlintemplateformapp.ui.theme.SeaGoatTheme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController


@Composable
fun RedWedding() {
    SeaGoatTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            val navController = rememberNavController()
            NavGraph(navController = navController)
        }
    }
}