package com.example.psspotify_v1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.psspotify_v1.data.DataModule
import com.example.psspotify_v1.data.MainScreen

class MainScreenRecyclerAdapter : RecyclerView.Adapter<MainScreenRecyclerAdapter.ViewHolder>() {

    var items : List<MainScreen> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.main_screen_item_view,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items[position])
    }

    override fun getItemCount(): Int {
      return items.size
    }

    fun setData (data : List<MainScreen>){
        this.items = data
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val topMixAdapter = TopMixRecyclerAdapter()
        var topMixSong : TextView = itemView.findViewById(R.id.topMix)
        var recent : TextView = itemView.findViewById(R.id.recentTxt)
        var popular : TextView = itemView.findViewById(R.id.popular)
        var recyclerView : RecyclerView = itemView.findViewById(R.id.topMixRecycler)
        val recentRecyclerView : RecyclerView = itemView.findViewById(R.id.recentlyPlayedRecycler)
        val image1 : ImageView = itemView.findViewById(R.id.image1)
        val image2 : ImageView = itemView.findViewById(R.id.image2)
        val image3 : ImageView = itemView.findViewById(R.id.image3)

        fun binding (mainScreen: MainScreen){
            topMixSong.text = mainScreen.topMix
            recent.text = mainScreen.recent
            popular.text = mainScreen.popular

            recyclerView.layoutManager = LinearLayoutManager(
                itemView.context,LinearLayoutManager.HORIZONTAL,false)
            recyclerView.adapter = topMixAdapter
            topMixAdapter.setData(DataModule.setDat())

            recentRecyclerView.layoutManager = LinearLayoutManager(
                itemView.context,LinearLayoutManager.HORIZONTAL,false)
            recentRecyclerView.adapter = topMixAdapter
            topMixAdapter.setData(DataModule.setDat())

            Glide
                .with(itemView)
                .load(mainScreen.firstImage)
                .into(image1)
            Glide
                .with(itemView)
                .load(mainScreen.secondImage)
                .into(image2)
            Glide
                .with(itemView)
                .load(mainScreen.thirdImage)
                .into(image3)




        }
    }

}