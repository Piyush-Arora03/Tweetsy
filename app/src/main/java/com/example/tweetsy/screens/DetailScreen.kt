package com.example.tweetsy.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tweetsy.model.TweetsListItem
import com.example.tweetsy.viewmodel.TweetsViewModel

@Composable
fun TweetsList(modifier: Modifier=Modifier){
    val tweetsViewModel: TweetsViewModel= hiltViewModel()
    val tweets=tweetsViewModel.tweets.collectAsState()
    if(tweets.value.isEmpty()){
        Box(Modifier.fillMaxSize()){
            Text("Loading...",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
    else{
        LazyColumn(modifier=modifier) {
            items(tweets.value){
                TweetsListItem(text = it.tweet)
            }
        }
    }
}

@Composable
fun TweetsListItem(text:String) {
    Card(
        modifier=Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(80.dp),
    ) {
        Box(modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center){
        Text(
            text = text,
            modifier = Modifier
                .padding(4.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )}
    }
}