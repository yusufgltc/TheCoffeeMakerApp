package com.edushare.thecoffeemakerapp

import com.edushare.thecoffeemakerapp.coffee.CoffeeMaker
import com.edushare.thecoffeemakerapp.coffee.ElectricHeater
import com.edushare.thecoffeemakerapp.coffee.Heater
import com.edushare.thecoffeemakerapp.coffee.pump.Pump
import com.edushare.thecoffeemakerapp.coffee.pump.Thermosiphon
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module

class CoffeeApp : KoinComponent {
    val coffeeMaker: CoffeeMaker by inject()

    fun run() {
        coffeeMaker.brew()
    }


    val coffeeMakerModule = module {
        single { CoffeeMaker(get(), get()) }
        single<Pump> { Thermosiphon(get()) }
        single<Heater> { ElectricHeater() }
    }
//    Different module format
//    val coffeeMaker = module {
//        single { com.edushare.thecoffeemakerapp.CoffeeMaker(get(), get()) }
//    }
//
//    val coffeeStuffs = module {
//        single<Pump> { Thermosiphon(get()) }
//        single<Heater> { ElectricHeater() }
//    }


    fun main(vararg args: String) {
        startKoin {
            modules(coffeeMakerModule)
        }
        CoffeeApp().run()
    }
}