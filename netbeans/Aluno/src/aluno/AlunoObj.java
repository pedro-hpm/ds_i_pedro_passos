/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

/**
 *
 * @author CAMARGO
 */
public class AlunoObj {
    
    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIadade(int idade) {
        this.idade = idade;
    }
    
    public String getAluno() {
        return "Aluno: " + nome + " Idade: " + idade;
    }
}
