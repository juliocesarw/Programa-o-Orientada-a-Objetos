/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orc;

import batalha.Guerreiro;
import orc.Orc;


public class Soldado extends Orc{
    
    public Soldado(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    @Override
    public String toString() {
        return "Soldado Orc";
    }

    @Override
    public int atacar() {
        return 15;
    }
    
    @Override
    public void setMontaria(Guerreiro montaria) {
        this.montaria = (Warg) montaria;
    }
    
    
}
