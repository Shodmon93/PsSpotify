package com.example.psspotify_v1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.psspotify_v1.data.DataTopMixPlay

class TopMixRecyclerAdapter : RecyclerView.Adapter<TopMixRecyclerAdapter.ViewHolder>() {

    private var items : List<DataTopMixPlay> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.top_mix_item_view,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun setData(data : List<DataTopMixPlay>){
        this.items = data
    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val artist : ImageView = itemView.findViewById(R.id.playListImage)
        val songName : TextView = itemView.findViewById(R.id.playListName)

        fun bind (dataTopMixPlay: DataTopMixPlay){
            Glide
                .with(itemView)
                .load(dataTopMixPlay.image)
                .into(artist)
            songName.text = dataTopMixPlay.songName
        }
    }
}