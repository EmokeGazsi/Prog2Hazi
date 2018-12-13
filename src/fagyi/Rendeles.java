/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fagyi;

import java.util.ArrayList;

/**
 *
 * @author Emőke
 */
public class Rendeles {
    private String nev;
    private ArrayList<String> rendelt_fagyi;

    public Rendeles() {
        rendelt_fagyi=new ArrayList<String>();
    }

    public String getNev() {
        return nev;
    }

    public ArrayList<String> getRendelt_fagyi() {
        return rendelt_fagyi;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setRendelt_fagyi(ArrayList<String> rendelt_fagyi) {
        this.rendelt_fagyi = rendelt_fagyi;
    }
    
    
}
