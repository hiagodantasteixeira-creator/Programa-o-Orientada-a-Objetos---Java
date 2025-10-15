/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

/**
 *
 * @author hiago
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String numTelefone;

    public Pessoa(String nome, String cpf, String endereco, String numTelefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
    
}
