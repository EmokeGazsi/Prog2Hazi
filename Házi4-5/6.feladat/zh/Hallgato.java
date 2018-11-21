/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Random;

/**
 *
 * @author Emőke
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;
    Random rnd= new Random();
    Random rnd1= new Random();
    Random rnd2= new Random();
    
    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }
    
   
    public Dolgozat dolgozatotIr(){
        if(rnd.nextInt(100)+1 <= 2){
            Dolgozat d = new Dolgozat(-1);
                return d;
            }
        else if(this.isSokatTanul()){
            int  n = rnd1.nextInt(3) + 4;
            System.out.println("    Generalt: " + n);
            int mk=n*this.getMennyitKeszult();
            System.out.println("    Pont: " + mk);
            Dolgozat d = new Dolgozat(mk);
                return d;
        }
        else{
            int n = rnd2.nextInt(5);
            int mk = n*this.getMennyitKeszult();
            System.out.println("   Generalt: " + n);
            System.out.println("    Pont: " + mk);
            Dolgozat d = new Dolgozat(mk);
                return d;
        }
    }


}
