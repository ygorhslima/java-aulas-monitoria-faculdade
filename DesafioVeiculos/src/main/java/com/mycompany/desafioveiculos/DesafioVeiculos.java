package com.mycompany.desafioveiculos;

import java.util.Scanner;

public class DesafioVeiculos {
    
    public static int MenuVeiculos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------MENU--------------");
        System.out.println(" 1 - Cadastrar um Veículo");
        System.out.println(" 2 - Listar os Veículos");
        return teclado.nextInt();
    }
    public static Veiculo CadastrarVeiculo(){
        Scanner teclado = new Scanner(System.in);
        String marca;String modelo; int ano; int tipoVeiculo = 0;
        Veiculo veiculo = null;
        
        System.out.println("Informe a marca do veículo: ");
        marca = teclado.nextLine();
        System.out.println("Informe o modelo do veículo: ");
        modelo = teclado.nextLine();
        System.out.println("Informe o ano do veículo: ");
        ano = teclado.nextInt();
        
        do{
            System.out.println("Qual o tipo de veículo desejado?: ");
            System.out.println("1 - Carro");
            System.out.println("2 - Caminhão");
            System.out.println("3 - Moto");
            tipoVeiculo = teclado.nextInt();
            switch (tipoVeiculo) {
                case 1:
                    veiculo = new Carro(marca, modelo, ano);
                    break;
                case 2:
                    veiculo = new Caminhao(marca, modelo, ano);
                    break;
                case 3:
                    veiculo = new Moto(marca, modelo, ano);
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while ((tipoVeiculo > 3) || (tipoVeiculo < 1));
        
        return veiculo;
    }
    
    public static void inserirVeiculoNoVetor(Veiculo[] veiculos, Veiculo veiculo){
        for(int i=0; i < veiculos.length; i++){
            if(veiculos[i] == null){
                veiculos[i] = veiculo;
                break;
            }
        }
    }
    
    public static void mostrarListaVeiculos(Veiculo[] veiculos){
        for(int i=0; i < veiculos.length; i++){
            System.out.println(veiculos[i].mostrarDadosVeiculo());
        }
    }
    
    public static void main(String[] args) {
        int tam=4,escolha=0;
        Veiculo[] veiculos = new Veiculo[tam];
        Veiculo veiculo = null;
        do{
            // a opção que o usuário vai digitar no menu entrará para dentro da variável escolha
            // que será analisada no switch case
            escolha = MenuVeiculos();
            switch (escolha) {
                case 1:
                    veiculo = CadastrarVeiculo();
                    inserirVeiculoNoVetor(veiculos, veiculo);
                    break;
                case 2:
                    mostrarListaVeiculos(veiculos);
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }        
        }while(escolha != 0);
    }
}
