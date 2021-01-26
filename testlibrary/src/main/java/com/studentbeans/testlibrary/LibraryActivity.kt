package com.studentbeans.testlibrary

import android.content.Context
import android.widget.Toast

class LibraryActivity(private val context: Context) {

    fun showToast() {
        Toast.makeText(context, getTextForToast(), Toast.LENGTH_LONG).show()
    }

}