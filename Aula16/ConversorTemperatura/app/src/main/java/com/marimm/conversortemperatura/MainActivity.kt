package com.marimm.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBotaoConverter.setOnClickListener {
            val temperaturaInformada = txtDigiteTemperatura.text.toString().toDouble()
            val temperaturaConvertida = (temperaturaInformada * 9/5) + 32
            txtResultadoConversao.text = ("$temperaturaConvertida °F")
        }
    }
}