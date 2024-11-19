package com.example.adapterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitList: List<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {
    //viewHolder to hold references to each item view
    class FruitViewHolder(view: View): RecyclerView.ViewHolder(view){
        val fruitImageView: ImageView = view.findViewById(R.id.fruitImageView)
        val fruitName: TextView = view.findViewById(R.id.fruitNameText)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitAdapter.FruitViewHolder {
        //it creates the map for house
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fruit,parent,false)
        return FruitViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitAdapter.FruitViewHolder, position: Int) {
        //it will populate the data items
        //create the houses
        val fruit = fruitList[position]
        holder.fruitName.text = fruit.FruitName
        //set image resource from drawbable using imageResID
        holder.fruitImageView.setImageResource(fruit.imageResourceId)

    }

    override fun getItemCount(): Int {
        return  fruitList.size
    }

}
