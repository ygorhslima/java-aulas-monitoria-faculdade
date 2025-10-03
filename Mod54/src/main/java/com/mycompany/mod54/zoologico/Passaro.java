package com.mycompany.mod54.zoologico;

import com.mycompany.mod54.IVoador;
import com.mycompany.mod54.zoologico.Animal;

public class Passaro extends Animal implements IVoador {

    @Override
    public void emitirSom() {
        System.out.println("piu piu");
    }

    @Override
    public void andar() {
        System.out.println("dando pulinhos");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void comer() {
        System.out.println("Comendo sementes");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo");
    }
    
    
    
}
