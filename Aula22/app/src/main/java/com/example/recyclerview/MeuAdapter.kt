package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.modelo_recycler.view.*

class MeuAdapter (private val dataSet: List<Contatos>, private val listener: (Contatos) -> Unit): RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder (view: View) : RecyclerView.ViewHolder(view){
     private val nomeContato by lazy { view.findViewById<TextView>(R.id.txtNomeContato) }
     private val ultimaMensagem by lazy { view.findViewById<TextView>(R.id.txtUltimaConversa) }
     private val hora by lazy { view.findViewById<TextView>(R.id.txtHora) }
     private val imagem by lazy { view.findViewById<ImageView>(R.id.imagemRecycler)}

        fun bind (contato: Contatos){

            imagem.setImageResource(contato.imagem)
            nomeContato.text = contato.nomeContato
            ultimaMensagem.text = contato.mensagem
            hora.text = contato.hora


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuAdapter.MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.modelo_recycler, parent, false)

        return MeuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeuAdapter.MeuViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = dataSet.size

}