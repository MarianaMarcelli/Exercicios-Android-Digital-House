package com.marimm.calculosalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import kotlin.math.round
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            val quantidadeDeHoras = txtDigiteQuantidadeHorasTrabalhadas.text.toString().toDouble()
            val valorTotal = quantidadeDeHoras * txtDigiteValorPorHora.text.toString().toDouble()
            val valorTotalArredondado = String.format("%.2f", valorTotal)
            txtExibeValorCalculado.text = ("R$ $valorTotalArredondado")
        }

    }
}