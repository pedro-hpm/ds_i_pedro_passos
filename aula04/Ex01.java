package aula04;
import javax.swing.*;


public class Ex01 {
    
    public static void main(String[] args) {
    
        String nome = JOptionPane.showInputDialog("qual seu nome?");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("qual seu peso?"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("qual a sua altura"));
        String classificacao = "";
        
        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if (imc <= 29.9) {
            classificacao = "Acima do peso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade grau II (severa)";
        } else if (imc >= 40) {
            classificacao = "Obesidade III (mórbida)";
        }
        
        String output = "O imc de " + nome + " é: IMC = " + imc + "\nClassificação: " + classificacao;
        JOptionPane.showMessageDialog(null, output);


}
}
