package com.example.fetchdataapitordb.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchdataapitordb.models.ModelPostlist
import com.example.fetchdataapitordb.models.ModelPostlistItem
import com.example.fetchdataapitordb.repository.PostRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: PostRepository):ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getPost()

        }
    }
//    val posts : LiveData<List<ModelPostlistItem>> = repository.posteDatabase.postDao().getAllPosts()
//val posts : LiveData<List<ModelPostlistItem>> = repository.getPostsFromDb()
    val Postes : LiveData<List<ModelPostlistItem>> = repository.posts

}