/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod54;

/**
 *
 * @author ygor
 */
public class Pagamento implements IPagamento {
    String MeioDePagamento;
    
    @Override
    public void executarPagamento(String meioDePagamento) {
        System.out.println("conta paga com " + meioDePagamento);
    }
    
}
