/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anao;


public class AnaoGlutao extends Anoes {

    public AnaoGlutao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public int atacar() {
        return 30;
    }
    
    @Override
    public String toString() {
        return "Anao Glutao";
    }
    
}
