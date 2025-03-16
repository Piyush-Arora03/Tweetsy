package com.example.tweetsy.viewmodel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.model.TweetsListItem
import com.example.tweetsy.repo.TweetsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TweetsViewModel @Inject constructor(private val tweetsRepository: TweetsRepository,
                                          val savedStateHandle : SavedStateHandle) : ViewModel(){
    val tweets : StateFlow<List<TweetsListItem>>
        get() = tweetsRepository.tweets

    init {
        viewModelScope.launch {
            val category=savedStateHandle.get<String>("category")?:"Motivation"
            tweetsRepository.getTweets(category)
            Log.d("Tweets",tweets.value.toString())
        }
    }
}