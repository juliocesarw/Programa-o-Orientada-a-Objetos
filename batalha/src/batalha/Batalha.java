/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batalha;

public class Batalha {
    
    public static void main(String[] args) {
        Soldado c = new Soldado("julio", 23, 88.9);
        Warg w = new Warg("julio", 23, 88.9);
        c.setMontaria(w);
        
        System.out.println(c);
    }
    
}
