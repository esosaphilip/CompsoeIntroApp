package com.esosaphilip.composeintroapp.screencounter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.esosaphilip.composeintroapp.ui.theme.ComposeIntroAppTheme

@Composable
fun CounterScreen(
    viewModel: CounterViewModel,


){
Box(modifier = Modifier
    .fillMaxSize()
    .fillMaxWidth()
    .background(color = Color.Gray),
    contentAlignment = Alignment.Center
){

    CounterCard( counterState = viewModel.counter.value, onClick = { viewModel.inc() }, onFlick = { viewModel.dnc() })
}
}




@Composable
fun CounterCard(
    counterState: Int,
    onClick: () -> Unit,
    onFlick: () -> Unit
){


    //val counterState = counterViewModel.counter.value
        Card(
          modifier = Modifier
              .background(color = Color.White)
              .padding(start = 10.dp, end = 10.dp)
              .fillMaxWidth()
              .height(200.dp),

            elevation = CardDefaults.cardElevation(defaultElevation = 30.dp),



        ) {
            Column(
                modifier = Modifier.padding(start = 50.dp, top = 50.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "$counterState", textAlign = TextAlign.Center )
                Spacer(modifier = Modifier.padding(10.dp))
                Row {
                    Button(onClick = onClick) {
                        Text(text = "Increment")
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = onFlick) {
                        Text(text = "Decrement")
                    }
                }
            }

        }


}

@Preview
@Composable
fun CounterPreview(){
    ComposeIntroAppTheme {
       CounterScreen(viewModel = CounterViewModel())
    }
}

