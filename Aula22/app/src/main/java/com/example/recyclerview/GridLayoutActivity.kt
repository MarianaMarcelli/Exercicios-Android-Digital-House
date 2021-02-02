package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.modelo_grid_layout.*
import kotlinx.android.synthetic.main.modelo_recycler.*

class GridLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)

        val meuGridRecycler = findViewById<RecyclerView>(R.id.recyclerGrid)
        val viewManagerGrid = GridLayoutManager(this, 2)

        val contatos = listOf<Contatos>(Contatos("Júlia", R.drawable.earth_moon),
            Contatos("Luiza", R.drawable.ic_action_name),
            Contatos("Mariangela", R.drawable.earth_moon),
            Contatos("Márcio", R.drawable.ic_action_name),
            Contatos("Lucas", R.drawable.earth_moon),
            Contatos("Júlia", R.drawable.ic_action_name),
            Contatos("Luiza", R.drawable.earth_moon),
            Contatos("Mariangela", R.drawable.ic_action_name),
            Contatos("Márcio", R.drawable.ic_action_name),
            Contatos("Lucas", R.drawable.earth_moon),
            Contatos("Júlia", R.drawable.ic_action_name),
            Contatos("Luiza", R.drawable.earth_moon),
            Contatos("Mariangela", R.drawable.ic_action_name),
            Contatos("Márcio", R.drawable.earth_moon),
            Contatos("Lucas", R.drawable.ic_action_name)
        )
        val viewAdapter = MeuGridAdapter(contatos) {

            Toast.makeText(this, txtGridRecycler.text, Toast.LENGTH_SHORT).show()
        }

        meuGridRecycler.apply {
            layoutManager = viewManagerGrid
            adapter = viewAdapter
            setHasFixedSize(true)
        }

    }
}