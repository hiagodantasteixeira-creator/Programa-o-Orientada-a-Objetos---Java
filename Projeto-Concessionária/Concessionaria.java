/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

    public static void main(String[] args) {
        Concessionaria minhaLoja = new Concessionaria();
        minhaLoja.executar();
    }
    
    public void executar() {
        int opcaoPrincipal = -1;
        while (opcaoPrincipal != 0) {
            exibirMenuPrincipal();
            opcaoPrincipal = input.nextInt();
            if (opcaoPrincipal == 1) {
                menuCliente();
            } 
            else if (opcaoPrincipal == 2) {
                menuFuncionario();
            } 
            else if (opcaoPrincipal == 3) {
                menuVeiculo();
            } 
            else if (opcaoPrincipal == 4) {
                menuVenda();
            } 
            else if (opcaoPrincipal == 0) {
                System.out.println("Encerrando o sistema...");
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
        input.close();
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n--- Gerenciamento Concessionária ---");
        System.out.println("1 - Gerenciar Clientes");
        System.out.println("2 - Gerenciar Funcionários");
        System.out.println("3 - Gerenciar Veículos");
        System.out.println("4 - Gerenciar Vendas");
        System.out.println("0 - Sair do Sistema");
        System.out.print("Escolha uma opção: ");
    }

    private void menuCliente() {
        int operacao = -1;
        while (operacao != 0) {
            System.out.println("\n--- Gerenciar Clientes ---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Cliente");
            System.out.println("3 - Alterar Cliente");
            System.out.println("4 - Remover Cliente");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma operação: ");
            operacao = input.nextInt();
            input.nextLine();
            
            if (operacao == 1) {
                cadastrarCliente();
            } 
            else if (operacao == 2) {
                consultarCliente();
            } 
            else if (operacao == 3) {
                alterarCliente();
            } 
            else if (operacao == 4) {
                removerCliente();
            } 
            else if (operacao == 0) {
                System.out.println("Voltando ao menu principal...");
            } 
            else {
                System.out.println("Operação inválida!");
            }
        }
    }

    private void menuFuncionario() {
        int operacao = -1;
        while (operacao != 0) {
            System.out.println("\n--- Gerenciar Funcionário ---");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Consultar Funcionário");
            System.out.println("3 - Alterar Funcionário");
            System.out.println("4 - Remover Funcionário");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma operação: ");
            operacao = input.nextInt();
            input.nextLine();
            
            if (operacao == 1) {
                cadastrarFuncionario();
            } 
            else if (operacao == 2) {
                consultarFuncionario();
            } 
            else if (operacao == 3) {
                alterarFuncionario();
            } 
            else if (operacao == 4) {
                removerFuncionario();
            } 
            else if (operacao == 0) {
                System.out.println("Voltando ao menu principal...");
            } 
            else {
                System.out.println("Operação inválida!");
            }
        }
    }
    
    private void menuVeiculo() {
    int operacao = -1;
        while (operacao != 0) {
            System.out.println("\n--- Gerenciar Veículos ---");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Consultar Veículo");
            System.out.println("3 - Alterar Veículo");
            System.out.println("4 - Remover Veículo");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma operação: ");
            operacao = input.nextInt();
            input.nextLine();
            
            if (operacao == 1) {
                cadastrarVeiculo();
            } 
            else if (operacao == 2) {
                consultarVeiculo();
            } 
            else if (operacao == 3) {
                alterarVeiculo();
            } 
            else if (operacao == 4) {
                removerVeiculo();
            } 
            else if (operacao == 0) {
                System.out.println("Voltando ao menu principal...");
            } 
            else {
                System.out.println("Operação inválida!");
            }
        }
    }
    
    private void menuVenda() {
        int operacao = -1;
        while (operacao != 0) {
            System.out.println("\n--- Gerenciar Vendas ---");
            System.out.println("1 - Cadastrar Venda");
            System.out.println("2 - Consultar Venda");
            System.out.println("3 - Alterar Venda");
            System.out.println("4 - Remover Venda");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma operação: ");
            operacao = input.nextInt();
            input.nextLine();
            
            if (operacao == 1) {
                cadastrarVenda();
            } 
            else if (operacao == 2) {
                consultarVenda();
            } 
            else if (operacao == 3) {
                alterarVenda();
            } 
            else if (operacao == 4) {
                removerVenda();
            } 
            else if (operacao == 0) {
                System.out.println("Voltando ao menu principal...");
            } 
            else {
                System.out.println("Operação inválida!");
            }
        } 
    }
    
    @Override
    public void cadastrarCliente(){
        System.out.print("Digite o nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = input.nextLine();
        System.out.print("Digite o enderço do cliente: ");
        String endereco = input.nextLine();
        System.out.print("Digite o número de telefone do cliente: ");
        String numTelefone = input.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = input.nextLine();
        Cliente novoCliente = new Cliente(nome, cpf, endereco, numTelefone, email);
        this.clientes.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    @Override
    public Cliente consultarCliente(){
        if (clientes.size() > 0){
            System.out.println("\n--- Lista de Clientes Cadastrados ---");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println((i + 1) + " - " + clientes.get(i).getNome());
            }
            System.out.println("-------------------------------------");

            System.out.print("Digite o NÚMERO do cliente: ");
            int escolha = input.nextInt();
            input.nextLine(); 

            if (escolha > 0 && escolha <= clientes.size()) {
                Cliente clienteEscolhido = clientes.get(escolha - 1);
                clienteEscolhido.exibeCliente();
                return clienteEscolhido;
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
    public void alterarCliente(){
        Cliente clienteParaAlterar = consultarCliente();
        if (clienteParaAlterar != null) {
            System.out.print("Digite o novo nome do cliente: ");
            String novoNome = input.nextLine();
            
            System.out.print("Digite o novo CPF do cliente: ");
            String novoCpf = input.nextLine();
            
            System.out.print("Digite o novo enderço do cliente: ");
            String novoEndereco = input.nextLine();
            
            System.out.print("Digite o novo número de telefone do cliente: ");
            String novoNumTelefone = input.nextLine();
           
            System.out.print("Digite o novo email do cliente: ");
            String novoEmail = input.nextLine();
            
            clienteParaAlterar.setNome(novoNome);
            clienteParaAlterar.setCpf(novoCpf);
            clienteParaAlterar.setEndereco(novoEndereco);
            clienteParaAlterar.setNumTelefone(novoNumTelefone);
            clienteParaAlterar.setEmailPessoal(novoEmail);

            System.out.println("\nCliente alterado com sucesso!");

            clienteParaAlterar.exibeCliente();
        } 
        else {
        System.out.println("Operação de alteração cancelada.");
        }
    }
    @Override
    public void removerCliente(){
        Cliente clienteRemove = consultarCliente();
        if (clienteRemove != null) {
            clientes.remove(clienteRemove);
            System.out.println("Cliente removido com sucesso!");
        }
        else{
            System.out.println("Operação de remoção cancelada");
        }
    }  
    
    @Override
    public void cadastrarFuncionario(){
        System.out.print("Digite o nome do funcionario: ");
        String nome = input.nextLine();
        System.out.print("Digite o CPF do funcionario: ");
        String cpf = input.nextLine();
        System.out.print("Digite o enderço do funcionario: ");
        String endereco = input.nextLine();
        System.out.print("Digite o número de telefone do funcionario: ");
        String numTelefone = input.nextLine();
        System.out.print("Digite o salário do funcionario: ");
        double salario = input.nextDouble();
        input.nextLine();
        Funcionario novoFuncionario = new Funcionario(nome, cpf, endereco, numTelefone, salario);
        this.funcionarios.add(novoFuncionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    
    @Override
    public Funcionario consultarFuncionario(){
            if (funcionarios.size() > 0){
            System.out.println("\n--- Lista de Funcionários Cadastrados ---");
            for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println((i + 1) + " - " + funcionarios.get(i).getNome());
            }
            System.out.println("-------------------------------------");

            System.out.print("Digite o NÚMERO do Funcionário: ");
            int escolha = input.nextInt();
            input.nextLine(); 

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
            
            System.out.print("Digite o novo CPF do funcionario: ");
            String novoCpf = input.nextLine();
            
            System.out.print("Digite o novo enderço do funcionario: ");
            String novoEndereco = input.nextLine();
            
            System.out.print("Digite o novo número de telefone do funcionario: ");
            String novoNumTelefone = input.nextLine();
           
            System.out.print("Digite o novo salário do funcionario: ");
            double novoSalario = input.nextDouble();
            input.nextLine();
            
            funcionarioParaAlterar.setNome(novoNome);
            funcionarioParaAlterar.setCpf(novoCpf);
            funcionarioParaAlterar.setEndereco(novoEndereco);
            funcionarioParaAlterar.setNumTelefone(novoNumTelefone);
            funcionarioParaAlterar.setSalario(novoSalario); 

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
    public void cadastrarVeiculo(){
        System.out.print("Digite o modelo do veículo: ");
        String modelo = input.nextLine();
        System.out.print("Digite o motor do veículo: ");
        String motor = input.nextLine();
        System.out.print("Digite o câmbio do veículo: ");
        String cambio = input.nextLine();
        System.out.print("Digite a cor do veículo: ");
        String cor = input.nextLine();
        System.out.print("Digite a utilização do veículo: ");
        String utilizacao = input.nextLine();
        Veiculo novoVeiculo = new Veiculo(modelo, motor, cambio, cor, utilizacao);
        this.veiculos.add(novoVeiculo);
        System.out.println("Veiculo cadastrado com sucesso!");
    }
    
    @Override
    public Veiculo consultarVeiculo(){
            if (veiculos.size() > 0){
            System.out.println("\n--- Lista de Veiculos Cadastrados ---");
            for (int i = 0; i < veiculos.size(); i++) {
                System.out.println((i + 1) + " - " + veiculos.get(i).getModelo());
            }
            System.out.println("-------------------------------------");

            System.out.print("Digite o NÚMERO do veículo: ");
            int escolha = input.nextInt();
            input.nextLine(); 

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
            System.out.print("Digite o novo modelo do veículo: ");
            String novoModelo = input.nextLine();
            
            System.out.print("Digite o novo motor do veículo: ");
            String novoMotor = input.nextLine();
            
            System.out.print("Digite o novo câmbio do veículo: ");
            String novoCambio = input.nextLine();
            
            System.out.print("Digite a nova cor do veículo: ");
            String novaCor = input.nextLine();
           
            System.out.print("Digite a nova utilização do veículo: ");
            String novaUtilizacao = input.nextLine();
            
            veiculoParaAlterar.setModelo(novoModelo);
            veiculoParaAlterar.setMotor(novoMotor);
            veiculoParaAlterar.setCambio(novoCambio);
            veiculoParaAlterar.setCor(novaCor);
            veiculoParaAlterar.setUtilizacao(novaUtilizacao);

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
    public void cadastrarVenda(){
        if (clientes.size() > 0 && funcionarios.size() > 0 && veiculos.size() > 0){
            System.out.print("Digite o ID da venda: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Digite o valor total da venda: ");
            double valor = input.nextDouble();
            input.nextLine();
            System.out.print("Digite o desconto da venda: ");
            double desconto = input.nextDouble();
            input.nextLine();
            System.out.print("Cliente da venda: ");
            Cliente cliente = consultarCliente();
            System.out.print("O funcionario da venda: ");
            Funcionario funcionario = consultarFuncionario();
            System.out.println("O veículo da venda: ");
            Veiculo veiculo = consultarVeiculo();
            Venda novaVenda = new Venda(id, valor, desconto, cliente, funcionario, veiculo);
            this.vendas.add(novaVenda);
            System.out.println("Veiculo cadastrado com sucesso!");
        }
        else{
            System.out.println("Você não pode cadastrar uma venda! Verifique se há cliente, funcionário e veículos cadastrados.");
        }
    }
    
    @Override
    public Venda consultarVenda(){
        if (vendas.size() > 0){
            System.out.println("\n--- Lista de Vendas Cadastradas ---");
            for (int i = 0; i < vendas.size(); i++) {
                System.out.println((i + 1) + " - " + vendas.get(i).getId());
            }
            System.out.println("-------------------------------------");

            System.out.print("Digite o NÚMERO do venda: ");
            int escolha = input.nextInt();
            input.nextLine(); 

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
            System.out.print("Digite o novo ID da venda: ");
            int novoId = input.nextInt();
            input.nextLine();
            
            System.out.print("Digite o novo valor total da venda: ");
            double novoValor = input.nextDouble();
            input.nextLine();
            
            System.out.print("Digite o novo desconto da venda: ");
            double novoDesconto = input.nextDouble();
            input.nextLine();
            
            System.out.print("Altere o cliente da venda: ");
            Cliente novoCliente = consultarCliente();
           
            System.out.print("Altere o funcionario da venda: ");
            Funcionario novoFuncionario = consultarFuncionario();
            
            System.out.println("Altere o veículo da venda: ");
            Veiculo novoVeiculo = consultarVeiculo();
            
            vendaParaAlterar.setId(novoId);
            vendaParaAlterar.setValorTotal(novoValor);
            vendaParaAlterar.setDesconto(novoDesconto);
            vendaParaAlterar.setCliente(novoCliente);
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
    
}
            