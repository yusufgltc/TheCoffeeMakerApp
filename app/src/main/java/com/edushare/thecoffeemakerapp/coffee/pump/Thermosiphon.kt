package com.edushare.thecoffeemakerapp.coffee.pump

import com.edushare.thecoffeemakerapp.coffee.Heater
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Thermosiphon : Pump, KoinComponent {

    private val heater: Heater by inject()

    override fun pump() {
        if (heater.isHot()) {
            println("=> => pumping => =>")
        }
    }
}