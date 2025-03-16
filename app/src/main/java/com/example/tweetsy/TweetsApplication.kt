package com.example.tweetsy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TweetsApplication:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}