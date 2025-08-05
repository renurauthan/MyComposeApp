package com.example.mycomposeapp.modules

import com.example.mycomposeapp.api.TweetsyAPI
import com.example.mycomposeapp.repository.TweetRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun getRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl("https://api.jsonbin.io/").addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun getRepository(retrofit: Retrofit) : TweetsyAPI{
        return retrofit.create(TweetsyAPI::class.java)
    }
}