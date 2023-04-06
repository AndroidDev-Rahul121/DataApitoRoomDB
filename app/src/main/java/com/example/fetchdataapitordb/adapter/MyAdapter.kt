package com.example.fetchdataapitordb.adapter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Ignore
import com.example.fetchdataapitordb.R
import com.example.fetchdataapitordb.fragment.SecondFragment

import com.example.fetchdataapitordb.models.ModelPostlistItem
import com.example.fetchdataapitordb.util.Apiconstant
import com.google.android.material.card.MaterialCardView

class MyAdapter(private val data: List<ModelPostlistItem>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.iteam_recycle, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val entity = data[position]

        holder.bind(entity)
holder.itemView.setOnClickListener {
 Log.d("tag","itarm clidk")
//    holder.itemView.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
    val action = R.id.action_firstFragment_to_secondFragment
    holder.itemView.findNavController().navigate(action, bundleOf(Apiconstant.ADDRESS to entity.body))
//    val bundle = Bundle()
//
//    val secondFragment = SecondFragment()
//    secondFragment.arguments = bundle
// ghhghgjhgjgh
//    Log.d("tag","$bundle")
}

    }

    @Ignore
    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(entity: ModelPostlistItem) {
            itemView.findViewById<TextView>(R.id.tv_post).text = entity.title
            itemView.findViewById<TextView>(R.id.tv_id).text = entity.id.toString()
itemView.findViewById<MaterialCardView>(R.id.card)

        }
    }
}
