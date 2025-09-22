/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalha;


public class Soldado extends Guerreiro {
    
    Warg montaria;
    
    public Soldado(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.ataque = 20;
    }

    public void setMontaria(Warg montaria) {
        this.montaria = montaria;
    }
    
    
}
