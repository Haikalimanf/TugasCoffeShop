package com.example.coffeshop.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeshop.R

@Composable
fun LocationUserApp(){
    Column(
    ) {
        Text(
            text = stringResource(R.string.location),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .padding(start = 30.dp, top = 30.dp)
        )
        Text(
            text = stringResource(R.string.spesifik_location),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 30.dp)
        )
    }
}

@Composable
fun UserApp(){
    Row {
        LocationUserApp()
        Image(painter = painterResource(id = R.drawable.arrow),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 50.dp, start = 5.dp)
                .size(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.imageuser),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(start = 140.dp, top = 30.dp)
                .size(40.dp)
        )
    }
}