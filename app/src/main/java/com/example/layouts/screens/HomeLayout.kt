package com.example.layouts.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController

@Composable
fun HomeLayout(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.navigate("column")
        }) {
            Text(text = "Column Layout")
        }
        Button(onClick = {
            navController.navigate("row")
        }) {
            Text(text = "Row Layout")
        }
        Button(onClick = {
            navController.navigate("constraint")
        }) {
            Text(text = "Constraint Layout")
        }
        Button(onClick = {
            navController.navigate("box")
        }) {
            Text(text = "Box Layout")
        }
        Button(onClick = {
            navController.navigate("scaffold")
        }) {
            Text(text = "Scaffold Layout")
        }
    }
}