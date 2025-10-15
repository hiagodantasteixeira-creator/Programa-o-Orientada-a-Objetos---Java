/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

/**
 *
 * @author hiago
 */
interface OperacoesConcessionaria{
    
    void cadastrarCliente();
    Cliente consultarCliente();
    void alterarCliente();
    void removerCliente();
    
    void cadastrarFuncionario();
    Funcionario consultarFuncionario();
    void alterarFuncionario();
    void removerFuncionario();
    
    void cadastrarVeiculo();
    Veiculo consultarVeiculo();
    void alterarVeiculo();
    void removerVeiculo();
    
    void cadastrarVenda();
    Venda consultarVenda();
    void alterarVenda();
    void removerVenda();
    
}
