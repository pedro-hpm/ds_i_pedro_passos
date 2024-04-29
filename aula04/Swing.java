package aula04;
import javax.swing.*;
public class Swing {

  public static void main(String[] args) {
    /* JOptionPane Java user input example*/
    String nome = JOptionPane.showInputDialog("Qual o seu nome?");
    String output = nome + ", que nome bosta hein?!";
    JOptionPane.showMessageDialog(null, output);
  }
}