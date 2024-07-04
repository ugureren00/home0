package com.example.proj

import android.graphics.Bitmap


data class ModelClass(
    val id: Int,
    val name: String,
    val country: String,
    val url: String,
) {
    val image: Bitmap?
        get() {
            TODO()
        }
}
