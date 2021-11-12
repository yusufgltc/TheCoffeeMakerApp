package com.edushare.thecoffeemakerapp.coffee

import com.edushare.thecoffeemakerapp.coffee.pump.Pump
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class CoffeeMaker(private val pump: Pump) : KoinComponent {

    val heater: Heater by inject()

    fun brew() {
        heater.on()
        pump.pump()
        println(" [_]P coffee! [_]P ")
        heater.off()
    }
}