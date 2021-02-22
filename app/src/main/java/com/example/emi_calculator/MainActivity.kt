package com.example.emi_calculator

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    lateinit var rois:String
    lateinit var noya:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pamount = findViewById<EditText>(R.id.pamount)
        val roi = findViewById<SeekBar>(R.id.roi)
        val noy = findViewById<SeekBar>(R.id.noy)
        val button = findViewById<Button>(R.id.button)
        roi.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                rois = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        noy.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                noya = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        button.setOnClickListener {
            val result = "Result"+ pamount.text.toString().toInt() * rois.toInt() * noya.toInt() / 100
            Toast.makeText(this, "EMI will be "+" "+result , Toast.LENGTH_LONG).show()
        }
    }
}