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
public class Landzsas extends Katona {

    public Landzsas(int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
    }

    @Override
    public String toString() {
        return "Landzsas TE:" + getTamadoero() +" VE:" + getVedoero();
    }
    

    
    
}
