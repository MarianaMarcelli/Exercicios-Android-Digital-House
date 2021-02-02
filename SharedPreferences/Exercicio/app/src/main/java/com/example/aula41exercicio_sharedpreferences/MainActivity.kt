package com.example.aula41exercicio_sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = getSharedPreferences(APP_NAME, MODE_PRIVATE)
        val valor = pref.getBoolean("NOTIFICATION_PREFS", false)

    }
    companion object {
        const val APP_NAME = "Aula41Exercicio"

    }
}