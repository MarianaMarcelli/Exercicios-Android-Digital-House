package com.example.aula41sharedpreferences

import android.annotation.SuppressLint
import android.content.Context.MODE_PRIVATE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch = findViewById<Switch>(R.id.switchHabilitarNotificações)

        val prefs = getSharedPreferences(APP_NAME, MODE_PRIVATE)
        val prefsChecked = prefs.getBoolean(NOTIFICATION_PREFS, false)

        switch.isChecked = prefsChecked

        switch.setOnCheckedChangeListener{_, isChecked->
            prefs.edit().putBoolean(NOTIFICATION_PREFS, isChecked).apply()
        }
    }

    companion object {
        const val APP_NAME = "Aula41"
        const val NOTIFICATION_PREFS = "NOTIFICATION_PREFS"
    }

}