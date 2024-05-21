package projeto_carro;

import java.util.*;

public class Projeto_Carro {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        String marca = scan.nextLine();
        double vel = scan.nextDouble();
        String buzina = scan.nextLine();

        Carro carro = new Carro(nome, marca, vel, buzina);

        System.out.println(carro);
        
        System.out.println(carro.Acelerar(20.0));

        System.out.println(carro.Freiar(10.0));

        System.out.println(carro.Buzina);

        scan.close();
    }
    
}
