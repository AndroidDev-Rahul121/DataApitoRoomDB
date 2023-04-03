package com.example.fetchdataapitordb.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fetchdataapitordb.repository.PostRepository

class MainViewModelFactory(private val repository: PostRepository): ViewModelProvider.Factory {

//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        return MainViewModel(repository) as T
//    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}