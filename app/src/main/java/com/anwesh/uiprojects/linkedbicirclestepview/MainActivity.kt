package com.anwesh.uiprojects.linkedbicirclestepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bicirclestepview.BiCircleStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiCircleStepView.create(this)
    }
}
