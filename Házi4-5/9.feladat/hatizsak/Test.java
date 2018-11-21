/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatizsak;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Emőke
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Hatizsak> lista=new ArrayList<Hatizsak>();
        lista.add(new Hatizsak("Budmil", 5.0, 2, true));
        lista.add(new Hatizsak("Adidas", 25.2, 10, false));
        lista.add(new Hatizsak("Nike", 1.3, 10, false));
        lista.add(new Hatizsak("Budmil", 17.6, 7, true));
        lista.add(new Hatizsak("Adidas", 2.4, 3, false));
        
        
        kiirMarkaszerint(lista);
        
    }
    public static void kiirMarkaszerint(ArrayList<Hatizsak> lista){
        Collections.sort(lista);
        for(Hatizsak i:lista){
            System.out.println(i.toString());
        }
    }        
}
