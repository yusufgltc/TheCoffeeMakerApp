package com.edushare.thecoffeemakerapp

import com.edushare.thecoffeemakerapp.coffee.CoffeeMaker
import com.edushare.thecoffeemakerapp.coffee.ElectricHeater
import com.edushare.thecoffeemakerapp.coffee.Heater
import com.edushare.thecoffeemakerapp.coffee.pump.Pump
import com.edushare.thecoffeemakerapp.coffee.pump.Thermosiphon
import org.koin.dsl.module


val coffeeMakerModule =
    module {
    single { CoffeeMaker(get()) }
    single<Pump> { Thermosiphon() }
    single<Heater> { ElectricHeater() }
}