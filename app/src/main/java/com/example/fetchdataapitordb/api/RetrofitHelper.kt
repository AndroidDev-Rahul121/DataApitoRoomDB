package com.example.fetchdataapitordb.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
//    BASE_Url = "https://jsonplaceholder.typicode.com/posts"
    private const val BASE_Url = "https://jsonplaceholder.typicode.com"

    fun getInstance():Retrofit{
        return Retrofit.Builder().baseUrl(BASE_Url).addConverterFactory(GsonConverterFactory.create()).build()
    }
}