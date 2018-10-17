/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katonasfeladat;

/**
 *
 * @author Emőke
 */
public class Nyilas extends Katona {
    private int lotav;

    public Nyilas(int tamadoero, int vedoero,int lotav) {
        super(tamadoero,vedoero);
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }
    public int getTamado_ero(){
        return lotav+super.getTamadoero();
    }

    @Override
    public String toString() {
        return "Nyilas: TE:" + getTamado_ero() + "  VE:"+getVedoero();
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Nyilas)) {
            return false;
        }
        Nyilas ny=(Nyilas)obj;
        return this.getLotav()==ny.getLotav() && this.getTamado_ero()==ny.getTamado_ero() && this.getVedoero()==ny.getVedoero();
        
    }
    
    
}
