package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.modelo_recycler.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meuRecycler = findViewById<RecyclerView>(R.id.meuRecycler)
        val viewManager = LinearLayoutManager(this)
        val viewAdapter = MeuAdapter(
            arrayListOf<Contatos>(
                Contatos("Júlia", "Oi mamãe", "12:00", R.drawable.ic_action_name),
                Contatos("Luiza", "faz brigadeiro pra mim?", "11:45", R.drawable.ic_action_name),
                Contatos(
                    "Mariangela",
                    "Você pode levar a Babi?",
                    "11:06",
                    R.drawable.ic_action_name
                ),
                Contatos("Márcio", "Bom dia", "7:25", R.drawable.ic_action_name),
                Contatos(
                    "Lucas",
                    "Tudo certo por aí? Já almoçaram?",
                    "12:25",
                    R.drawable.ic_action_name
                ),
                Contatos("Júlia", "Oi mamãe", "12:00", R.drawable.ic_action_name),
                Contatos("Luiza", "faz brigadeiro pra mim?", "11:45", R.drawable.ic_action_name),
                Contatos(
                    "Mariangela",
                    "Você pode levar a Babi?",
                    "11:06",
                    R.drawable.ic_action_name
                ),
                Contatos("Márcio", "Bom dia", "7:25", R.drawable.ic_action_name),
                Contatos(
                    "Lucas",
                    "Tudo certo por aí? Já almoçaram?",
                    "12:25",
                    R.drawable.ic_action_name
                ),
                Contatos("Júlia", "Oi mamãe", "12:00", R.drawable.ic_action_name),
                Contatos("Luiza", "faz brigadeiro pra mim?", "11:45", R.drawable.ic_action_name),
                Contatos(
                    "Mariangela",
                    "Você pode levar a Babi?",
                    "11:06",
                    R.drawable.ic_action_name
                ),
                Contatos("Márcio", "Bom dia", "7:25", R.drawable.ic_action_name),
                Contatos(
                    "Lucas",
                    "Tudo certo por aí? Já almoçaram?",
                    "12:25",
                    R.drawable.ic_action_name
                )
            )
        ) {
            val intent = Intent(this, GridLayoutActivity::class.java)
            startActivity(intent)
        }

        meuRecycler.apply {
            layoutManager = viewManager
            adapter = viewAdapter

            setHasFixedSize(true)
        }

    }
}