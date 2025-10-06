/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goblin;

/**
 *
 * @author julio.silva
 */
public class ReiGoblin extends Goblin {
    
    public ReiGoblin(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.energia = 300;
    }

    @Override
    public int atacar() {
        return 100;
    }
    
    @Override
    public String toString() {
        return "Rei Goblin";
    }
    
}
