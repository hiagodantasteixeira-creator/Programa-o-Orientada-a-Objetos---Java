/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

/**
 *
 * @author hiago
 */
public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, String numTelefone, double salario) {
        super(nome, cpf, endereco, numTelefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
        
    public void exibeFuncionario(){
        System.out.println("--- Detalhes do Funcionário ---");
        System.out.println("Nome: " + getNome()); 
        System.out.println("CPF: " + getCpf()); 
        System.out.println("Telefone: " + getNumTelefone()); 
        System.out.println("Endereço: " + getEndereco()); 
        System.out.println("Salário: " + getSalario());
        System.out.println("---------------------------");
    }
}
