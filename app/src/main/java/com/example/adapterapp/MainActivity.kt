package com.example.adapterapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //sample data: List of fruit with their name and drawable resource Id

        val fruitList = listOf(
            Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),
            Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),Fruit("Apple",R.drawable.apple),
            Fruit("Strawberry",R.drawable.strawberry),
            Fruit("Mango",R.drawable.sango),
        )

        //Get RecyclerView From the Layout
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        //set upp the recyclerView Layout manager(vertical List)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //setup the adapter with the fruit list
        val adapter = FruitAdapter(fruitList)

        recyclerView.adapter = adapter
    }
}