/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

// criar um arquivo pra cada operação

import model.Venda;
import model.Veiculo;
import model.Funcionario;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author hiago
 */

public class Concessionaria implements OperacoesConcessionaria{
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Funcionario> funcionarios = new ArrayList<>();
    private final List<Veiculo> veiculos = new ArrayList<>();
    private final List<Venda> vendas = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    private int lerInt(String mensagem) {
        while (true) { 
            try {
                System.out.print(mensagem);
                int numero = input.nextInt();
                input.nextLine(); 
                return numero; 
            }
            catch (InputMismatchException e) {
                System.err.println("Exceção: " + e);
                input.nextLine(); 
                System.out.println("Entre com valores inteiros");
            }
        }
    }

    private double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double numero = input.nextDouble();
                input.nextLine();
                return numero;
            } 
            catch (java.util.InputMismatchException e) {
                System.err.println("Exceção: " + e);
                input.nextLine(); 
                System.out.println("Entre com valores flutuantes");
            }
        }
    }
    
    @Override
    public void cadastrarCliente(String nome, String numTelefone, String emailPessoal, String rg, String cpf){
        Cliente novoCliente = new Cliente(nome, numTelefone, emailPessoal, rg, cpf);
        this.clientes.add(novoCliente);
        System.out.println("Novo cliente salvo na lista: " + novoCliente.getNome());
    }
    
    @Override
    public Cliente consultarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente; 
            }
        }
        return null;
    }
    
    @Override
    public void alterarCliente(String novoNome, String novoNumTelefone, String novoEmail, String cpf) {
        Cliente clienteParaAlterar = this.consultarCliente(cpf); 

        if (clienteParaAlterar != null) {
            clienteParaAlterar.setNome(novoNome);
            clienteParaAlterar.setNumTelefone(novoNumTelefone);
            clienteParaAlterar.setEmailPessoal(novoEmail);
        }
    }
    
    @Override
    public void removerCliente(String cpf) {
        Cliente clienteParaRemover = this.consultarCliente(cpf);

        if (clienteParaRemover != null) {
            this.clientes.remove(clienteParaRemover);
        }
    }
    
    @Override
    public String getRelatorioClientes() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- LISTA DE CLIENTES ---\n\n");
    
        if (clientes.isEmpty()) {
            sb.append("Nenhum cliente cadastrado.");
        } else {
            for (model.Cliente c : clientes) {
                sb.append("Nome: ").append(c.getNome()).append("\n");
                sb.append("CPF:  ").append(c.getCpf()).append("\n");
                sb.append("-------------------------\n");
            }
        }
        return sb.toString();
    }
    
    @Override
    public void cadastrarFuncionario(){
        System.out.print("Digite o nome do funcionario: ");
        String nome = input.nextLine();
        
        int numMatricula = lerInt("Digite o número de matrícula do funcionario: ");
        
        System.out.print("Digite a qualificação do funcionario: ");
        String qualificacao = input.nextLine();
        
        System.out.print("Digite a descrição da função do funcionario: ");
        String descricaoFuncao = input.nextLine();
        
        int cargaHorariaSemanal = lerInt("Digite a carga horária semanal do funcionario: ");
        
        Funcionario novoFuncionario = new Funcionario(nome, numMatricula, qualificacao, descricaoFuncao, cargaHorariaSemanal);
        this.funcionarios.add(novoFuncionario);
        
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    
    @Override
    public Funcionario consultarFuncionario(){
            if (!funcionarios.isEmpty()){
            System.out.println("\n--- Lista de Funcionários Cadastrados ---");
            for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println((i + 1) + " - " + funcionarios.get(i).getNome());
            }
            System.out.println("-------------------------------------");

            int escolha = lerInt("Digite o número do Funcionário: ");

            if (escolha > 0 && escolha <= funcionarios.size()) {
                Funcionario funcionarioEscolhido = funcionarios.get(escolha - 1);
                funcionarioEscolhido.exibeFuncionario();
                return funcionarioEscolhido;
            } 
            else {
                System.out.println("Opção inválida!");
                return null;
            }
        }
        else {
                System.out.println("Opção inválida!");
                return null;
            }
    }   
    
    @Override
    public void alterarFuncionario(){
        Funcionario funcionarioParaAlterar = consultarFuncionario();
        if (funcionarioParaAlterar != null) {
            System.out.print("Digite o novo nome do funcionario: ");
            String novoNome = input.nextLine();
            
            int novoNumMatricula = lerInt("Digite o novo número da matrícula do funcionario: ");
            
            System.out.print("Digite a nova qualificação do funcionario: ");
            String novaQualificacao = input.nextLine();
            
            System.out.print("Digite o novo descrição da função do funcionario: ");
            String novaDescricao = input.nextLine();
           
            int novaCarga = lerInt("Digite a nova carga horária semanal do funcionario: ");
            
            funcionarioParaAlterar.setNome(novoNome);
            funcionarioParaAlterar.setNumMatricula(novoNumMatricula);
            funcionarioParaAlterar.setQualificacao(novaQualificacao);
            funcionarioParaAlterar.setDescricaoFuncao(novaDescricao);
            funcionarioParaAlterar.setCargaHorariaSemanal(novaCarga); 

            System.out.println("\nFuncionário alterado com sucesso!");

            funcionarioParaAlterar.exibeFuncionario();
        } 
        else {
        System.out.println("Operação de alteração cancelada.");
        }
    }
    
    @Override
    public void removerFuncionario(){
        Funcionario funcionarioRemove = consultarFuncionario();
        if (funcionarioRemove != null) {
            funcionarios.remove(funcionarioRemove);
            System.out.println("Funcionário removido com sucesso!");
        }
        else{
            System.out.println("Operação de remoção cancelada");
        }
    }
    
    @Override
     public void relatorioFuncionarios() {
        System.out.println("\n--- Relatório Completo de Funcionários ---");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibeFuncionario();
            System.out.println(); 
        }
    }
    
    @Override
    public void cadastrarVeiculo(){
        System.out.print("Digite o nome do veículo: ");
        String nome = input.nextLine();
        
        System.out.print("Digite a cor do veículo: ");
        String cor = input.nextLine();
        
        int numMarchas = lerInt("Digite o número de marchas do veículo: ");
        
        int numPortas = lerInt("Digite o número de portas do veículo: ");
        
        System.out.print("Digite a marca do veículo: ");
        String marca = input.nextLine();
        
        System.out.println("Digite o ano de fabricaçaõ do veículo: ");
        String anoFabricacao = input.nextLine();
        
        Veiculo novoVeiculo = new Veiculo(nome, cor, numMarchas, numPortas, marca, anoFabricacao);
        this.veiculos.add(novoVeiculo);
        
        System.out.println("Veiculo cadastrado com sucesso!");
    }
    
    @Override
    public Veiculo consultarVeiculo(){
            if (!veiculos.isEmpty()){
            System.out.println("\n--- Lista de Veiculos Cadastrados ---");
            for (int i = 0; i < veiculos.size(); i++) {
                System.out.println((i + 1) + " - " + veiculos.get(i).getNome());
            }
            System.out.println("-------------------------------------");

            int escolha = lerInt("Digite o número do veículo: ");

            if (escolha > 0 && escolha <= veiculos.size()) {
                Veiculo veiculoEscolhido = veiculos.get(escolha - 1);
                veiculoEscolhido.exibeVeiculo();
                return veiculoEscolhido;
            } 
            else {
                System.out.println("Opção inválida!");
                return null;
            }
        }
        else{
                System.out.println("Opção inválida!");
                return null;
            }
    }
    
    @Override
    public void alterarVeiculo(){
        Veiculo veiculoParaAlterar = consultarVeiculo();
        if (veiculoParaAlterar != null) {
            System.out.print("Digite o novo nome do veículo: ");
            String novoNome = input.nextLine();
            
            System.out.print("Digite a nova cor do veículo: ");
            String novaCor = input.nextLine();

            int novoNumMarchas = lerInt("Digite o novo número de marchas do veículo: ");
            
            int novoNumPortas = lerInt("Digite o novo número de portas do veículo: ");
            
            System.out.print("Digite a nova marca do veículo: ");
            String novaMarca = input.nextLine();
           
            System.out.print("Digite o novo ano de fabricação do veículo: ");
            String novoAno = input.nextLine();
            
            veiculoParaAlterar.setNome(novoNome);
            veiculoParaAlterar.setCor(novaCor);
            veiculoParaAlterar.setNumMarchas(novoNumMarchas);
            veiculoParaAlterar.setNumPortas(novoNumPortas);
            veiculoParaAlterar.setMarca(novaMarca);
            veiculoParaAlterar.setAnoFabricacao(novoAno);

            System.out.println("\nVeiculo alterado com sucesso!");

            veiculoParaAlterar.exibeVeiculo();
    } else {
        System.out.println("Operação de alteração cancelada.");
    }
    }
    
    @Override
    public void removerVeiculo(){
        Veiculo veiculoRemove = consultarVeiculo();
        if (veiculoRemove != null) {
            veiculos.remove(veiculoRemove);
            System.out.println("Veiculo removido com sucesso!");
        }
        else{
            System.out.println("Operação de remoção cancelada");
        }
    }
    
    @Override
     public void relatorioVeiculos() {
        System.out.println("\n--- Relatório Completo de Veículos ---");
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        for (Veiculo veiculo : veiculos) {
            veiculo.exibeVeiculo();
            System.out.println(); 
        }
    }
    
    @Override
    public void cadastrarVenda(){
        if (!clientes.isEmpty() && !funcionarios.isEmpty() && !veiculos.isEmpty()){
            System.out.print("Digite a data da venda: ");
            String data = input.nextLine();
  
            double valor = lerDouble("Digite o valor da venda: ");
     
            System.out.print("Cliente da venda: ");
            //Cliente cliente = consultarCliente();
            
            System.out.print("O funcionario da venda: ");
            Funcionario funcionario = consultarFuncionario();
            
            System.out.println("O veículo da venda: ");
            Veiculo veiculo = consultarVeiculo();
            
            //Venda novaVenda = new Venda(data, valor, cliente, funcionario, veiculo);
            //this.vendas.add(novaVenda);
            
            System.out.println("Veiculo cadastrado com sucesso!");
        }
        else{
            System.out.println("Você não pode cadastrar uma venda! Verifique se há cliente, funcionário e veículos cadastrados.");
        }
    }
    
    @Override
    public Venda consultarVenda(){
        if (!vendas.isEmpty()){
            System.out.println("\n--- Lista de Vendas Cadastradas ---");
            for (int i = 0; i < vendas.size(); i++) {
                System.out.println((i + 1) + " - " + vendas.get(i).getVeiculo().getNome());
            }
            System.out.println("-------------------------------------");

            int escolha = lerInt("Digite o número do venda: ");

            if (escolha > 0 && escolha <= vendas.size()) {
                Venda vendaEscolhida = vendas.get(escolha - 1);
                vendaEscolhida.exibeVenda();
                return vendaEscolhida;
            } 
            else {
                System.out.println("Opção inválida!");
                return null;
            }
        }
        else {
                System.out.println("Opção inválida!");
                return null;
            }
    }    
   
    @Override
    public void alterarVenda(){
        Venda vendaParaAlterar = consultarVenda();
        if (vendaParaAlterar != null) {
            System.out.print("Digite a nova data da venda: ");
            String novaData = input.nextLine();
            
            double novoValor = lerDouble("Digite o novo valor da venda: ");
            
            System.out.print("Altere o cliente da venda: ");
            //Cliente novoCliente = consultarCliente();
           
            System.out.print("Altere o funcionario da venda: ");
            Funcionario novoFuncionario = consultarFuncionario();
            
            System.out.println("Altere o veículo da venda: ");
            Veiculo novoVeiculo = consultarVeiculo();
            
            vendaParaAlterar.setData(novaData);
            vendaParaAlterar.setValor(novoValor);
           // vendaParaAlterar.setCliente(novoCliente);
            vendaParaAlterar.setFuncionario(novoFuncionario);
            vendaParaAlterar.setVeiculo(novoVeiculo);

            System.out.println("Venda alterada com sucesso!");

            vendaParaAlterar.exibeVenda();
            } 
            else {
            System.out.println("Operação de alteração cancelada.");
        }
    }
    
    /**
     *
     */
    @Override
    public void removerVenda(){
        Venda vendaRemove = consultarVenda();
        if (vendaRemove != null) {
            vendas.remove(vendaRemove);
            System.out.println("Venda removida com sucesso!");
        }
        else{
            System.out.println("Operação de remoção cancelada");
        }
    }
    
    @Override
     public void relatorioVendas() {
        System.out.println("\n--- Relatório Completo de Vendas ---");
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada.");
            return;
        }
        for (Venda venda : vendas) {
            venda.exibeVenda(); 
            System.out.println(); 
        }
    }
    
}
            