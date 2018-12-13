/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsofeladat;

import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Elelmiszer implements Comparable<Elelmiszer> {
    private String nev;
    private String mennyisegi_egyseg;
    private double egyseg_ara;
    private int szavatossagIdo;
    private int mennyiseg;

    public Elelmiszer(String nev, String mennyisegi_egyseg, double egyseg_ara, int szavatossagIdo) {
        this.nev = nev;
        this.mennyisegi_egyseg = mennyisegi_egyseg;
        this.egyseg_ara = egyseg_ara;
        this.szavatossagIdo = szavatossagIdo;
        this.mennyiseg=1;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    
    public String getNev() {
        return nev;
    }

    public String getMennyisegi_egyseg() {
        return mennyisegi_egyseg;
    }

    public double getEgyseg_ara() {
        return egyseg_ara;
    }

    public int getSzavatossagIdo() {
        return szavatossagIdo;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setMennyisegi_egyseg(String mennyisegi_egyseg) {
        this.mennyisegi_egyseg = mennyisegi_egyseg;
    }

    public void setEgyseg_ara(double egyseg_ara) {
        this.egyseg_ara = egyseg_ara;
    }

    public void setSzavatossagIdo(int szavatossagIdo) {
        this.szavatossagIdo = szavatossagIdo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nev);
        hash = 97 * hash + Objects.hashCode(this.mennyisegi_egyseg);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.egyseg_ara) ^ (Double.doubleToLongBits(this.egyseg_ara) >>> 32));
        hash = 97 * hash + this.szavatossagIdo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Elelmiszer)) {
            return false;
        }
        Elelmiszer el=(Elelmiszer) obj;
        return this.egyseg_ara==el.getEgyseg_ara() && this.mennyisegi_egyseg.equals(el.getMennyisegi_egyseg()) && this.nev.equals(el.getNev()) && this.szavatossagIdo==el.getSzavatossagIdo();
    
    
}

    @Override
    public int compareTo(Elelmiszer o) {
           if(this.szavatossagIdo==o.getSzavatossagIdo()){
               return this.nev.compareTo(o.getNev());
           }
           else
               return Integer.compare(this.szavatossagIdo, o.getSzavatossagIdo());
    }
}
