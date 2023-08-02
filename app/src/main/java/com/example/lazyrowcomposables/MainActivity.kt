package com.example.lazyrowcomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lazyrowcomposables.ui.theme.LazyRowComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRowComposablesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var osList = listOf(
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                        "Android", "IOS", "Linux", "Unix",
                    )
                    PopulateItems(osList)
                }
            }
        }
    }
}

/*
* The lazy options let you out the components when
* they're visible in the widget viewport.
*
* The available list of components includes lazyColumn,
* lazyRow and their grid alternatives.
*
* Lazy composables follow the same set of principles as the RecyclerView
* widget but remove all that annoying boilerplate code.
*
* */

@Composable
fun PopulateItems(osList: List<String>){
    LazyRow(){
        
        item { 
            Text(text = "Horizontal OS Name are populating here.")
        }
        
        items(5){
            Text(text = "items $it")
        }
        
        items(osList){
            Text(text = "$it")
        }
    }
}