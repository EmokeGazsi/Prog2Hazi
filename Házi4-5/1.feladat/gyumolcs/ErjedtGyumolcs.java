/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyumolcs;

/**
 *
 * @author Emőke
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos {
    private double alkoholTartalom;

    public ErjedtGyumolcs(double alkoholTartalom, String fajta, String iz) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }
    @Override
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }
    
    

    
    
}
