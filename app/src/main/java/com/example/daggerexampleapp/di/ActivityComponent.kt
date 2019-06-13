package com.example.daggerexampleapp.di

import com.example.daggerexampleapp.MainActivity
import com.example.daggerexampleapp.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent (modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

/*    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity")  engineCapacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }*/
}