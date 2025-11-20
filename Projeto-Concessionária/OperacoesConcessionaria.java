/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Venda;
import model.Veiculo;
import model.Funcionario;
import model.Cliente;

/**
 *
 * @author hiago
 */
interface OperacoesConcessionaria{
    
    void cadastrarCliente(String nome, String numTelefone, String emailPessoal, String rg, String cpf);
    Cliente consultarCliente(String cpf);
    void alterarCliente(String novoNome, String novoNumTelefone, String novoEmail, String cpf);
    void removerCliente(String cpf);
    String getRelatorioClientes();
    
    void cadastrarFuncionario();
    Funcionario consultarFuncionario();
    void alterarFuncionario();
    void removerFuncionario();
    void relatorioFuncionarios();
    
    void cadastrarVeiculo();
    Veiculo consultarVeiculo();
    void alterarVeiculo();
    void removerVeiculo();
    void relatorioVeiculos();
    
    void cadastrarVenda();
    Venda consultarVenda();
    void alterarVenda();
    void removerVenda();
    void relatorioVendas();
    
}
