package com.studentbeans.testlibrary

import android.content.Context
import android.widget.Toast

class LibraryActivity(private val context: Context,
                      private val text: String) {

    fun showToast() {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

}