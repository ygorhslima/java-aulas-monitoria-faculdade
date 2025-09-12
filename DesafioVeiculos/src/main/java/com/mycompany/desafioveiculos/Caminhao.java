package com.mycompany.desafioveiculos;
public class Caminhao extends Veiculo {

    /**
     *
     * @param marca
     * @param modelo
     * @param ano
     */
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public float calcularDiaria(float valor) {
        return 200 * valor;
    }
    
}
