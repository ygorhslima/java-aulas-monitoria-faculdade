package com.mycompany.mod54.zoologico;

import com.mycompany.mod54.IVoador;
import com.mycompany.mod54.zoologico.Animal;

public class BeijaFlor extends Animal implements IVoador {

    @Override
    public void voar() {
        System.out.println("Voando Rápido");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não faz som");
    }

    @Override
    public void andar() {
        
    }

    @Override
    public void comer() {
    }

    @Override
    public void dormir() {
    }
    
}
