package com.edushare.thecoffeemakerapp

import com.edushare.thecoffeemakerapp.coffee.CoffeeMaker
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class CoffeeApp : KoinComponent {
    val coffeeMaker: CoffeeMaker by inject()

    fun run() {
        coffeeMaker.brew()
    }
}