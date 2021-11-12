package com.edushare.thecoffeemakerapp.coffee

import com.edushare.thecoffeemakerapp.coffee.pump.Pump

class CoffeeMaker(val pump: Pump, val heater: Heater) {
    fun brew(){
        heater.on()
        pump.pump()
        println(" [_]P coffee! [_]P ")
        heater.off()
    }
}