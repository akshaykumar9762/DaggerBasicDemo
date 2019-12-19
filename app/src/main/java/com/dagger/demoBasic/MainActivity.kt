package com.dagger.demoBasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Constructor injection with Dagger 2

class MainActivity : AppCompatActivity() {

    lateinit var bike: Bike

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //*** DaggerBikeComponent will be created by Dagger automatically afet compiling the project
        //Before writing this line compile the project

        val bikeComponent: BikeComponent = DaggerBikeComponent.create()
        bike = bikeComponent.getBike()
        bike.ride()

    }
}
