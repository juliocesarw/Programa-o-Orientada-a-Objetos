/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anao;

/**
 *
 * @author julio
 */
public class PorcoDeGuerra extends Anoes {

    public PorcoDeGuerra(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    @Override
    public int atacar() { //ataque das pragas
        return 0;
    }
    @Override
    public String toString() {
        return "Bacon de Guerra";
    }
}
