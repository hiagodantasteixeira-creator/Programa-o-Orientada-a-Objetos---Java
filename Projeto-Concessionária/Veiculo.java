/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

/**
 *
 * @author hiago
 */
public class Veiculo {
    private String modelo;
    private String motor;
    private String cambio;
    private String cor;
    private String utilizacao;
    
    public Veiculo(String modelo, String motor, String cambio, String cor, String utilizacao) {
        this.modelo = modelo;
        this.motor = motor;
        this.cambio = cambio;
        this.cor = cor;
        this.utilizacao = utilizacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }
 
    public void exibeVeiculo(){
        System.out.println("--- Detalhes do Veiculo ---");
        System.out.println("Modelo: " + getModelo()); 
        System.out.println("Motor: " + getMotor()); 
        System.out.println("Câmbio: " + getCambio()); 
        System.out.println("Cor: " + getCor()); 
        System.out.println("Utilização: " + getUtilizacao());
        System.out.println("---------------------------");
    }
}