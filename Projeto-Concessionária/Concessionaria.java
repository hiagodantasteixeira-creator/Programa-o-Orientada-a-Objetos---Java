/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

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

    public static void main(String[] args) {
        Concessionaria minhaLoja = new Concessionaria();
        minhaLoja.executar();
    }
    
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
    
    public void executar() {
        int opcaoPrincipal = -1;
        while (opcaoPrincipal != 0) {
            exibirMenuPrincipal();
            opcaoPrincipal = lerInt("Escolha uma opção: ");
            
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
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n--- Gerenciamento Concessionária ---");
        System.out.println("1 - Gerenciar Clientes");
        System.out.println("2 - Gerenciar Funcionários");
        System.out.println("3 - Gerenciar Veículos");
        System.out.println("4 - Gerenciar Vendas");
        System.out.println("0 - Sair do Sistema");
    }

    private void menuCliente() {
        int operacao = -1;
        while (operacao != 0) {
            System.out.println("\n--- Gerenciar Clientes ---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Cliente");
            System.out.println("3 - Alterar Cliente");
            System.out.println("4 - Remover Cliente");
            System.out.println("5 - Relatório de Clientes");
            System.out.println("0 - Voltar ao Menu Principal");
            
            operacao = lerInt("Escolha uma operação: ");
            
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
            else if (operacao == 5) {
                relatorioClientes();
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
            System.out.println("5 - Relatório de Funcionários");
            System.out.println("0 - Voltar ao Menu Principal");
            
            operacao = lerInt("Escolha uma operação: ");
            
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
            else if (operacao == 5) {
                relatorioFuncionarios();
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
            System.out.println("5 - Relatório de Veículos");
            System.out.println("0 - Voltar ao Menu Principal");
            
            operacao = lerInt("Escolha uma operação: ");
            
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
            else if (operacao == 5) {
                relatorioVeiculos();
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
            System.out.println("5 - Relatório de Vendas");
            System.out.println("0 - Voltar ao Menu Principal");
            
            operacao = lerInt("Escolha uma operação: ");
            
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
            else if (operacao == 5) {
                relatorioVendas();
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
        
        System.out.print("Digite o telefone do cliente: ");
        String numTelefone = input.nextLine();
        
        System.out.print("Digite o email do cliente: ");
        String email = input.nextLine();
        
        System.out.print("Digite o RG do cliente: ");
        String rg = input.nextLine();
        
        System.out.print("Digite o CPF do cliente: ");
        String cpf = input.nextLine();
        
        Cliente novoCliente = new Cliente(nome, numTelefone, email, rg, cpf);
        this.clientes.add(novoCliente);
        
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    @Override
    public Cliente consultarCliente(){
        if (!clientes.isEmpty()){
            System.out.println("\n--- Lista de Clientes Cadastrados ---");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println((i + 1) + " - " + clientes.get(i).getNome());
            }
            System.out.println("-------------------------------------");

            int escolha = lerInt("Digite o número do cliente: ");

            if(escolha > 0 && escolha <= clientes.size()) {
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
            
            System.out.print("Digite o novo telefone do cliente: ");
            String novoNumTelefone = input.nextLine();
            
            System.out.print("Digite o novo email do cliente: ");
            String novoEmail = input.nextLine();
            
            System.out.print("Digite o novo RG do cliente: ");
            String novoRg = input.nextLine();
           
            System.out.print("Digite o novo CPF do cliente: ");
            String novoCpf = input.nextLine();
            
            clienteParaAlterar.setNome(novoNome);
            clienteParaAlterar.setNumTelefone(novoNumTelefone);
            clienteParaAlterar.setEmailPessoal(novoEmail);
            clienteParaAlterar.setRg(novoRg);
            clienteParaAlterar.setCpf(novoCpf);

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
    public void relatorioClientes() {
        System.out.println("\n--- Relatório Completo de Clientes ---");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente cliente : clientes) {
            cliente.exibeCliente(); 
            System.out.println(); 
        }
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
            Cliente cliente = consultarCliente();
            
            System.out.print("O funcionario da venda: ");
            Funcionario funcionario = consultarFuncionario();
            
            System.out.println("O veículo da venda: ");
            Veiculo veiculo = consultarVeiculo();
            
            Venda novaVenda = new Venda(data, valor, cliente, funcionario, veiculo);
            this.vendas.add(novaVenda);
            
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
            Cliente novoCliente = consultarCliente();
           
            System.out.print("Altere o funcionario da venda: ");
            Funcionario novoFuncionario = consultarFuncionario();
            
            System.out.println("Altere o veículo da venda: ");
            Veiculo novoVeiculo = consultarVeiculo();
            
            vendaParaAlterar.setData(novaData);
            vendaParaAlterar.setValor(novoValor);
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
            