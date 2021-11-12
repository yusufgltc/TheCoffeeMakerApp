package com.edushare.thecoffeemakerapp.coffee

import com.edushare.thecoffeemakerapp.coffee.Heater

class ElectricHeater : Heater {

    var heating : Boolean = false

    override fun on() {
        println("~ ~ ~ heating ~ ~ ~")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating
}