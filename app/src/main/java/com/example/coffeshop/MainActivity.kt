package com.example.coffeshop

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeshop.ui.theme.CoffeShopTheme

val customColor = Color(0xFFC67C4E)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeShopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Coffee so good, your taste buds will love it.",
                        message2 = "The best grain, the finest roast, the powerful flavor.",
                        onClick = {
                            val navigate = Intent(this@MainActivity, HomePage::class.java)
                            startActivity(navigate)
                        }
                        )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, message2 : String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 34.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = message2,
            fontSize = 14.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 35.dp)
        )
    }
}

@Composable
fun GreetingImage(message: String, message2 : String,onClick: () -> Unit,modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.coffeimage)
    Box(
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxSize()
        )
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(customColor),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .height(100.dp)
                .padding(bottom = 30.dp)
                .width(320.dp)
        ) {
            Text(
                text = "Get Started",
                fontWeight = FontWeight.Bold,
            )
        }
        GreetingText(
            message = message,
            message2 = message2,
            modifier = Modifier
                .padding(horizontal = 45.dp)
                .padding(bottom = 130.dp)
                .align(Alignment.BottomCenter)

            )
    }
}

@Preview(showBackground = true)
@Composable
fun CoffeShopPreview() {
    CoffeShopTheme {
        GreetingImage(message = "Coffee so good, your taste buds will love it.",
            message2 = "The best grain, the finest roast, the powerful flavor.",
            onClick = { /* Preview button click */ }
            )
    }
}