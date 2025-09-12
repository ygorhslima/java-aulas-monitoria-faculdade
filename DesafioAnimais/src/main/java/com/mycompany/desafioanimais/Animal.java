package com.mycompany.desafioanimais;
abstract class Animal{
    // atributos privados: nome(String) e idade(int)
    private String nome;
    private int idade;

    //métodos públicos para acessar e modificar os atributos (getters e setters)
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public Animal(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    public void emitirSom(){
        System.out.println("som de animal genérico");
    }

    //implemente o método toString() para exibir informações do animal
    public String mostrarAnimal(){
        return ("Nome: " + this.nome + 
        "\nIdade: " + this.idade);
    }   
}