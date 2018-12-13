/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Emőke
 */
final class NemesGaz extends KemiaiElem {
    
    public NemesGaz(String vegyjel, int rendszam, int focsoport) throws HibasAdat {
        super(vegyjel, rendszam, focsoport);
        if(super.getFocsoport()!=8){
            throw new HibasAdat("Hibas a focsoport");
        }
    }

    
    
   
    
}
