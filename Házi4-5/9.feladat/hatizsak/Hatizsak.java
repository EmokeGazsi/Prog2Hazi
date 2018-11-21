/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatizsak;

/**
 *
 * @author Emőke
 */
public class Hatizsak implements Comparable<Hatizsak> {
    private String marka;
    private double urtartalom;
    private int zsebekszama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekszama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekszama = zsebekszama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekszama() {
        return zsebekszama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(marka).append(";").append(urtartalom).append(";").append(zsebekszama);
        return sb.toString();
    }
    
    
    @Override
    public int compareTo(Hatizsak t) {
        if(this.getMarka().compareTo(t.getMarka())==0){
            return (-1)*Integer.compare(this.zsebekszama, t.getZsebekszama());
        }
        return this.getMarka().compareTo(t.getMarka());
    }
    
}
