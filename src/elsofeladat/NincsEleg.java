/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsofeladat;

/**
 *
 * @author Emőke
 */
public class NincsEleg extends Exception{
    private String sor;

    public NincsEleg(String sor,String message) {
        super(message);
        this.sor = sor;
    }

    public String getSor() {
        return sor;
    }
    
}
