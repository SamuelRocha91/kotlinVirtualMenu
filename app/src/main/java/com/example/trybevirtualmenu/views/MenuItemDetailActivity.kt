package com.example.trybevirtualmenu.views

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R

class MenuItemDetailActivity : AppCompatActivity() {

    private val logo: ImageView by lazy { findViewById(R.id.detail_logo) }
    private val image_dish: ImageView by lazy { findViewById(R.id.detail_image) }
    private val title: TextView by lazy { findViewById(R.id.detail_title) }
    private val name: TextView by lazy { findViewById(R.id.detail_name) }
    private val description: TextView by lazy { findViewById(R.id.detail_description) }
    private val price: TextView by lazy { findViewById(R.id.detail_price) }
    private val button: Button by lazy { findViewById(R.id.detail_back) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)
    }
}
