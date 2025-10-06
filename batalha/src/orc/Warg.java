/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orc;

import batalha.Guerreiro;

public class Warg extends Guerreiro {
    
    public Warg(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }   
    
    @Override
    public String toString() {
        return "Lobinho " + nome;
    }

    @Override
    public int atacar() {
        return 33333;
    }

}
