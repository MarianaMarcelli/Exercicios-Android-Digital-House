package com.example.aula41exercicio_sharedpreferences.login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.example.aula41exercicio_sharedpreferences.MainActivity
import com.example.aula41exercicio_sharedpreferences.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val intent = Intent(this, MainActivity::class.java)

        val checkbox = findViewById<CheckBox>(R.id.checkBoxRemember)

        val prefs = getSharedPreferences(APP_NAME, MODE_PRIVATE)
        val prefsChecked = prefs.getBoolean(NOTIFICATION_PREFS, false)

        checkbox.isChecked = prefsChecked

        if (checkbox.isChecked) {
            startActivity(intent)
        }

        checkbox.setOnCheckedChangeListener {
            _, isChecked ->
            prefs.edit().putBoolean(NOTIFICATION_PREFS, isChecked).apply()
        }

        val login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener {
            var camposValidos = true
           // val intent = Intent(this, MainActivity::class.java)


            val emailLogin = findViewById<EditText>(R.id.edtEmailLogin)
            val passwordLogin = findViewById<EditText>(R.id.edtPasswordLogin)

            if (emailLogin.text.toString().isBlank()) {
                emailLogin.error = "Campo vazio"
                camposValidos = false
            }
            if (passwordLogin.text.toString().isBlank()) {
                passwordLogin.error = "Campo vazio"
                camposValidos = false
            }
            if (camposValidos) {
                emailLogin.text?.clear()
                passwordLogin.text?.clear()

                startActivity(intent)
            }
        }
    }
    companion object {
        const val APP_NAME = "Aula41Exercicio"
        const val NOTIFICATION_PREFS = "NOTIFICATION_PREFS"
    }
}
