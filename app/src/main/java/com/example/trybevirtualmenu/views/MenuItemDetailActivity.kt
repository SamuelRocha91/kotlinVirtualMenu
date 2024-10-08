package com.example.trybevirtualmenu.views

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.commom.VirtualMenuDatabase

class MenuItemDetailActivity : AppCompatActivity() {

    private val image_dish: ImageView by lazy { findViewById(R.id.detail_image) }
    private val name: TextView by lazy { findViewById(R.id.detail_name) }
    private val description: TextView by lazy { findViewById(R.id.detail_description) }
    private val price: TextView by lazy { findViewById(R.id.detail_price) }
    private val button: Button by lazy { findViewById(R.id.detail_back) }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val dishId = intent.getIntExtra("id", 0) + 1
        val dish = VirtualMenuDatabase.getDishById(dishId)

        if (dish != null) {
            image_dish.setImageResource(dish.photo)
            name.text = dish.name
            description.text = dish.description
            price.text = "R$ ${dish.price},00"
        }
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
