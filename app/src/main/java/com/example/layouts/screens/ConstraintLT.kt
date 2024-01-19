package com.example.layouts.screens


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConstraintLT(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Hello Constraint layout")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate("home")
                    }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) {
        ConstraintLayout(
            modifier = Modifier.padding(it).fillMaxWidth()
        ) {
            // Create references for the composable to constrain
            val (button, text) = createRefs()

            Button(
                onClick = { /*TODO*/ },
                // Assign reference "button" to the Button composable
                // and constrain it to the top of the ConstraintLayout
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top, margin = 16.dp)
                }
            ) {
                Text(text = "Button")
            }

            // Assign reference "text" to the Text composable
            // and constrain it to the bottom of the Button composable
            Text(
                text = "Text",
                modifier = Modifier.constrainAs(text) {
                    top.linkTo(parent.bottom, margin = 16.dp)
                }
            )
        }
    }
}