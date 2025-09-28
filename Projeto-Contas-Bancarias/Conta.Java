/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contapoupanca;

/**
 *
 * @author hiago
 */
public abstract class Conta {
    private int codigo;
    private String nomeProprietario;
    private double saldo;

    public Conta(int codigo, String nomeProprietario, double saldo) {
        this.codigo = codigo;
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void somarSaldo();
}
