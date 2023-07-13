package com.ankita.inchestocentimeters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val inchValue = 2.54
    private lateinit var enterInches: EditText
    private lateinit var buttonConvert: Button
    private lateinit var textViewConvert: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterInches = findViewById(R.id.enterInches)
        buttonConvert = findViewById(R.id.buttonConvert)
        textViewConvert = findViewById(R.id.textViewConvert)

        buttonConvert.setOnClickListener {
            if (!enterInches.text.toString().isEmpty()){
                val result = enterInches.text.toString().toDouble() * inchValue
                textViewConvert.text = result.toString()
            }else{
                textViewConvert.text = getString(R.string.text)
            }
        }


    }
}