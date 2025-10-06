/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goblin;
public class GoblinComum extends Goblin{

    public GoblinComum(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.energia = 50;
    }

    @Override
    public int atacar() {
        return 10;
    }
    
    public void falaTeuNome(){
        System.out.println(nome);
    }

    @Override
    public String toString() {
        return "Goblin comum";
    }
    
    
    
}
