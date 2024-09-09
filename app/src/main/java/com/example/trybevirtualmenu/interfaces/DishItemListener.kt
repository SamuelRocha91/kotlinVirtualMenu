package com.example.trybevirtualmenu.interfaces

import android.view.View

interface DishItemListener {
    fun onDishClick(view: View, position: Int)
}
