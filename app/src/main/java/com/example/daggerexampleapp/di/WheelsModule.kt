package com.example.daggerexampleapp.di

import com.example.daggerexampleapp.car.Rims
import com.example.daggerexampleapp.car.Tires
import com.example.daggerexampleapp.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() : Rims {
        return Rims()
    }

    @Provides
    fun providesTires() : Tires {
        val tires = Tires()
        tires.config()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
        //use builder methods for example retrofit 2
    }
}