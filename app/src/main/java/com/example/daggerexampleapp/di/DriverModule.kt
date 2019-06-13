package com.example.daggerexampleapp.di

import com.example.daggerexampleapp.car.Driver
import dagger.Module
import dagger.Provides

@Module
object DriverModule {

    @Provides
    @JvmStatic fun provideDriver(): Driver {
        return Driver()
    }
}