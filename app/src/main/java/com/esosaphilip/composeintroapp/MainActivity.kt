package com.esosaphilip.composeintroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.esosaphilip.composeintroapp.navigation.MyAppNav
import com.esosaphilip.composeintroapp.ui.theme.ComposeIntroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroAppTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {

                    MyAppNav(navController)
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    ComposeIntroAppTheme {
        val navController = rememberNavController()
       MyAppNav(navController)
    }
}