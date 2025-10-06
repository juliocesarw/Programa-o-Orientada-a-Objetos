/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orc;

import batalha.Guerreiro;
import batalha.Montador;


public abstract class Orc extends Guerreiro implements Montador{
    
    protected Warg montaria;
    
    public Orc(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    @Override
    public Guerreiro getMontaria(){
        return montaria;
    };
    
}
