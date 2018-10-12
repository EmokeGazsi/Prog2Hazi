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
public class Etterem extends VendeglatoIpariEgyseg{
    private String etlap;

    public Etterem(String etlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    @Override
    public String getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem" + "etlap=" + etlap ;
    }
    
        
    }

    
    

    

