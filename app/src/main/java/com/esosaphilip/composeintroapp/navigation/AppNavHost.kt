package com.esosaphilip.composeintroapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.esosaphilip.composeintroapp.screencounter.CounterScreen
import com.esosaphilip.composeintroapp.screencounter.CounterViewModel


@Composable
fun MyAppNav(
    navController: NavHostController,

    ) {
    //val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "counter") {
        composable("counter") { CounterScreen(viewModel = CounterViewModel()) }
        composable("friendslist") {
        //FriendsList(/*...*/)
        }
    }


}