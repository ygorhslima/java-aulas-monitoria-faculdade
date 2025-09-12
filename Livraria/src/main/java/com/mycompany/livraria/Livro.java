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
public class Livro {
     //atributos
    String titulo;
    String autor;
    String categoria;
    int quant_paginas;
    int isbn;
    double preco;

    public Livro(){
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome do livro: ");
        this.titulo = teclado.nextLine();

        System.out.printf("Informe a categoria: ");
        this.categoria = teclado.nextLine();

        System.out.printf("Informe o autor do livro: ");
        this.autor = teclado.nextLine();

        System.out.printf("Informe a quantidade de página:  ");
        this.quant_paginas = teclado.nextInt();
        teclado.nextLine();

        System.out.printf("Informe o preço do livro: ");
        this.preco = teclado.nextDouble();

        System.out.printf("Informe o código: ");
        this.isbn = teclado.nextInt();
    }

    public void abrirLivro(){
        System.out.println("Livro aberto");
    }
    public void fecharlivro(){
        System.out.println("Livro fechado");
    }
    
    public void lerLivro(){
        System.out.println("lendo livro");
    }

    public void venderLivro(){
        System.out.println("Vendendo livro");
    }

    public void alterarPreco(double novopreco){
        this.preco = novopreco;
        System.out.println("O valor do livro foi alterado para: " + novopreco);
    }

    public void receberDesconto(int desconto){
        this.preco = this.preco - (this.preco * desconto / 100);
        System.out.println("o valor do livro com desconto é: " + this.preco);
    }

    public String mostrarDadosLivro(){
        return ("\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nCategoria: " + this.categoria + 
                "\nQuantidade de páginas: " + this.quant_paginas +
                "\nCódigo: " + this.isbn);
    }
}
