package com.example.myfoodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager=LinearLayoutManager(this)
        val recycleView=findViewById<RecyclerView>(R.id.recycleView)
        recycleView.layoutManager=layoutManager

        adapter = RecyclerViewAdapter()
        recycleView.adapter=adapter


    }
}