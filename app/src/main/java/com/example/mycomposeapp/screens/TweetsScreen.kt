package com.example.mycomposeapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mycomposeapp.models.TweetsListItem
import com.example.mycomposeapp.viewModels.TweetsViewModel

@Composable
fun TweetsScreen() {
    val viewModel: TweetsViewModel = hiltViewModel()
    val tweets = viewModel.tweetsList.collectAsState()
    var list = mutableListOf<TweetsListItem>()

    if(tweets.value.isEmpty()){
        list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
        list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
        list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
        list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))

    }else{
        list.addAll(tweets.value)
    }

    LazyColumn(modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(16.dp)) {
        items(tweets.value) {
            tweetView(it)
        }
    }
}

@Composable
fun tweetView(item: TweetsListItem) {
    Card(
        modifier = Modifier
            .padding(all = 4.dp)
            .border(2.dp, Color.Gray)
    ) {
        Text(item.text)
    }
}
/* @Preview
 @Composable
 fun previe(){
     var list = mutableListOf<TweetsListItem>()
     list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
     list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
     list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
     list.add(TweetsListItem("motivation","When motivation wavers, remember why you started and let your passion reignite the fire within \uD83D\uDD25❤️"))
     TweetsScreen(list)
 }*/