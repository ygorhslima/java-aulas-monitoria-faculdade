/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria;

import java.util.Scanner;

/**
 *
 * @author ygor
 */
public class main {
    public static void main(String[] args) {
        Estante e;
        int tamanho;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o tamanho da estante: ");
        tamanho = teclado.nextInt();
        
        e = new Estante(tamanho);
       
        for(int i = 0; i < tamanho; i++){
            Livro livro = new Livro();
            e.livros[i] = livro;
        }

        e.mostrarLivros();
    }
}
