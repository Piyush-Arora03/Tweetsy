package com.example.tweetsy.repo

import com.example.tweetsy.api.TweetsAPI
import com.example.tweetsy.model.TweetsListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetsRepository @Inject constructor(private val tweetsAPI: TweetsAPI) {
    private val _categories= MutableStateFlow<List<String>>(emptyList())
    val categories : StateFlow<List<String>>
        get() = _categories

    private val _tweets= MutableStateFlow<List<TweetsListItem>>(emptyList())
    val tweets : StateFlow<List<TweetsListItem>>
        get() = _tweets

    suspend fun getTweetsCategory(){
        val result=tweetsAPI.getTweetsCategory()
        if(result.isSuccessful && result.body()!=null){
            _categories.emit(result.body()!!)
        }
    }

    suspend fun getTweets(category: String){
        val result=tweetsAPI.getTweets("tweets[?(@.category==\"$category\")]")
        if(result.isSuccessful && result.body()!=null){
            _tweets.emit(result.body()!!)
        }
    }
}