package com.example.splashsreen

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        colocarEmFullScreen()
        animarTexto()


        Handler(Looper.getMainLooper()).postDelayed({
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
            finish()
        }, 3000)
    }

    private fun animarTexto(){
        val appName = findViewById<TextView>(R.id.txtAppSplash)
        appName.alpha = 0f

        appName.animate()
            .alpha(1f)
            .y(1000f)
            .setDuration(500)
            .setListener(null)
    }


    @Suppress("DEPRECATION")
    private fun colocarEmFullScreen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }



}