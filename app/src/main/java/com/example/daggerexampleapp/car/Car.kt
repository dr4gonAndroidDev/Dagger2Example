package com.example.daggerexampleapp.car

import android.util.Log
import com.example.daggerexampleapp.di.PerActivity
import javax.inject.Inject


@PerActivity
class Car @Inject constructor(private val engine: Engine, private val driver: Driver, val wheels: Wheels){
    private val TAG = "Car"

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives this $this")
    }
}