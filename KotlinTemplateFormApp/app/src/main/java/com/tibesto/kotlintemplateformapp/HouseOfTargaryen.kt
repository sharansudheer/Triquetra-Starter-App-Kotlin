package com.tibesto.kotlintemplateformapp

import android.os.Bundle
import androidx.core.app.ComponentActivity



@AndroidEntryPoint
class HouseOfTargaryen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}