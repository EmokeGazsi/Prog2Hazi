/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szotarfeladat;

/**
 *
 * @author Emőke
 */
public class Szotar {
    private String magyar_szo;
    private String angol_szo;

    public Szotar(String angol_szo, String magyar_szo) {
        this.magyar_szo = magyar_szo;
        this.angol_szo = angol_szo;
    }

    public String getMagyar_szo() {
        return magyar_szo;
    }

    public String getAngol_szo() {
        return angol_szo;
    }

    public void setMagyar_szo(String magyar_szo) {
        this.magyar_szo = magyar_szo;
    }

    public void setAngol_szo(String angol_szo) {
        this.angol_szo = angol_szo;
    }

    @Override
    public String toString() {
        return  angol_szo +':'+ magyar_szo ;
    }
    
}
