/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Emőke
 */
public class Dolgozat implements Pontozhato {
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszam>35)
            return true;
        else if(this.pontszam==-1){
            return false;
        }
            return false;
        
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        if(this.getPontszam() == -1)
            return "Nem írt";
        else
            return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }
    
    
    
}
