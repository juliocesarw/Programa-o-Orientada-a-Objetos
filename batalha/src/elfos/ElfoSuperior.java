/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elfos;

/**
 *
 * @author julio
 */
public class ElfoSuperior extends Elfo{

    public ElfoSuperior(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.energia = 500;
    }

    @Override
    public int atacar() {
        return 1500;
    }
    
    @Override
    public String toString() {
        return "Elfo Superior";
    }
    
}
