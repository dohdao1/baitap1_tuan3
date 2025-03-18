package com.example.baitap1_tuan3.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.baitap1_tuan3.ui.theme.navigation.Screen
import com.example.baitap1_tuan3.R

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo"
        )
        Text("Jetpack Compose")
        Text("Jetpack Compose is a modern UI toolkit for building Android applications.")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(Screen.ComponentList.route) }) {
            Text("I'm ready")
        }
    }
}