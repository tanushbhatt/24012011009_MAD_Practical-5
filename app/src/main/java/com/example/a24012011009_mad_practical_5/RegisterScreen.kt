
package com.example.a24012011009_mad_practical_5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun RegisterScreen(navController: NavController? = null) {

    var fullName by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    val isDarkTheme = isSystemInDarkTheme()

    val cardColor = if (isDarkTheme) {
        Color(0xFF414352)
    } else {
        Color(0xFFE0E5F5)
    }

    val textColor = MaterialTheme.colorScheme.onSurface

    val buttonColor = if (isDarkTheme) {
        Color(0xFFB2C8FF)
    } else {
        Color(0xFF0757C9)
    }

    val buttonTextColor = if (isDarkTheme) {
        Color(0xFF17396D)
    } else {
        Color.White
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))

        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "GUNI Logo",
            modifier = Modifier
                .height(145.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(8.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 12.dp
            ),
            shape = MaterialTheme.shapes.medium,
            colors = CardDefaults.cardColors(
                containerColor = cardColor
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 14.dp,
                        vertical = 12.dp
                    )
            ) {
                FormField(
                    "Name",
                    fullName,
                    { fullName = it }
                )

                FormField(
                    "Phone Number",
                    phone,
                    { phone = it },
                    isNumber = true
                )

                FormField(
                    "City",
                    city,
                    { city = it }
                )

                FormField(
                    "Email",
                    email,
                    { email = it }
                )

                FormField(
                    "Password",
                    password,
                    { password = it },
                    isPasswordField = true
                )

                FormField(
                    "Confirm Password",
                    confirmPassword,
                    { confirmPassword = it },
                    isPasswordField = true
                )

                Spacer(modifier = Modifier.height(14.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(44.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor,
                        contentColor = buttonTextColor
                    )
                ) {
                    Text(
                        text = "Register",
                        fontSize = 14.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Do you have an account?",
                fontSize = 16.sp,
                color = textColor
            )

            Spacer(modifier = Modifier.width(6.dp))

            TextButton(
                onClick = {
                    navController?.navigate("login")
                }
            ) {
                Text(
                    text = "LOGIN",
                    fontSize = 16.sp,
                    color = Color(0xFFD93A92)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen()
}
