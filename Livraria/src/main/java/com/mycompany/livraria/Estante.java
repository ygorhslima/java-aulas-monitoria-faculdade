/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria;

/**
 *
 * @author ygor
 */
public class Estante {
    Livro[] livros;

    public Estante(int tamanho){
        this.livros = new Livro[tamanho];
    }
    public void mostrarLivros(){
        for (int i = 0; i < this.livros.length; i++){
            System.out.println(livros[i].mostrarDadosLivro());
        }
    }
}
