package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val nomeUsuario = intent.getStringExtra("NOMEUSUARIO")
        txtNomeUsuario.text = nomeUsuario
        txtNomeUsuario.visibility = View.VISIBLE



    }
}