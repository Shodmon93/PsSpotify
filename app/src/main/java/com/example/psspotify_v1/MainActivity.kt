package com.example.psspotify_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.psspotify_v1.data.DataModule

class MainActivity : AppCompatActivity() {

    private lateinit var mainScreenAdapter : MainScreenRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainScreenAdapter = MainScreenRecyclerAdapter()

        initRecyclerView()
    }

    fun initRecyclerView (){
        val recyclerView = findViewById<RecyclerView>(R.id.mainScreenRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this@MainActivity,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = mainScreenAdapter
        mainScreenAdapter.setData(DataModule.setDatMainScreen())
    }
}