package com.example.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.interfaces.DishItemListener

class DishAdapter(val dishes: List<Dish>) : Adapter<DishAdapter.DishViewHolder>() {

    private var dishEventListener: DishItemListener? = null

    fun setDishListener(listener: DishItemListener) {
        this.dishEventListener = listener
    }

    class DishViewHolder(view: View, dishListener: DishItemListener?) : ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.item_menu_name)
        val image: ImageView = view.findViewById(R.id.item_menu_image)

        init {
            view.setOnClickListener {
                dishListener?.onDishClick(view, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_layout, parent, false)
        return DishViewHolder(view, dishEventListener)
    }

    override fun getItemCount(): Int {
        return dishes.size
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.name.text = dishes[position].name
        holder.image.setImageResource(dishes[position].photo)
    }
}
