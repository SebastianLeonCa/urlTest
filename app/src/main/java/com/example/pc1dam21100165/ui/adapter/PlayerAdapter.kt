package com.example.pc1dam21100165.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pc1dam21100165.R
import com.example.pc1dam21100165.ui.model.PlayerModel

class PlayerAdapter(private var lstPlayer: List<PlayerModel>) :
    RecyclerView.Adapter<PlayerAdapter.ViewHolder>(){

     class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

         val ivPlayer: ImageView = itemView.findViewById(R.id.ivPlayer)
         val tvFullName: TextView = itemView.findViewById(R.id.tvFullName)
         val tvbirthYear: TextView = itemView.findViewById(R.id.tvBirthYear)
         val tvAge : TextView = itemView.findViewById(R.id.tvAge)
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(
            R.layout.item_player
                        , parent, false))
    }

    override fun getItemCount(): Int {
        return lstPlayer.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemPlayer = lstPlayer[position]
        holder.ivPlayer.setImageResource(itemPlayer.image)
        holder.tvFullName.text = itemPlayer.fullName
        holder.tvbirthYear.text = itemPlayer.birthYear
        holder.tvAge.text = itemPlayer.age
    }
}