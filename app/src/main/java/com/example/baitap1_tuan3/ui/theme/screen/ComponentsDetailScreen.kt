package com.example.baitap1_tuan3.ui.theme.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComponentDetailScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Text Detail", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("The quick", fontSize = 18.sp)
        Text("Brown", fontSize = 18.sp, color = androidx.compose.ui.graphics.Color(0xFF8B4513))
        Text("fox jumps", fontSize = 18.sp)
        Text("over", fontSize = 18.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
        Text("the", fontSize = 18.sp)
        Text("lazy", fontSize = 18.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic)
        Text("dog.", fontSize = 18.sp)
    }
}