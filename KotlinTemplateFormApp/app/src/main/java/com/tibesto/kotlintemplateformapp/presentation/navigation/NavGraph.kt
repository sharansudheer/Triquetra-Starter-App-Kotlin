package com.tibesto.kotlintemplateformapp.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tibesto.kotlintemplateformapp.presentation.login.LoginScreen

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "login", modifier = modifier) {
        composable("login") {
            LoginScreen(onLoginSuccess = { /* navigate to home or next screen */ })
        }

        // placeholder home route (optional)
        composable("home") {
            // TODO: create HomeScreen and navigate here after login
        }
    }
}
