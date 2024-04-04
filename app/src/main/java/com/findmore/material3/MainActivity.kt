package com.findmore.material3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.ui.Alignment
import com.findmore.material3.ui.theme.Material3Theme
import androidx.compose.material3.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
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

                        /*  Button(onClick = { }) {
                              Text(text = "Subscribe")
                          }
                          ElevatedButton(onClick = { *//*TODO*//* }) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add to cart",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "add to cart")
                        }
                        FilledTonalButton(onClick = { *//*TODO*//* }) {
                            Text(text = "Open in browser")
                        }
                        OutlinedButton(onClick = { *//*TODO*//* }) {
                            Text(text = "Back")
                        }
                        TextButton(onClick = { *//*TODO*//* }) {
                            Text(text = "Learn More")
                        }*/
                        var filledText by remember {
                            mutableStateOf("")
                        }

                        TextField(value = filledText,
                            onValueChange = { filledText = it },
                            enabled = true,
                            //   readOnly = false,
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            label = {
                                Text(text = "Enter your Weight")
                            },
                            placeholder = {
                                Text(text = "Weight")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "weight"
                                )
                            },
                          /*  trailingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.Person,
                                    contentDescription = "weight"
                                )
                            }, prefix = {
                                Text(text = "$")
                            },*/
                            suffix = {
                                Text(text = "Kg")
                            },
                            supportingText = {
                                Text(text = "required")
                            },
                            isError = false,
                           // visualTransformation = PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next),

                            keyboardActions= KeyboardActions(
                                onNext = {
                                    println("Hello World")
                                }
                            ),
                            singleLine = true,
                            maxLines = 1
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        var outLinedText by remember {
                            mutableStateOf("")
                        }

                        OutlinedTextField(value = outLinedText,
                            onValueChange = { outLinedText = it },
                            enabled = true,
                            //   readOnly = false,
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            label = {
                                Text(text = "Enter your Weight")
                            },
                            placeholder = {
                                Text(text = "Weight")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "weight"
                                )
                            },
                            /*  trailingIcon = {
                                  Icon(
                                      imageVector = Icons.Outlined.Person,
                                      contentDescription = "weight"
                                  )
                              }, prefix = {
                                  Text(text = "$")
                              },*/
                            suffix = {
                                Text(text = "Kg")
                            },
                            supportingText = {
                                Text(text = "required")
                            },
                            isError = false,
                            // visualTransformation = PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next),

                            keyboardActions= KeyboardActions(
                                onNext = {
                                    println("Hello World")
                                }
                            ),
                            singleLine = true,
                            maxLines = 1
                        )


                    }
                }
            }
        }
    }
}
