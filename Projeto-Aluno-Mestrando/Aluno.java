/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaabs;

/**
 *
 * @author hiago
 */
public class Aluno extends PessoaAbs{
    private int numMatricula;
    private double media;
    private int faltas;

    public Aluno(int codigo, String nome, String telefone, String endereco, int numMatricula, double media, int faltas) {
        super(codigo, nome, telefone, endereco);
        this.numMatricula = numMatricula;
        this.media = media;
        this.faltas = faltas;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    
}
