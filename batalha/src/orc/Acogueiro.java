/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orc;

import batalha.Guerreiro;

/**
 *
 * @author julio
 */
public class Acogueiro extends Orc {
    
    public Acogueiro(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.energia = 200;
    }

    @Override
    public int atacar() {
        return 20;
    }
    
    @Override
    public String toString() {
        return "Orc Acogueiro";
    }

    @Override
    public void setMontaria(Guerreiro montaria) {
        this.montaria = (Warg) montaria;
    }

    
}
