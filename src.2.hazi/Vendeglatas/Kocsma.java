/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendeglatas;

/**
 *
 * @author Emőke
 */
public class Kocsma extends VendeglatoIpariEgyseg {
    private String sorlap;

    public Kocsma(String sorlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    @Override
    public String getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" +super.toString()+ " sorlap=" + sorlap + '}';
    }
    
    
}
