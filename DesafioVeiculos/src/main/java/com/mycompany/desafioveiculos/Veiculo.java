package com.mycompany.desafioveiculos;
public abstract class Veiculo{
    private String marca;
    private String modelo;
    private int ano;

    /**
     *
     * @param marca
     * @param modelo
     * @param ano
     */
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public abstract float calcularDiaria(float valor);
    
    public String mostrarDadosVeiculo(){
        return ("Marca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() + 
                "\nAno: " + this.getAno());
    }
}
