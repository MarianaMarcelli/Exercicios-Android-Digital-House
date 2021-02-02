package com.marimm.novatelaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        val nome= intent.getStringExtra("Name").toString()

        Toast.makeText(this, "torradinha", Toast.LENGTH_SHORT).show()

    }
}