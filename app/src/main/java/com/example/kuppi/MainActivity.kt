package com.example.kuppi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.kuppi.s2.complete.s2ScreenFuncFull
import com.example.kuppi.s2.minimal.s2ScreenFuncMinimal
import com.example.kuppi.s3.s3ScreenFunc
import com.example.kuppi.ui.theme.KuppiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KuppiTheme (){
                s3ScreenFunc()
            }
        }
    }
}