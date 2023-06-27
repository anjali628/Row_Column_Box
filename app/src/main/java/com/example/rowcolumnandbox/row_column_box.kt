package com.example.rowcolumnandbox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RowLayout() {
    
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(Color.Red)
        /*modifier = Modifier.run {
            background(Color.Red)
            fillMaxWidth()
        }*/
    ){
        Text(text = "One Text")
        Text(text = "Two Text")
        Text(text = "Three Text")
    }
    
}

@Composable
fun ColumnLayout() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {
        Text(text = "One Text")
        Text(text = "Two Text")
        Text(text = "Three Text")
    }
}

@Composable
fun BoxLayout() {
    Box(
        //contentAlignment = Alignment.BottomCenter
    ) {
        Text(text = "One Text", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Two Text", modifier = Modifier.align(Alignment.Center))
        Text(text = "Three Text",modifier = Modifier.align(Alignment.BottomStart))
    }

}