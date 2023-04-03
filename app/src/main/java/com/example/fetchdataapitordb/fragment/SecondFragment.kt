package com.example.fetchdataapitordb.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.fetchdataapitordb.R
import com.example.fetchdataapitordb.util.Apiconstant

class SecondFragment : Fragment() {
    lateinit var textView: TextView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        val myString = arguments?.getString(Apiconstant.ADDRESS)

        if (myString != null) {
            // do something with myString
            Log.d("tag", "$myString")
        } else {
            // handle null case
            Log.d("tag", "myString is null")
        }



        textView = view.findViewById(R.id.tv_title)

textView.text = myString
        return view
    }


}