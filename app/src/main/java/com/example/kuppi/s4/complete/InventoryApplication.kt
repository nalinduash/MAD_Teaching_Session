package com.example.kuppi.s4.complete

import android.app.Application
import com.example.kuppi.s4.complete.data.AppContainer
import com.example.kuppi.s4.complete.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}