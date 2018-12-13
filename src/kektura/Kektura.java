/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kektura;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Kektura implements Comparable<Kektura> {
    private String nev;
    private ArrayList<String> kezdo;
    private ArrayList<String> vege;
    private int km;

    public Kektura(String nev) {
        this.nev = nev;
        this.kezdo=new ArrayList<String>();
        this.vege=new ArrayList<String>();
    }

    public String getNev() {
        return nev;
    }

    public ArrayList<String> getKezdo() {
        return kezdo;
    }

    public ArrayList<String> getVege() {
        return vege;
    }

    public int getKm() {
        return km;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKezdo(ArrayList<String> kezdo) {
        this.kezdo = kezdo;
    }

    public void setVege(ArrayList<String> vege) {
        this.vege = vege;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public int compareTo(Kektura o) {
        return this.nev.compareTo(o.getNev());
    }

    @Override
    public String toString() {
        return  nev ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nev);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Kektura)){
           return false;
       }
       Kektura k=(Kektura)obj;
       return this.nev.equals(k.getNev());
    }
    
    
    
    
    
}
