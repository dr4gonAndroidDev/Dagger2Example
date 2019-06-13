package com.example.daggerexampleapp.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") private val horsePower: Int, @Named("engineCapacity") private val engineCapacity: Int) : Engine {

    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Start petrol engine. \n Horse power $horsePower \n Engine capacity : $engineCapacity")
    }
}