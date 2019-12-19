package com.dagger.demoBasic

class Bike2 {


    // Class with constructor injection without Dagger

    var engine: Engine
    var wheel: Wheel

    constructor(engine: Engine, wheel: Wheel) {
        this.engine = engine
        this.wheel = wheel
    }

}