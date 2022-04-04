package com.sabine.androidstudies.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollD4Button: Button = findViewById(R.id.roll_d4_button)
        rollD4Button.setOnClickListener { rollD4() }

        val rollD6Button: Button = findViewById(R.id.roll_d6_button)
        rollD6Button.setOnClickListener { rollD6() }

        val rollD8Button: Button = findViewById(R.id.roll_d8_button)
        rollD8Button.setOnClickListener { rollD8() }

        val rollD10Button: Button = findViewById(R.id.roll_d10_button)
        rollD10Button.setOnClickListener { rollD10() }

        val rollD12Button: Button = findViewById(R.id.roll_d12_button)
        rollD12Button.setOnClickListener { rollD12() }

        val rollD20Button: Button = findViewById(R.id.roll_d20_button)
        rollD20Button.setOnClickListener { rollD20() }
    }

    private fun rollD4() {
        val randomD4Int = (1..4).random()
        val resultD4Text: TextView = findViewById(R.id.result_d4_text)
        resultD4Text.text = randomD4Int.toString()
    }

    private fun rollD6() {
        val randomD6Int = (1..6).random()
        val resultD6Text: TextView = findViewById(R.id.result_d6_text)
        resultD6Text.text = randomD6Int.toString()
    }

    private fun rollD8() {
        val randomD8Int = (1..8).random()
        val resultD8Text: TextView = findViewById(R.id.result_d8_text)
        resultD8Text.text = randomD8Int.toString()
    }

    private fun rollD10() {
        val randomD10Int = (1..10).random()
        val resultD10Text: TextView = findViewById(R.id.result_d10_text)
        resultD10Text.text = randomD10Int.toString()
    }

    private fun rollD12() {
        val randomD12Int = (1..12).random()
        val resultD12Text: TextView = findViewById(R.id.result_d12_text)
        resultD12Text.text = randomD12Int.toString()
    }

    private fun rollD20() {
        val randomD20Int = (1..20).random()
        val resultD20Text: TextView = findViewById(R.id.result_d20_text)
        resultD20Text.text = randomD20Int.toString()
    }

}