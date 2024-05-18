package com.example.coffeshop.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.coffeshop.R

@Composable
fun BackgroundHomeScreen(){
    Image(
        painter = painterResource(id = R.drawable.bg2),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun BackgroundLoginPage(){
    Image(
        painter = painterResource(id = R.drawable.coffeimage),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxSize()
    )
}