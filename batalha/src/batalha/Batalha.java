/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batalha;

import goblin.GoblinComum;
import goblin.ReiGoblin;
import anao.PorcoDeGuerra;
import anao.AnaoImperador;
import anao.AnaoGlutao;
import elfos.ElfoSuperior;
import elfos.Guardiao;
import elfos.Arqueiro;
import orc.SenhorDasFeras;
import orc.Warg;
import orc.Acogueiro;
import orc.Soldado;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Batalha {

    private static LinkedList listagemOrcGoblin(LinkedList fila, String nomeArquivo) {

        int opcao;
        int idade;
        double peso;
        String nome;
        Guerreiro guerreiro;
        FileInputStream arquivo;

        try {
            arquivo = new FileInputStream(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNext()) {
                opcao = leitor.nextInt();
                nome = leitor.next();
                idade = leitor.nextInt();
                peso = leitor.nextDouble();

                switch (opcao) {
                    case 1:
                        guerreiro = new GoblinComum(nome, idade, peso);
                        break;
                    case 2:
                        guerreiro = new ReiGoblin(nome, idade, peso);
                        break;
                    case 3:
                        guerreiro = new Soldado(nome, idade, peso);
                        break;
                    case 4:
                        guerreiro = new Acogueiro(nome, idade, peso);
                        break;
                    case 5:
                        guerreiro = new Warg(nome, idade, peso);
                        break;
                    case 6:
                        guerreiro = new SenhorDasFeras(nome, idade, peso);
                        break;
                    default:
                        throw new AssertionError();
                }
                if (guerreiro instanceof Montador) {
                    String condicao = leitor.next();
                    if (condicao.equals("Sim")) {
                        Warg montaria = new Warg(nome, idade, peso);
                        Montador m = (Montador) guerreiro;
                        m.setMontaria(montaria);
                    }
                }

                fila.add(guerreiro);
            }
            return fila;
        } catch (FileNotFoundException ex) {
            System.getLogger(Batalha.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null;
    }

    private static LinkedList listagemAnaoElfo(LinkedList fila, String nomeArquivo) {

        int opcao;
        int idade;
        double peso;
        String nome;
        Guerreiro guerreiro;
        FileInputStream arquivo;

        try {
            arquivo = new FileInputStream(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNext()) {
                opcao = leitor.nextInt();
                nome = leitor.next();
                idade = leitor.nextInt();
                peso = leitor.nextDouble();

                switch (opcao) {
                    case 1:
                        guerreiro = new Guardiao(nome, idade, peso);
                        break;
                    case 2:
                        guerreiro = new Arqueiro(nome, idade, peso);
                        break;
                    case 3:
                        guerreiro = new ElfoSuperior(nome, idade, peso);
                        break;
                    case 4:
                        guerreiro = new AnaoGlutao(nome, idade, peso);
                        break;
                    case 5:
                        guerreiro = new PorcoDeGuerra(nome, idade, peso);
                        break;
                    case 6:
                        guerreiro = new AnaoImperador(nome, idade, peso);
                        break;
                    default:
                        throw new AssertionError();
                }
                fila.add(guerreiro);
            }
            return fila;
        } catch (FileNotFoundException ex) {
            System.getLogger(Batalha.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null;
    }

    public static void main(String[] args) {

        LinkedList <Guerreiro > fila1 = new LinkedList();
        LinkedList <Guerreiro > fila2 = new LinkedList();
        
        listagemOrcGoblin(fila1, "fila1.txt");
        listagemAnaoElfo(fila2, "fila2.txt");

        System.out.println(fila1);
        System.out.println(fila2);
        
//      ESQUEMA DE LUTA
        
        Iterator it1 = fila1.iterator();
        Iterator it2 = fila2.iterator();
        
        while(it1.hasNext() && it2.hasNext()){
            fila1.element().sofrerDano(fila2.element().atacar());
            if(fila1.element().energia == 0){
                
            }
//        

        }

    }
}
