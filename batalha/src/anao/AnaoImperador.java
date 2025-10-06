/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anao;

/**
 *
 * @author julio
 */
public class AnaoImperador extends Anoes {

    public AnaoImperador(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.energia = 250;
    }

    @Override
    public int atacar() {
        return 25;
    }
    
    @Override
    public String toString() {
        return "Anao imperador";
    }
    
}
