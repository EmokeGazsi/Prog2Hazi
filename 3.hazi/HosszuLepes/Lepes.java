/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HosszuLepes;

import java.util.logging.Logger;

/**
 *
 * @author Emőke
 */
public class Lepes {
    private int kszum, egyeb_szum;
    String utvonal;
    String nev;

    public Lepes(int kszum, int egyeb_szum, String nev, String utvonal) {
        this.kszum = kszum;
        this.egyeb_szum = egyeb_szum;
        this.utvonal = utvonal;
        this.nev = nev;
    }

    public int getKszum() {
        return kszum;
    }

    public int getEgyeb_szum() {
        return egyeb_szum;
    }

    public String getUtvonal() {
        return utvonal;
    }

    public String getNev() {
        return nev;
    }

    public void setKszum(int kszum) {
        this.kszum = kszum;
    }

    public void setEgyeb_szum(int egyeb_szum) {
        this.egyeb_szum = egyeb_szum;
    }

    public void setUtvonal(String utvonal) {
        this.utvonal = utvonal;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Lepes{" + "kszum=" + kszum + ", egyeb_szum=" + egyeb_szum + ", utvonal=" + utvonal + ", nev=" + nev + '}';
    }
    
}
