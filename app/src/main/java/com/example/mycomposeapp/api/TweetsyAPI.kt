package com.example.mycomposeapp.api

import com.example.mycomposeapp.models.TweetsListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

   // @GET("v3/b/65943e8b1f5677401f16981e?meta=false")
    @GET("/v3/b/64b3dd858e4aa6225ebf1315?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String) : Response<List<TweetsListItem>>

  //  @GET("v3/b/65943e8b1f5677401f16981e?meta=false")
    @GET("/v3/b/64b3dd858e4aa6225ebf1315?meta=false")
    @Headers("X-JSON-Path : tweets..Category")
    suspend fun getCategories() : Response<List<String>>
}