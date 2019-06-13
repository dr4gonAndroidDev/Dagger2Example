package com.example.daggerexampleapp.di

import com.example.daggerexampleapp.car.DieselEngine
import com.example.daggerexampleapp.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private var horsePower: Int) {

    @Provides
    fun providesEngine(): Engine {
        return DieselEngine(horsePower)
    }
}
