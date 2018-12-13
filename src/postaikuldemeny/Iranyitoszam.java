/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postaikuldemeny;

import java.util.ArrayList;

/**
 *
 * @author Emőke
 */
public class Iranyitoszam implements Comparable<Iranyitoszam>{
    private int iranyitoszam;
    private ArrayList<PostaiKuldemeny> lista;
    private int osszeg;

    public Iranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
        this.lista=new ArrayList<PostaiKuldemeny>();
        this.osszeg=0;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public ArrayList<PostaiKuldemeny> getLista() {
        return lista;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public void setLista(ArrayList<PostaiKuldemeny> lista) {
        this.lista = lista;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.iranyitoszam;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Iranyitoszam)){
            return false;
        }
        Iranyitoszam i=(Iranyitoszam) obj;
        return this.iranyitoszam==i.getIranyitoszam();
    }

    @Override
    public int compareTo(Iranyitoszam o) {
        return Integer.compare(this.iranyitoszam, o.getIranyitoszam());
    }

    @Override
    public String toString() {
        return "Iranyitoszam{" + "iranyitoszam=" + iranyitoszam + ", lista=" + lista + ", osszeg=" + osszeg + '}';
    }
    
    
    
    
    
}
