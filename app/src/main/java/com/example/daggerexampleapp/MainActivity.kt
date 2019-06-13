package com.example.daggerexampleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.daggerexampleapp.car.Car
import com.example.daggerexampleapp.di.DieselEngineModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as ExampleApp)
            .getAppComponent()
            .getActivityComponent(DieselEngineModule(300))

        component.inject(this)

        car1.drive()
        car2.drive()
    }
}