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
public class TartosElelmiszer {
    private String nev;
    private String mennyisegi_egyseg;
    private double egyseg_ara;
    private int mennyiseg;

    public TartosElelmiszer(String nev, String mennyisegi_egyseg, double egyseg_ara) {
        this.nev = nev;
        this.mennyisegi_egyseg = mennyisegi_egyseg;
        this.egyseg_ara = egyseg_ara;
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

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setMennyisegi_egyseg(String mennyisegi_egyseg) {
        this.mennyisegi_egyseg = mennyisegi_egyseg;
    }

    public void setEgyseg_ara(double egyseg_ara) {
        this.egyseg_ara = egyseg_ara;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nev);
        hash = 31 * hash + Objects.hashCode(this.mennyisegi_egyseg);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.egyseg_ara) ^ (Double.doubleToLongBits(this.egyseg_ara) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof TartosElelmiszer)) {
            return false;
        }
        TartosElelmiszer te=(TartosElelmiszer) obj;
        return this.nev.equals(te.getNev()) && this.egyseg_ara==(te.getEgyseg_ara()) && this.mennyisegi_egyseg.equals(te.getMennyisegi_egyseg());
        
    }
    
}
