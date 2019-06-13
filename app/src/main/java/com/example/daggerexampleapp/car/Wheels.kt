package com.example.daggerexampleapp.car

import javax.inject.Inject



class Wheels @Inject constructor(private val rims: Rims, private val tires: Tires) {

}