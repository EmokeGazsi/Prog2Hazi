/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Osztalypenz implements Comparable<Osztalypenz>{
    private String nev;
    private int befizetett;

    public Osztalypenz(String nev, int befizetett) {
        this.nev = nev;
        this.befizetett = befizetett;
    }

   

    public String getNev() {
        return nev;
    }

    public int getBefizetett() {
        return befizetett;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setBefizetett(int befizetett) {
        this.befizetett = befizetett;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(nev).append(";").append(befizetett);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Osztalypenz)){
            return false;
        }
        Osztalypenz p=(Osztalypenz)obj;
        return this.nev.equals(p.nev);
    }
    

    @Override
    public int compareTo(Osztalypenz o) {
        if(this.befizetett==o.getBefizetett()){
            return this.nev.compareTo(o.getNev());
        }
        else
            return (-1)*Integer.compare(this.befizetett, o.getBefizetett());
        
    
    }
}
