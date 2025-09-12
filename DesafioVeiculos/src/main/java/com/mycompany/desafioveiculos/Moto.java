package com.mycompany.desafioveiculos;
public class Moto extends Veiculo{

    /**
     *
     * @param marca
     * @param modelo
     * @param ano
     */
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public float calcularDiaria(float valor) {
        return 50 * valor;
    }    
}
