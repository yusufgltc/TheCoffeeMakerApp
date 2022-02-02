package com.edushare.thecoffeemakerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.edushare.thecoffeemakerapp.coffee.CoffeeMaker
import com.edushare.thecoffeemakerapp.coffee.ElectricHeater
import com.edushare.thecoffeemakerapp.coffee.Heater
import com.edushare.thecoffeemakerapp.coffee.pump.Pump
import com.edushare.thecoffeemakerapp.coffee.pump.Thermosiphon
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeeMaker: CoffeeMaker by inject()

        startKoin {
            androidLogger()
            androidContext(this@MainActivity)
            modules(coffeeMakerModule)
        }
        CoffeeApp().run()
    }
}