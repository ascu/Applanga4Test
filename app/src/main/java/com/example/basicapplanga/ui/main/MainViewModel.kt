package com.example.basicapplanga.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.applanga.android.ApplangaApplication
import com.example.basicapplanga.R

class MainViewModel(val app: Application) : AndroidViewModel(app) {

    fun getAppName(): String {
        return app.resources.getString(R.string.app_name)
    }
}