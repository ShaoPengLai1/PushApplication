package com.example.jpdemo

import android.app.Application
import cn.jpush.android.api.JPushInterface

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        JPushInterface.setDebugMode(true)
        JPushInterface.init(this)
    }
}
