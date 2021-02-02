package com.example.recyclerview

import android.media.Image
import android.widget.ImageView

data class Contatos (val nomeContato: String, val imagem: Int) {
    var mensagem:String = ""
    var hora: String = ""

    constructor( nomeContato: String, mensagem: String, hora: String, imagem: Int ): this (nomeContato, imagem){
        this.mensagem = mensagem
        this.hora = hora
    }

}