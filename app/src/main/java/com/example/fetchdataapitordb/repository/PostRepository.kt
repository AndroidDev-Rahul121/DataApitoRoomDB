package com.example.fetchdataapitordb.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.fetchdataapitordb.api.PostlistIn
import com.example.fetchdataapitordb.db.PosteDatabase

import com.example.fetchdataapitordb.models.ModelPostlist
import com.example.fetchdataapitordb.models.ModelPostlistItem

class PostRepository(private val postlist:PostlistIn,private val posteDatabase: PosteDatabase) {
    private val PostLiveData = MutableLiveData<List<ModelPostlistItem>>()
    val posts:LiveData<List<ModelPostlistItem>> get() = PostLiveData
    suspend fun getPost(){
        val result  = postlist.getPost()
        if (result!=null){
            posteDatabase.postDao().addPoastes(result!!)

//PosteDatabase.posteDao().addPosts(result.body().toString())
//PostLiveData.postValue(result)
//            Log.d("api",result.toString())


            val postsFromDb = posteDatabase.postDao().getAllPosts()
//            val quoteList = ModelPostlistItem(postsFromDb)
            Log.d("api",postsFromDb.toString())

            PostLiveData.postValue(postsFromDb)
        }
    }
}