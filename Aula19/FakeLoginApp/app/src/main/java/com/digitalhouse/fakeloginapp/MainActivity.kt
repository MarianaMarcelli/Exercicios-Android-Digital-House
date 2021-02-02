package com.digitalhouse.fakeloginapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserModel
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreatAccount.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {

            val emailLogin = etEmail.text.toString()
            val senhaLogin = etSenha.text.toString()
            val usuarioCadastrado = UserService.logIn(emailLogin, senhaLogin)


            when {
                emailLogin.isEmpty() -> etEmail.error = "Campo vazio"
                senhaLogin.isEmpty() -> etSenha.error = "Campo vazio"
                usuarioCadastrado == null -> Toast.makeText(
                    this,
                    "Usuário não cadastrado, verifique e-mail e senha ou faça o cadastro",
                    Toast.LENGTH_LONG
                ).show()
                else -> {

                    val intent = Intent(this, WelcomeActivity::class.java)
                    intent.putExtra("NOMEUSUARIO", usuarioCadastrado.name)
                    startActivity(intent)
                }
            }


        }
    }
}
