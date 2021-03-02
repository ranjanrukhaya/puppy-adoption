package com.grace.puppyadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.grace.puppyadoption.view.DetailPage
import com.grace.puppyadoption.view.HomePage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home_page"
    ) {
        composable("home_page") {
            HomePage(navController = navController)
        }
        composable(
            "detail_page/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        )
        {
            DetailPage(navController = navController, puppyId = it.arguments?.getInt("id") ?: 0)
        }
    }
}