package com.example.fetchdataapitordb

import android.app.Application
import com.example.fetchdataapitordb.api.PostlistIn
import com.example.fetchdataapitordb.api.RetrofitHelper
import com.example.fetchdataapitordb.db.PosteDatabase

import com.example.fetchdataapitordb.repository.PostRepository

class PosteApplication:Application() {
    lateinit var postRepository: PostRepository

    override fun onCreate() {
        super.onCreate()
initialize()
    }

    private fun initialize(){
        val postList = RetrofitHelper.getInstance().create(PostlistIn::class.java)
        val databse = PosteDatabase.getDatabase(applicationContext)
        postRepository = PostRepository(postList, databse)


    }
}