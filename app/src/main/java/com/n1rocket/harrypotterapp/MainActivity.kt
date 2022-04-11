package com.n1rocket.harrypotterapp

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.n1rocket.harrypotterapp.model.HouseType
import com.n1rocket.harrypotterapp.ui.theme.HarryPotterAppTheme

class MainActivity : ComponentActivity() {

    val houses: List<HouseType> = listOf(
        HouseType.Gryffindor,
        HouseType.Slytherin,
        HouseType.Hufflepuff,
        HouseType.Ravenclaw,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(houses)
        }
    }
}

@Composable
fun App(houses: List<HouseType>) {
    HarryPotterAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LazyRow {
                items(items = houses) { item ->
                    House(item)
                }
            }
        }
    }
}

@Composable
fun House(house: HouseType) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(house.logo),
            contentDescription = house.name,
            modifier = Modifier.size(250.dp)
                .background(colorResource(house.color))
        )

        Text(text = house.name)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val houses: List<HouseType> = listOf(
        HouseType.Gryffindor,
        HouseType.Slytherin,
        HouseType.Hufflepuff,
        HouseType.Ravenclaw,
    )

    App(houses)
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkPreview() {
    val houses: List<HouseType> = listOf(
        HouseType.Gryffindor,
        HouseType.Slytherin,
        HouseType.Hufflepuff,
        HouseType.Ravenclaw,
        HouseType.Slytherin,
        HouseType.Hufflepuff,
        HouseType.Ravenclaw,
    )

    App(houses)
}