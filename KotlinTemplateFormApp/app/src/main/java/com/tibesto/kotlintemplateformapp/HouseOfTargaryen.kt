package com.tibesto.kotlintemplateformapp

import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.activity.compose.setContent

class HouseOfTargaryen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RedWedding()
        }
    }

    private fun setContent(function: () -> Unit) {}
}






//@AndroidEntryPoint
//class HouseOfTargaryen : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyApp()
//        }
//    }
//}