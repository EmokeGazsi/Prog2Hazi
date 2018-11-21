/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi;

import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class ZartHelyi implements Comparable<ZartHelyi> {
    private int pont;
    private String nev;

    public ZartHelyi(String nev, int pont) {
        this.pont = pont;
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public String getNev() {
        return nev;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(nev).append(": ").append(pont).append("pont");
        return sb.toString();
    }

    @Override
    public int compareTo(ZartHelyi o) {
        if(this.pont==o.getPont())
            return this.nev.compareTo(o.getNev());
        return (-1)*Integer.compare(this.pont, o.getPont());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof ZartHelyi ))
            return false;
        ZartHelyi z=(ZartHelyi) obj;
        return this.nev.equals(z.nev);
    }
    
    
    
}
