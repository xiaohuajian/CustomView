package com.example.customviewbasic


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customviewbasic.basic.DrawColorAcitivity
import com.example.customviewbasic.basic.DrawpointAcitivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawColorTv.setOnClickListener {
            startActivity(Intent(this, DrawColorAcitivity::class.java))
        }

        drawPointTv.setOnClickListener {
            startActivity(Intent(this, DrawpointAcitivity::class.java))
        }

    }
}