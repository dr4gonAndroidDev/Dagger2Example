package com.example.daggerexampleapp.di

import com.example.daggerexampleapp.car.Engine
import com.example.daggerexampleapp.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule constructor(private val horsePower: Int): Engine{

    @Binds
    abstract fun bindEngine(engine: PetrolEngine) : Engine
}
