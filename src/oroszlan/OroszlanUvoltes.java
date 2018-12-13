/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oroszlan;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class OroszlanUvoltes {
    private String allomasazonosito;
    private ArrayList<String> megfigyelesek;

    public OroszlanUvoltes(String allomasazonosito, ArrayList<String> megfigyelesek) {
        this.allomasazonosito = allomasazonosito;
        this.megfigyelesek = megfigyelesek;
    }

    
    public String getAllomasazonosito() {
        return allomasazonosito;
    }

    public ArrayList<String> getMegfigyelesek() {
        return megfigyelesek;
    }

    public void setAllomasazonosito(String allomasazonosito) {
        this.allomasazonosito = allomasazonosito;
    }

    public void setMegfigyelesek(ArrayList<String> megfigyelesek) {
        this.megfigyelesek = megfigyelesek;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.megfigyelesek);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof OroszlanUvoltes)){
            return false;
        }
        OroszlanUvoltes o=(OroszlanUvoltes) obj;
        return this.megfigyelesek.equals(o.getMegfigyelesek());
    }
    
    
    
}
