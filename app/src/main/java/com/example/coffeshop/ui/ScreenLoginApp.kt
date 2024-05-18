package com.example.coffeshop.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.coffeshop.ui.component.BackgroundLoginPage
import com.example.coffeshop.ui.component.ButtonLogin
import com.example.coffeshop.ui.component.GreetingText

@Composable
fun ScreenLoginApp(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter,

        ) {
        BackgroundLoginPage()
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GreetingText()
            ButtonLogin {
                onClick
            }
        }
    }
}

