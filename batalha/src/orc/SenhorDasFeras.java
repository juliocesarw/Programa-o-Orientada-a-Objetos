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
public class SenhorDasFeras extends Orc{

    public SenhorDasFeras(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.energia = 400;
    }

    @Override
    public int atacar() {
        return 50;
    }
    
    @Override
    public String toString() {
        return "Senhor das Feras";
    }
    
    @Override
    public void setMontaria(Guerreiro montaria) {
        this.montaria = (Warg) montaria;
    }

    
    
}
