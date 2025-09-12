package com.mycompany.desafioveiculos;
public class Carro extends Veiculo {

    /**
     *
     * @param marca
     * @param modelo
     * @param ano
     */
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    
    @Override
    public float calcularDiaria(float valor) {
        return 100 * valor;
    }
    
}
