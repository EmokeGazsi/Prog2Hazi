/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;

/**
 *
 * @author Emőke
 */
public class BudapestKupa {

    private int ev,honap,nap;
    private String tura_neve;
    private int resztav;

    public BudapestKupa(int ev, int honap, int nap, String tura_neve, int resztav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.tura_neve = tura_neve;
        this.resztav = resztav;
    }

    

    public int getEv() {
        return ev;
    }

    public int getHonap() {
        return honap;
    }

    public int getNap() {
        return nap;
    }

    public String getTura_neve() {
        return tura_neve;
    }

    public int getResztav() {
        return resztav;
    }

   

    public void setEv(int ev) {
        this.ev = ev;
    }

    public void setHonap(int honap) {
        this.honap = honap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public void setTura_neve(String tura_neve) {
        this.tura_neve = tura_neve;
    }

    public void setResztav(int resztav) {
        this.resztav = resztav;
    }

    @Override
    public String toString() {
        return "BudapestKupa{" + "ev=" + ev + ", honap=" + honap + ", nap=" + nap + ", tura_neve=" + tura_neve + ", resztav=" + resztav + '}';
    }
    
    
}
