package com.example.task2.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiServices{
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://topseba.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val getInstance: ApiEndPoints by lazy {
        retrofit.create(ApiEndPoints::class.java)
    }
}