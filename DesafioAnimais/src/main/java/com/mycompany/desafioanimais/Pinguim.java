/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioanimais;

/**
 *
 * @author ygor
 */
public class Pinguim extends Animal {
    public Pinguim(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("gack! gack! gack!");   
    }

    @Override
    public String mostrarAnimal() {
        return ("Nome: " + this.getNome() +  
        "\nIdade: " + this.getIdade());
    }

}
