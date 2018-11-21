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
public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }
    public String milyeFajtaju(){
        return fajta;
    }
    public String milyenIzu(){
        return iz;
    }

    @Override
    public String toString() {
        return "Gyumolcs{" + "fajta=" + fajta + ", iz=" + iz + '}';
    }
    
}
