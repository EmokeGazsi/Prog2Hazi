/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyiHozzavalok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Hozzavalok> lista=new ArrayList<Hozzavalok>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        while(sor.length()>0){
            String[] darabolt=sor.split(";");
            Hozzavalok uj=new Hozzavalok(darabolt[0],Integer.parseInt(darabolt[1]));
            for(Hozzavalok h : lista){
                if(h.equals(uj))
                    h.setMennyiseg(h.getMennyiseg()+uj.getMennyiseg());
            }
            if(!lista.contains(uj)){
                lista.add(uj);
            }
            
            sor=sc.nextLine();
        }
        
        Collections.sort(lista);
        for(Hozzavalok i: lista){
            System.out.println(i);
        }
        
        
    }
}
