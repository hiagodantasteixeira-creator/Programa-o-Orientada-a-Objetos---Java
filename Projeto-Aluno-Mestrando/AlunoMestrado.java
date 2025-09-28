/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaabs;

/**
 *
 * @author hiago
 */
public class AlunoMestrado extends Aluno{
    private double conceitoDissertacao;
    private double notaDissertacao;

    public AlunoMestrado(int codigo, String nome, String telefone, String endereco, int numMatricula, double media, int faltas, double conceitoDissertacao, double notaDissertacao) {
        super(codigo, nome, telefone, endereco, numMatricula, media, faltas);
        this.conceitoDissertacao = conceitoDissertacao;
        this.notaDissertacao = notaDissertacao;
    }

    public double getConceitoDissertacao() {
        return conceitoDissertacao;
    }

    public void setConceitoDissertacao(double conceitoDissertacao) {
        this.conceitoDissertacao = conceitoDissertacao;
    }

    public double getNotaDissertacao() {
        return notaDissertacao;
    }

    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }
    
    public boolean Aprovado(){
        return getMedia() >= 6.0 && getFaltas() <= 10 && this.notaDissertacao >= 6.0;
    }
    
    public void imprimeDados() {
        super.imprimirDados(); // Chama o método da classe Pessoa para imprimir os dados comuns
        System.out.println("Matrícula: " + getNumMatricula());
        System.out.println("Média: " + getMedia());
        System.out.println("Nota da Dissertação: " + this.notaDissertacao);
    }
}
