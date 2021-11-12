package com.edushare.thecoffeemakerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.edushare.thecoffeemakerapp.coffee.CoffeeMaker
import com.edushare.thecoffeemakerapp.coffee.ElectricHeater
import com.edushare.thecoffeemakerapp.coffee.Heater
import com.edushare.thecoffeemakerapp.coffee.pump.Pump
import com.edushare.thecoffeemakerapp.coffee.pump.Thermosiphon
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeeMakerModule = module {
            single { CoffeeMaker(get(), get()) }
            single<Pump> { Thermosiphon(get()) }
            single<Heater> { ElectricHeater() }
        }

        startKoin {
            modules(coffeeMakerModule)
        }
        CoffeeApp().run()
    }
}