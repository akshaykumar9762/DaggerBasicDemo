package com.dagger.demoBasic

import android.util.Log
import javax.inject.Inject

private const val TAG = "Bike"


class Bike @Inject constructor(val engine: Engine, val wheelFront: Wheel) {

    fun ride() {
        Log.i(TAG, "Bhrooommm...Riding")
    }

}