package com.example.daggerexampleapp

import android.app.Application
import com.example.daggerexampleapp.di.AppComponent
import com.example.daggerexampleapp.di.DaggerAppComponent

class ExampleApp: Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}