/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izzaszto;

/**
 *
 * @author Emőke
 */
public class Telepules {
    private int homerseklet;
    private String telepules;

    public Telepules(String telepules, int homerseklet) {
        this.homerseklet = homerseklet;
        this.telepules = telepules;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    public String getTelepules() {
        return telepules;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    @Override
    public String toString() {
        return "Telepules{" + "homerseklet=" + homerseklet + ", telepules=" + telepules + '}';
    }
    
}
