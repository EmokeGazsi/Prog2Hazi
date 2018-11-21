/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkolo;

import java.util.ArrayList;

/**
 *
 * @author Emőke
 */
public class Parkolo implements Comparable<Parkolo> {
    private String cim;
    private double terulet;
    private int kapacitas;
    private ArrayList<String> rendszam;

    public Parkolo(String cim, double terulet, int kapacitas, ArrayList<String> rendszam) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = rendszam;
    }


    public String getCim() {
        return cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public ArrayList<String> getRendszam() {
        return rendszam;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public void setRendszam(ArrayList<String> rendszam) {
        this.rendszam = rendszam;
    }
    
    public int getSzabadHelyek(){
        return kapacitas-rendszam.size();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(cim).append(" ").append(getSzabadHelyek());
        return sb.toString();
    }
    
    
    @Override
    public int compareTo(Parkolo o) {
       if(this.getSzabadHelyek()==o.getSzabadHelyek()){
           return this.cim.compareTo(o.getCim());
       }
       return (-1)*Integer.compare(getSzabadHelyek(), o.getSzabadHelyek());
    }
    
}
