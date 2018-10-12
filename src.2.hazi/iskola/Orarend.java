/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Arrays;

/**
 *
 * @author Emőke
 */
public class Orarend {
    private String nap;
    private Ora t [];
    private int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo=0;
        this.t=new Ora [12];
    }

    public String getNap() {
        return nap;
    }

    public Ora[] getT() {
        return t;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setT(Ora[] t) {
        this.t = t;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", t=" + Arrays.toString(t) + ", szamlalo=" + szamlalo + '}';
    }
    
    public boolean oratHozzaad(Ora n){
        if(szamlalo==12)
            return false;
        else if(szamlalo==0){
            t[szamlalo]=n;
            szamlalo++;
            return true;
        }
        else
        {
            for(int i=0;i<szamlalo;i++){
                if(n.getKezdet()==t[i].getKezdet())
                    return false;
                
            }
            t[szamlalo]=n;
            szamlalo++;
            return true;
        }
    }
    
}
