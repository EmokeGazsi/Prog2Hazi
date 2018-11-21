/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyiHozzavalok;

import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Hozzavalok implements Comparable<Hozzavalok> {
    private int mennyiseg;
    private String alap_anyag;

    public Hozzavalok(String alap_anyag,int mennyiseg) {
        this.mennyiseg = mennyiseg;
        this.alap_anyag = alap_anyag;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public String getAlap_anyag() {
        return alap_anyag;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public void setAlap_anyag(String alap_anyag) {
        this.alap_anyag = alap_anyag;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(this.alap_anyag).append(";").append(this.mennyiseg);
        return sb.toString();
    }
    
   
    
    @Override
    public int compareTo(Hozzavalok o) {
        if(this.mennyiseg==o.getMennyiseg()){
            return this.alap_anyag.compareTo(o.getAlap_anyag());
        }
        else
            return (-1)*Integer.compare(this.mennyiseg, o.getMennyiseg());
            
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Hozzavalok))
            return false;
        Hozzavalok h=(Hozzavalok) obj;
        return this.alap_anyag.equals(h.alap_anyag);
    }
    
    
    
}
