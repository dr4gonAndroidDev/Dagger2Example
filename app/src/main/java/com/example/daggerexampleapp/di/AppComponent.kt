package com.example.daggerexampleapp.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    //fun getDriver(): Driver todo(we don't need this if we have a @Subcomponent annotation )

    //provide a getter for the instance of ActivityComponent
    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent
}