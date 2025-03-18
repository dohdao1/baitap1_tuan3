package com.example.baitap1_tuan3.ui.theme.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.baitap1_tuan3.ui.theme.navigation.Screen

data class UIcomponent(val ten:String, val mota:String)

@Composable
fun ComponentListScreen(navController:NavController){
    val components = listOf(
        UIcomponent("Text","Hiển thị chữ"),
        UIcomponent("Image","Hiển thị hình ảnh"),
        UIcomponent("TextField","Nhập văn bản"),
        UIcomponent("PasswordField","Nhập mật khẩu"),
        UIcomponent("Column","Hienr thị đối tượng theo cột"),
        UIcomponent("Row","Hienr thị đối tượng theo hàng")
    )
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("UI Components List", modifier = Modifier.padding(20.dp))
        LazyColumn {
            items (components) { component ->
                Card(
                    modifier = Modifier.fillMaxSize().padding(8.dp).clickable { navController.navigate(
                        Screen.ComponentDetail.route) }) {
                    Column (modifier = Modifier.padding(16.dp)){
                        Text(text = component.ten)
                        Text(text = component.mota)
                    }
                }
            }
        }
    }
}