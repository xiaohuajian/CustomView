package com.example.customviewbasic.basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customviewbasic.BuildConfig
import com.example.customviewbasic.R

class DrawpointAcitivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BuildConfig.VERSION_CODE
        setContentView(R.layout.activity_point)
    }
}