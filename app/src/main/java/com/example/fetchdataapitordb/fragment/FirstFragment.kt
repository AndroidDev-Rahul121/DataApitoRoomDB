package com.example.fetchdataapitordb.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fetchdataapitordb.PosteApplication
import com.example.fetchdataapitordb.R
import com.example.fetchdataapitordb.adapter.MyAdapter
import com.example.fetchdataapitordb.viewModel.MainViewModel
import com.example.fetchdataapitordb.viewModel.MainViewModelFactory


class FirstFragment : Fragment() {
    lateinit var mainViewModel: MainViewModel
    lateinit var adapter: MyAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
  val view =  inflater.inflate(R.layout.fragment_first, container, false)

        val repository = (requireActivity().application as PosteApplication).postRepository
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository))[MainViewModel::class.java]

        recyclerView = view.findViewById(R.id.recycleview)
       textView = view.findViewById(R.id.tv_c)
//        try {
//            // Make API request and parse response
//        } catch (e: JsonSyntaxException) {
//            Log.e(TAG, "Error parsing JSON response: ${e.message}")
//            Log.e(TAG, "Response body: ${response.body}")
//        }


        mainViewModel.Postes.observe(viewLifecycleOwner, Observer{
//            Log.d("Rahul",it.toString())
            adapter = MyAdapter(it)
            recyclerView.adapter = adapter
        })
textView.setOnClickListener {
    findNavController().navigate(R.id.secondFragment)
}
        return view
    }


}