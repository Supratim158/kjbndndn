package com.example.birthday_card

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthday_card.ui.theme.Birthday_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Birthday_cardTheme {
               GreetingText("Happy Birthday Supratim","-from Sm")
            }
        }
    }
}

@Composable
fun GreetingText(message: String,from: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)){
        Text(text = message,
            fontSize = 95.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 32.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.End)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Birthday_cardTheme {
       GreetingText("Happy Birthday Supratim","-from Sm")
    }
}