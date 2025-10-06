/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elfos;

/**
 *
 * @author julio
 */
public class Arqueiro extends Elfo{

    public Arqueiro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public int atacar() {
        return 5;
    }
    
    @Override
    public String toString() {
        return "Elfo Arqueiro";
    }
    
}
