/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

/**
 *
 * @author hiago
 */
public class Cliente extends Pessoa {
    private String emailPessoal;

    public Cliente(String nome, String cpf, String endereco, String numTelefone, String emailPessoal) {
        super(nome, cpf, endereco, numTelefone);
        this.emailPessoal = emailPessoal;
    }

    public String getEmailPessoal(){
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
  
    public void exibeCliente(){
        System.out.println("--- Detalhes do Cliente ---");
        System.out.println("Nome: " + getNome()); 
        System.out.println("CPF: " + getCpf()); 
        System.out.println("Telefone: " + getNumTelefone()); 
        System.out.println("Endereço: " + getEndereco()); 
        System.out.println("Email: " + getEmailPessoal());
        System.out.println("---------------------------");
    }
}
