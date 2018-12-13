/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antikvar;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Antikvarium implements Comparable<Antikvarium> {
    private String cim;
    private ArrayList<String> szerzok;
    private int kiadaseve;

    public Antikvarium(String cim, int kiadaseve) {
        this.cim = cim;
        this.kiadaseve = kiadaseve;
        this.szerzok=new ArrayList<String>();
    }

    public String getCim() {
        return cim;
    }

    public ArrayList<String> getSzerzok() {
        return szerzok;
    }

    public int getKiadaseve() {
        return kiadaseve;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setSzerzok(ArrayList<String> szerzok) {
        this.szerzok = szerzok;
    }

    public void setKiadaseve(int kiadaseve) {
        this.kiadaseve = kiadaseve;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Antikvarium)){
            return false;
        }
        Antikvarium a=(Antikvarium) obj;
        return this.cim.equals(a.getCim()) && this.szerzok.equals(a.getSzerzok());
    }

    @Override
    public int compareTo(Antikvarium o) {
        if(this.kiadaseve==o.getKiadaseve()){
            if(this.szerzok.size()==o.getSzerzok().size()){
                return this.cim.compareTo(o.getCim());
            }
            return -1*Integer.compare(this.szerzok.size(), o.getSzerzok().size());
        }
        return Integer.compare(this.kiadaseve, o.getKiadaseve());
    }

    @Override
    public String toString() {
        return "Antikvarium{" + "cim=" + cim + ", szerzok=" + szerzok + ", kiadaseve=" + kiadaseve + '}';
    }

    
    
    
    
}
