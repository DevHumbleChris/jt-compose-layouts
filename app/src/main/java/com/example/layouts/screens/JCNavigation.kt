package com.example.layouts.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun JCNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeLayout(navController)
        }
        composable("column") {
            ColumnLayout(navController)
        }
        composable("row") {
            RowLayout(navController)
        }
        composable("constraint") {
            ConstraintLayout(navController)
        }
        composable("box") {
            BoxLayout(navController)
        }
        composable("scaffold") {
            ScaffoldLayout(navController)
        }
    }
}