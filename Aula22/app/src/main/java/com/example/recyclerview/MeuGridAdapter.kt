package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuGridAdapter(
    private val dataSet: List<Contatos>,
    private val listener2: (Contatos) -> Unit
) : RecyclerView.Adapter<MeuGridAdapter.MeuViewHolderGrid>() {

    class MeuViewHolderGrid(view: View) : RecyclerView.ViewHolder(view) {
        private val nomeContato by lazy { view.findViewById<TextView>(R.id.txtGridRecycler) }
        private val imagem by lazy { view.findViewById<ImageView>(R.id.imageGrid ) }

        fun bind(contato: Contatos) {

            imagem.setImageResource(contato.imagem)
            nomeContato.text = contato.nomeContato
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolderGrid {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.modelo_grid_layout, parent, false)

        return MeuViewHolderGrid(view)
    }

    override fun onBindViewHolder(holder: MeuViewHolderGrid, position: Int) {
        val itemGrid = dataSet[position]
        holder.bind(itemGrid)

        holder.itemView.setOnClickListener { listener2(itemGrid) }
    }

    override fun getItemCount() = dataSet.size

}

