package com.example.coffeshop.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeshop.R

@Composable
fun InfoCard(
) {
    Row {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.kopi1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(130.dp)
            )
            Text(
                text = "Cappucino",
                modifier = Modifier.padding(top = 10.dp),
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.black),
                fontSize = 18.sp
            )
            Text(
                text = "With Chocolate",
                modifier = Modifier.padding(top = 4.dp),
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                fontSize = 14.sp
            )
            Row(
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
                    .height(40.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "$4.53",
                    modifier = Modifier.align(Alignment.CenterVertically),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.black)
                )
                Image(
                    painter = painterResource(id = R.drawable.icontambah),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxHeight()
                        .size(80.dp)
                        .padding(start = 20.dp)
                )
            }
        }
    }
}

@Composable
fun AllProduct(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            items(2){
                InfoCard()
                Spacer(modifier = Modifier.width(14.dp))
            }
        }
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            items(2){
                InfoCard()
                Spacer(modifier = Modifier.width(14.dp))
            }
        }
    }
}