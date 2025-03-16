package com.example.tweetsy.api

import com.example.tweetsy.model.TweetsListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsAPI {
    @GET("/v3/b/67d16b078a456b7966744e2c?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category:String) : Response<List<TweetsListItem>>

    @GET("/v3/b/67d16b078a456b7966744e2c?meta=false")
    @Headers("X-JSON-Path: tweets..category")
    suspend fun getTweetsCategory() : Response<List<String>>
}