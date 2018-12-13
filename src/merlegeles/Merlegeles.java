/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merlegeles;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Merlegeles implements Comparable<Merlegeles> {
    private String nev;
    private String telephely;
    private List<String> datum;
    private int bevetel;

    public Merlegeles(String nev, String telephely) {
        this.datum = new ArrayList<String>();
        this.nev = nev;
        this.telephely = telephely;
        this.bevetel =0;
    }

    

    public String getNev() {
        return nev;
    }

    public String getTelephely() {
        return telephely;
    }

    public List getDatum() {
        return datum;
    }


    public int getBevetel() {
        return bevetel;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public void setDatum(List datum) {
        this.datum = datum;
    }

    

    public void setBevetel(int bevetel) {
        this.bevetel = bevetel;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(this.nev).append(" (").append(this.telephely).append("): ").append(datum);
        return sb.toString();
    }

    @Override
    public int compareTo(Merlegeles o) {
        if(this.bevetel==o.getBevetel()){
            if(this.datum.size()==o.getDatum().size()){
                return this.nev.compareTo(o.getNev());
            }
            else
                return Integer.compare(this.datum.size(), o.getDatum().size());
        }
        else
            return (-1)*Integer.compare(this.bevetel, o.getBevetel());
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nev);
        hash = 37 * hash + Objects.hashCode(this.telephely);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Merlegeles)){
            return false;
        } 
        Merlegeles m=(Merlegeles) obj;
        return this.nev.equals(m.getNev()) && this.telephely.equals(m.getTelephely());
            
    }
    
    
}
