package com.example.fetchdataapitordb.api

import com.example.fetchdataapitordb.models.ModelPostlist
import com.example.fetchdataapitordb.models.ModelPostlistItem
import retrofit2.Response
import retrofit2.http.GET


interface PostlistIn {
    @GET("/posts")
    suspend fun getPost():List<ModelPostlistItem>
}