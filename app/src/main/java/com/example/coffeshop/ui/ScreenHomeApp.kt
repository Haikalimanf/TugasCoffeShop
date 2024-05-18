package com.example.coffeshop.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coffeshop.ui.component.AllProduct
import com.example.coffeshop.ui.component.BackgroundHomeScreen
import com.example.coffeshop.ui.component.Banner
import com.example.coffeshop.ui.component.ButtonTypeCoffe
import com.example.coffeshop.ui.component.SearchCoffe
import com.example.coffeshop.ui.component.UserApp

@Composable
fun ScreenHomeApp(){
    Box {
        BackgroundHomeScreen()
        Column(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {
            UserApp()
            SearchCoffe()
            Banner()
            ButtonTypeCoffe()
            AllProduct()
        }
    }
}