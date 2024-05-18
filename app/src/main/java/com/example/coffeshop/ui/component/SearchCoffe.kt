package com.example.coffeshop.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchCoffe() {
    val textValue = remember {
        mutableStateOf("")
    }
    val colorPrimary = colorResource(id = R.color.androidx_core_secondary_text_default_material_light)
    Box {
        OutlinedTextField(
            value = textValue.value,
            onValueChange = {
                textValue.value = it
            },
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(
                    text = stringResource(com.example.coffeshop.R.string.search_coffe),
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
                id = com.example.coffeshop.R.drawable.searchicon),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 45.dp, start = 45.dp)
                .size(20.dp)

        )
        Image(
            painter = painterResource(
                id = com.example.coffeshop.R.drawable.settingframe),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 33.dp, start = 312.dp)
                .size(45.dp)
        )
    }
}