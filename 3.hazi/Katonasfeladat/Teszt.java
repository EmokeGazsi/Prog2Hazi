/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katonasfeladat;

/**
 *
 * @author Emőke
 */
public class Teszt {
    public void Megkuzd(Katona k1,Katona k2 ){
        if(k1.getTamadoero()>k2.getTamadoero()){
            System.out.println("Az elso katona nyert");
        }
        else if(k2.getTamadoero()>k1.getTamadoero()){
            System.out.println("A masodik katona nyert");
        }
        else
            System.out.println("Az elso katona nyert");
    }
    public static void main(String[] args) {
        Katona elso=new Katona(45, 50);
        Katona masodik=new Katona(60,15);
        Katona harmadik=new Katona(30,25);
    }
}
