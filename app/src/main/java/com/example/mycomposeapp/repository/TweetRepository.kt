package com.example.mycomposeapp.repository

import com.example.mycomposeapp.api.TweetsyAPI
import com.example.mycomposeapp.models.TweetsListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetRepository @Inject constructor(val tweetsyAPI: TweetsyAPI) {

    private val _tweets = MutableStateFlow<List<TweetsListItem>>(emptyList())
    val tweets : StateFlow<List<TweetsListItem>>
    get() = _tweets

    private val _categories = MutableStateFlow<List<String>>(emptyList())
        val categories : StateFlow<List<String>>
        get() = _categories


    suspend fun getTweets(category: String){
       val response = tweetsyAPI.getTweets("tweets[?(@.category==\"$category\")]")
        if(response.isSuccessful && response.body() !=null){
            _tweets.emit(response.body()!!)
        }
    }

    suspend fun getCategories(){
        val response = tweetsyAPI.getCategories()
        if(response.isSuccessful && response.body()!=null){
        _categories.emit(response.body()!!)
        }
    }
}