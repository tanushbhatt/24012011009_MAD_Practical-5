package com.example.a24012011009_mad_practical_5
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(context: MainActivity) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(context, navController = navController)
        }
        composable("register") {
            RegisterScreen(context, navController = navController)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AppNavigationPreview() {

}