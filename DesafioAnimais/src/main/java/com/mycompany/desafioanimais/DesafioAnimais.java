/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafioanimais;

import java.util.Scanner;

/**
 *
 * @author ygor
 */
public class DesafioAnimais {
     public static int EscolhaMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1- Cadastrar Animal");
        System.out.println("2 - Listar animal: ");
        System.out.println("escolha uma opção: ");
        return sc.nextInt();
    }

    public static Animal CadastrarAnimal(){
        Scanner sc = new Scanner(System.in);
        int idade, tipo;
        String nome;
        Animal animal = null;
        
        System.out.println("informe o nome do animal: ");
        nome = sc.nextLine();

        System.out.println("Informe a idade do animal:");
        idade = sc.nextInt();

        
        do{
            System.out.println("qual o tipo de animal desejado: ");
            System.out.println("1 - Foca");
            System.out.println("2 - Leão");
            System.out.println("3 - Pinguim");
            System.out.println("4 - Urso");
            tipo = sc.nextInt();
        
            switch (tipo) {
                case 1:
                    animal =  new Foca(nome, idade);
                    break;
                case 2:
                    animal = new Leao(nome, idade);
                    break;
                case 3:
                    animal = new Pinguim(nome, idade);
                    break;
                case 4:
                    animal = new Urso(nome,idade);
                    break;
                default:
                    System.out.println("ERRO! Escolha uma opção");
                    break;
            }
        }while(tipo > 4 || tipo < 1);
        return animal;
    }

    public static void mostrarListaAnimais(Animal[] animais){
        for(int i = 0; i< animais.length; i++){
            System.out.println(animais[i].mostrarAnimal());
        }
    }
    public static void inserirAnimalNoVetor(Animal[] animais, Animal animal){
        for(int i=0; i  < animais.length; i++){
            if(animais[i] == null){
                animais[i] = animal;
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int escolha = 0;
        int tamanho = 10;
        Animal[] zoologico = new Animal[tamanho];
        Animal animal = null;

        while(escolha < 1 || escolha > 2){
            escolha = EscolhaMenu();
        }

        switch (escolha) {
            case 1:
                CadastrarAnimal();
                inserirAnimalNoVetor(zoologico, animal);;
                break;
            case 2:
                mostrarListaAnimais(zoologico);
                break;
            default:
                break;
        }
    }
}
