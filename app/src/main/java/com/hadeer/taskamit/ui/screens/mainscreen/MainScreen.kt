package com.hadeer.taskamit.ui.screens.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(viewModel: MainScreenViewModel = hiltViewModel()){
    val list by viewModel.postsList.collectAsState()

    LazyColumn {
        items(list){
            PostItem(title = it.title, content = it.body)
        }
    }

}
@Composable
fun PostItem(title: String, content: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = title,
            color = Color.Blue,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = content,
            color = Color.Black,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Divider(color = Color.Gray, thickness = 1.dp)
        Spacer(modifier = Modifier.height(8.dp))
    }
}