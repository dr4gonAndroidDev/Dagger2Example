package com.example.daggerexampleapp.car

import android.util.Log
import javax.inject.Inject

class DieselEngine constructor(private val horsePower: Int) : Engine {

    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Start diesel engine. Horse power $horsePower")
    }
}