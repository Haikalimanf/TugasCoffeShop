@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.coffeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeshop.ui.component.TypeCoffe
import com.example.coffeshop.ui.theme.CoffeShopTheme

class HomePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeShopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                    AllElement()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Image(
        painter = painterResource(id = R.drawable.bg2),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun AllElement(){
    Column(
        modifier = Modifier
            .padding(top = 30.dp)
    ) {
        UserApp()
        SearchCoffe()
        Banner()
        TypeCoffe()
        AllProduct()
        NavBar()
    }
}

@Composable
fun LocationUserApp(){
Column(
) {
    Text(
        text = "Location",
        fontSize = 12.sp,
        textAlign = TextAlign.Center,
        color = Color.White,
        modifier = Modifier
            .padding(start = 30.dp, top = 30.dp)
    )
    Text(
        text = "Bilzen, Tanjungbalai",
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchCoffe() {
    val textValue = remember {
        mutableStateOf("")
    }
    val colorPrimary = colorResource(id = androidx.core.R.color.androidx_core_secondary_text_default_material_light)
    Box {
        OutlinedTextField(
            value = textValue.value,
            onValueChange = {
                textValue.value = it
            },
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(
                    text = "Search Coffe",
                    color = Color.DarkGray,
                    modifier = Modifier
                        .padding(start = 30.dp)
                )
            },
            modifier = Modifier
                .padding(top = 20.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth()
        )
        Image(
            painter = painterResource(
                id = R.drawable.searchicon),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 45.dp, start = 45.dp)
                    .size(20.dp)

        )
        Image(
            painter = painterResource(
                id = R.drawable.settingframe),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 33.dp, start = 312.dp)
                .size(45.dp)
        )
    }
}

@Composable
fun Banner(){
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .height(150.dp)
        )
    }

}




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

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavBar(){
    var selectedItemIndex by remember {
        mutableStateOf(0)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoffeShopTheme {
        HomeScreen()
        AllElement()
    }
}