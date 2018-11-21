/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tea;

/**
 *
 * @author Emőke
 */
public class Tea implements Rendezheto{
    public String nev;
    public int ar;
    public Tea(String s, int j){
        nev=s;
        ar=j;
    }
    @Override
    public boolean egyenlo(Object o){
        Tea t=(Tea)o;
        if(t.ar==this.ar)
            return true;
        return false;
    }
    @Override
    public boolean nagyobbMint(Object o ){
        Tea t=(Tea)o;
        if(t.ar>this.ar)
            return true;
        return false;
    }
    @Override
    public boolean kisebbMint(Object o){
        Tea t=(Tea)o;
        if(t.ar<this.ar)
            return true;
        return false;  
        
    }

    
    
}
