/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Comparator;

/**
 *
 * @author Emőke
 */
public class ItalComparator implements Comparator<Ital> {

    @Override
    public int compare(Ital o1, Ital o2) {
        return (int)(o1.getÁr()-o2.getÁr());
    }
    
    
}
