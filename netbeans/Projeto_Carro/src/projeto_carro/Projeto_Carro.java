package projeto_carro;

import java.util.*;

public class Projeto_Carro {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com os dados do carro: ");
        
        System.out.print("Marca: ");
        String marca = scan.nextLine();
        
        System.out.print("Modelo: ");
        String modelo = scan.nextLine();
        
        System.out.print("Data de fabricação: ");
        String fabricacao = scan.nextLine();
        
        System.out.print("Cor: ");
        String cor = scan.nextLine();
        
        System.out.println("Capacidade de passageiros: ");
        int capacidade = scan.nextInt();
        
        System.out.print("Velocidade inicial: ");
        double velocidade = scan.nextDouble();

        Carro carro = new Carro(modelo, marca, fabricacao, cor, capacidade, velocidade);

        //...
        System.out.print("trocar de  marcha ou manter a mesma? ");
        //...

        System.out.println(carro);
        
        System.out.println(carro.Acelerar(20.0));

        System.out.println(carro.Freiar(10.0));

        scan.close();
    }
    
}
