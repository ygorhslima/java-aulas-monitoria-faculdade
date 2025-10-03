package com.mycompany.mod54.zoologico;

public class Leao extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Roaaaaaarrr!!!!!!!!!!");
    }

    @Override
    public void andar() {
        System.out.println("andando");
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
