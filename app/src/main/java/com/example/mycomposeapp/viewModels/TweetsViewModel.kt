package com.example.mycomposeapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycomposeapp.models.TweetsListItem
import com.example.mycomposeapp.repository.TweetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TweetsViewModel @Inject constructor(private val repository: TweetRepository): ViewModel()
{

    val tweetsList : StateFlow<List<TweetsListItem>>
    get() = repository.tweets

            init{
                GlobalScope.launch {
                    repository.getTweets("motivation")
                }
            }
}