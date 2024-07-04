package com.example.proj

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.graphics.BitmapFactory
import android.content.res.Resources
import android.graphics.Bitmap

class MainActivity : AppCompatActivity() {
    lateinit var itemAdapter: ItemAdapter
    lateinit var dataList: ArrayList<ModelClass>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.proj)
        dataList = ArrayList()

        val resources: Resources = resources
        dataList.add(ModelClass(BitmapFactory.decodeResource(resources, R.drawable.car)))
        dataList.add(ModelClass(BitmapFactory.decodeResource(resources, R.drawable.car1)))
        dataList.add(ModelClass(BitmapFactory.decodeResource(resources, R.drawable.car3)))
        dataList.add(ModelClass(BitmapFactory.decodeResource(resources, R.drawable.car4)))
        dataList.add(ModelClass(BitmapFactory.decodeResource(resources, R.drawable.car5)))

        recyclerView.layoutManager = LinearLayoutManager(this)
        itemAdapter = ItemAdapter(dataList) // Initialize the adapter with the data list
        recyclerView.adapter = itemAdapter
    }

    private fun ItemAdapter(dataList: java.util.ArrayList<ModelClass>): ItemAdapter {
        TODO("Not yet implemented")
    }

    private fun ModelClass(image: Bitmap?): ModelClass {
            TODO("Not yet implemented")
    }
}



