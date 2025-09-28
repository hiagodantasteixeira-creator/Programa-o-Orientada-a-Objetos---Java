/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaabs;

/**
 *
 * @author hiago
 */
public class Funcionario extends PessoaAbs{
    private double salario;

    public Funcionario(int codigo, String nome, String telefone, String endereco, double salario) {
        super(codigo, nome, telefone, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
