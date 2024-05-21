package projeto_carro;

public class Carro {
    public int Rodas;
    public int Portas;
    public String Nome;
    public String Marca;
    public double Vel;
    public boolean Buzina;

    public Carro(String nome, String marca, double vel, String buzina) {
        Rodas = 4;
        Portas = 4;
        Nome = nome;
        Marca = marca;
        Vel = vel;
        if (buzina == "sim") {
            Buzina = true;
        }
    }

    public double Acelerar(double vel) {
        //System.out.println(Vel);

        Vel += vel;

        return Vel;
    }

    public double Freiar(double vel) {
        Vel -= vel;

        return Vel;
    }
}

