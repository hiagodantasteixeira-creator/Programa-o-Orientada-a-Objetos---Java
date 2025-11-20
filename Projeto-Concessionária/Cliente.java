/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hiago
 */
public class Cliente extends Pessoa{
    private String numTelefone;
    private String emailPessoal;
    private String rg;
    private String cpf;

    public Cliente(String nome, String numTelefone, String emailPessoal, String rg, String cpf) {
        super(nome);
        this.numTelefone = numTelefone;
        this.emailPessoal = emailPessoal;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
   
  
    public void exibeCliente() {
        System.out.println("--- Detalhes do Cliente ---");
        System.out.println("Nome: " + getNome()); 
        System.out.println("Telefone: " + getNumTelefone());
        System.out.println("Email: " + getEmailPessoal());
        System.out.println("RG: " + getRg()); 
        System.out.println("CPF: " + getCpf()); 
        System.out.println("---------------------------");
    }
}
