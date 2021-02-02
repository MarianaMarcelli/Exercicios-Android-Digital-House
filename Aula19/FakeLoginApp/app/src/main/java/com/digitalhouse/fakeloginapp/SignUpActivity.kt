package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



        checkPoliticaPrivacidade.setOnCheckedChangeListener { _, isChecked ->
            btnSignUp.isEnabled = isChecked
        }

        btnLoginSignUp.setOnClickListener {
            finish()
        }

        btnSignUp.setOnClickListener {
            val name = etNameSignUp.text.toString()
            val email = etEmailSignUp.text.toString()
            val password = etSenhaSignUp.text.toString()

            when {
                name.isEmpty() -> {
                    etNameSignUp.error = "Campo vazio, digite um nome"
                }
                email.isEmpty() -> {
                    etEmailSignUp.error = "Campo vazio, digite um e-mail"
                }
                password.isEmpty() -> {
                    etSenhaSignUp.error = "Campo vazio, digite uma senha"

                }
                else -> {
                    try {
                        UserService.register(name, email, password)
                        Toast.makeText(this, "Cadastro realizado com sucesso", Toast.LENGTH_LONG)
                            .show()

                        finish()
                    } catch (e: Exception) {
                        Toast.makeText(this, e.message, Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }
        }
    }
}






