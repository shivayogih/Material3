package com.findmore.material3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.ui.Alignment
import com.findmore.material3.ui.theme.Material3Theme
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Material3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Button(onClick = { }) {
                            Text(text = "Subscribe")
                        }
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add to cart",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "add to cart")
                        }
                        FilledTonalButton(onClick = { /*TODO*/ }) {
                            Text(text = "Open in browser")
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Back")
                        }
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Learn More")
                        }


                    }
                }
            }
        }
    }
}
