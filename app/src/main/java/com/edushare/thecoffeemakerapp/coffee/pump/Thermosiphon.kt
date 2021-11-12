package com.edushare.thecoffeemakerapp.coffee.pump

import com.edushare.thecoffeemakerapp.coffee.Heater
import com.edushare.thecoffeemakerapp.coffee.pump.Pump

class Thermosiphon(val heater: Heater) : Pump {
    override fun pump() {
        if (heater.isHot()){
            println("=> => pumping => =>")
        }
    }
}