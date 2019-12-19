package com.dagger.demoBasic

import dagger.Component

@Component
public interface BikeComponent {

    fun getBike(): Bike

}