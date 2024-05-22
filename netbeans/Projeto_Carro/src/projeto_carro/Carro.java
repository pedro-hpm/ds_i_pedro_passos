package projeto_carro;

public class Carro {
    public String Modelo;
    public String Marca;
    public String Data_fabricacao;
    public String Cor;
    public int Rodas;
    public int Portas;
    public int Capacidade_passageiros;
    // public double Quilometragem;
    public double Velocidade;

    public Carro(String modelo, String marca, String data_fabricacao, String cor, int capacidade_passageiros, double vel) {
        Modelo = modelo;
        Marca = marca;
        Data_fabricacao = data_fabricacao;
        Cor = cor;
        Capacidade_passageiros = capacidade_passageiros;
        Velocidade = vel;
        Rodas = 4;
        Portas = 4;
    }

    public double Acelerar(double vel) {
        //System.out.println(Vel);

        Velocidade += vel;

        return Velocidade;
    }

    public double Freiar(double vel) {
        Velocidade -= vel;

        return Velocidade;
    }

    public String TrocaMarcha() {
        // + 10 km/h a cada marcha (inicial 20)
        if (Velocidade > 0) {
            return "Primeira marcha";
        } 
        else if (Velocidade >= 20) {
            return "Segunda marcha";
        } 
        else if (Velocidade >= 50) {
            return "Terceira marcha";
        } 
        else if (Velocidade >= 80) {
            return "Quarta marcha";
        } 
        else if (Velocidade >= 120) {
            return "Quinta marcha";
        } 
        else {
            return "Neutro";
        }
    }

    public String Re() {
        if (TrocaMarcha() != "Neutro") {
            return "Seu carro nao pode dar ré, porque seu carro esta em movimento";
        }
        else {
            return "Dando ré..."; 
        }
    }

    public void Buzinar(String buzina) {
        if (buzina == "sim") {
            System.out.println("Buzinando...");
        }
    }
}

