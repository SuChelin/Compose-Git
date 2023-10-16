package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.ui.theme.TestTheme



@Composable
fun CustomSwith(){
    val cheked = remember{ mutableStateOf(true)}

    Column {
        Switch(
            checked = checked.value,
            onCheckedChange = { checked.value = it}
        )
        if (checked.value){
            Text("Switch on")
        }
        else Text("Switch off")
    }
}




