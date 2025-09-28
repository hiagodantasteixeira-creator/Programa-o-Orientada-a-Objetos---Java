/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contapoupanca;

/**
 *
 * @author hiago
 */
public class teste {
    public static void main(String[] args){
        ContaPoupanca minhaPoupanca = new ContaPoupanca(1234, 21, 4, 4321, "Higao", 2345.98);

        System.out.println(">>> Extrato Inicial:");
        minhaPoupanca.imprimirExtrato();

        System.out.println();

        minhaPoupanca.somarSaldo();

        System.out.println();

        System.out.println(">>> Extrato Final (após somar R$ 100,00):");
        minhaPoupanca.imprimirExtrato();
    }
}
