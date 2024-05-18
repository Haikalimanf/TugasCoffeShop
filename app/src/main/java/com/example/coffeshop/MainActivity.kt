package com.example.coffeshop

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeshop.ui.ScreenLoginApp
import com.example.coffeshop.ui.theme.CoffeShopTheme

val primaryColor = Color(0xFFC67C4E)

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
                    ScreenLoginApp(
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

@Preview(showBackground = true)
@Composable
fun CoffeShopPreview() {
    CoffeShopTheme {
        ScreenLoginApp(
            onClick = { /* Preview button click */ }
            )
    }
}