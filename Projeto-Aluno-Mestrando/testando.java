/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaabs;

/**
 *
 * @author hiago
 */
public class testando {
    public static void main (String[] args){
        AlunoMestrado Hiago = new AlunoMestrado(139001, "Hiago", "44 991556105", "Avenidas", 1392, 78.9, 3, 65.3, 66.0);
        
        Hiago.imprimeDados();
        System.out.println(Hiago.Aprovado());
    }
}
