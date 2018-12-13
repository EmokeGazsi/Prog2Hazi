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
final class NemFem extends KemiaiElem{

    public NemFem(String vegyjel, int rendszam, int focsoport) {
        super(vegyjel, rendszam, focsoport);
    }
    @Override
    public boolean ReakciobaLephet(ReakcioKepes o) {
        NemFem n=(NemFem) o;
        if((super.getFocsoport()+n.getFocsoport())%8!=0){
            return false;
        }
        else
            return true;
    }
}
