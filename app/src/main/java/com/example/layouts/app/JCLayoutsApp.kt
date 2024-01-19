package com.example.layouts.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.layouts.screens.JCNavigation

@Composable
fun JCLayoutsApp() {
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
        JCNavigation()
    }
}