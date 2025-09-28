/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contapoupanca;

/**
 *
 * @author hiago
 */
public class ContaPoupanca extends Conta{
    private int numConta;
    private int numAgencia;
    private int variacao;

    public ContaPoupanca(int numConta, int numAgencia, int variacao, int codigo, String nomeProprietario, double saldo) {
        super(codigo, nomeProprietario, saldo);
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.variacao = variacao;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getVariacao() {
        return variacao;
    }

    public void setVariacao(int variacao) {
        this.variacao = variacao;
    }
    
    
    
    public void somarSaldo(){
        double novoSaldo = getSaldo() + 100;
        setSaldo(novoSaldo);
        System.out.println("Somado 100 reais na conta");
    }
    
   public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupança ---");
        System.out.println("Proprietário: " + getNomeProprietario()); 
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Saldo: R$ " + getSaldo()); 
        System.out.println("-----------------------------");
    }
}
