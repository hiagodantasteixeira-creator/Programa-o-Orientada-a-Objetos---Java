package concessionaria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hiago
 */
public class Venda{
    private int id;
    private double valorTotal;
    private double desconto;
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;


    public Venda(int id, double valorTotal, double desconto, Cliente cliente, Funcionario funcionario, Veiculo veiculo) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double getValorTotal() {
        return valorTotal - desconto;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void exibeVenda(){
        System.out.println("--- Detalhes da Venda ---");
        System.out.println("Id: " + getId()); 
        System.out.println("Valor Total: " + getValorTotal()); 
        System.out.println("Cliente: " + getCliente().getNome()); 
        System.out.println("Funcionário: " + getFuncionario().getNome());
        System.out.println("Veículo: " + getVeiculo().getModelo());
        System.out.println("---------------------------");
}
}
