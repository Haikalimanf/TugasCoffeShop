package com.example.coffeshop.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TypeCoffe() {
    val textValue = remember {
        mutableStateOf(0)
    }
    val tabs = listOf("Cappucino", "Machiato", "Latte", "Americano")
    val customColor = Color(0xFFC67C4E)
    LazyRow {
        items(tabs.size) { index ->
            val isSelected = textValue.value == index
            val buttonColor = if (isSelected) customColor else Color.White
            val textColor = if (isSelected) Color.White else Color.Black
            Button(
                onClick = {
                    textValue.value = index
                },
                colors = ButtonDefaults.buttonColors(buttonColor),
                modifier = Modifier
                    .padding(start = 30.dp, top = 15.dp)
            ) {
                Text(
                    text = tabs[index],
                    color = textColor
                )
            }
        }
    }
}