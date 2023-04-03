package com.example.fetchdataapitordb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fetchdataapitordb.api.PostlistIn
import com.example.fetchdataapitordb.api.RetrofitHelper
import com.example.fetchdataapitordb.repository.PostRepository
import com.example.fetchdataapitordb.viewModel.MainViewModel
import com.example.fetchdataapitordb.viewModel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val postList = RetrofitHelper.getInstance().create(PostlistIn::class.java)
//        val repository = PostRepository(postList)
//        val repository = (application as PosteApplication).postRepository
//        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository))[MainViewModel::class.java]
////        try {
////            // Make API request and parse response
////        } catch (e: JsonSyntaxException) {
////            Log.e(TAG, "Error parsing JSON response: ${e.message}")
////            Log.e(TAG, "Response body: ${response.body}")
////        }
//         mainViewModel.Postes.observe(this, Observer{
//             Log.d("Rahul",it.toString())
//         })
    }
}