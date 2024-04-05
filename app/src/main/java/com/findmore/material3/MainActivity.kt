package com.findmore.material3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.ui.Alignment
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.findmore.material3.ui.theme.Material3Theme


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Material3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
                    // val scrollBehavior=TopAppBarDefaults.enterAlwaysScrollBehavior()
                    //   val scrollBehavior=TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
                    Scaffold(
                        modifier = Modifier
                            .fillMaxSize()
                            .nestedScroll(scrollBehavior.nestedScrollConnection),
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(text = "My Notes")

                                },
                                navigationIcon = {
                                    IconButton(onClick = { /*TODO*/ }) {
                                        Icon(
                                            imageVector = Icons.Default.ArrowBack,
                                            contentDescription = "Go Back"
                                        )
                                    }
                                },
                                actions = {
                                    IconButton(onClick = { /*TODO*/ }) {
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Mark as favorite"
                                        )
                                    }
                                    IconButton(onClick = { /*TODO*/ }) {
                                        Icon(
                                            imageVector = Icons.Default.Edit,
                                            contentDescription = "Edit notes "
                                        )
                                    }
                                },
                                scrollBehavior = scrollBehavior
                            )
                        }
                    ) { values ->
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(values)
                        ) {
                            items(100) {
                                Text(
                                    text = "Item$it",
                                    modifier = Modifier.padding(16.dp)
                                )
                            }
                        }
                    }

                }
            }
        }
    }
}
