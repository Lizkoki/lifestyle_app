package com.jdk.lifestyleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jdk.lifestyleapp.ui.theme.LifestyleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LifestyleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeMenu()
                }
            }
        }
    }
}

@Composable
fun HomeMenu(){
    Column{
        Text(
            text = "Lifestyle App",
            color = Color.Green,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )
        
    Row( modifier = Modifier
        .fillMaxWidth(),
       // .background(Color.Cyan),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
        ){
        Button(onClick = { /*TODO*/ })
        {
            Text(text = "Daily Bible")
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Devotional")
        }
    }

    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically

    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Meal Plan")
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Natural")
        }

    }

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Workout")
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Poems")
        }

    }

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Daily Quotes")
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Book Club")
        }
    }



    }

}


@Preview(showBackground = true)
@Composable
fun HomeMenuPreview() {
    LifestyleAppTheme {
        HomeMenu()
    }
}