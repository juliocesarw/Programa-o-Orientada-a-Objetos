/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elfos;

/**
 *
 * @author julio
 */
public class Guardiao extends Elfo{

    public Guardiao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public int atacar() {
        return 25;
    }
    
    @Override
    public String toString() {
        return "Elfo Guardiao";
    }
    
}
