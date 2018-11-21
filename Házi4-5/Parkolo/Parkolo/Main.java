/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Parkolo> lista= new ArrayList<Parkolo>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        ArrayList<String> rendszam1=new ArrayList<String>();
        while(sor.length()>0){
            String[] darabolt=sor.split(";");
            for(int i=3;i<darabolt.length;i++){
                rendszam1.add(darabolt[i]);
            }
            Parkolo uj=new Parkolo(darabolt[0],Double.parseDouble(darabolt[1]),Integer.parseInt(darabolt[2]),rendszam1);
            lista.add(uj);
            rendszam1.clear();
            sor=sc.nextLine();
        }
        Collections.sort(lista);
        for(Parkolo i:lista){
            if(i.getSzabadHelyek()>3)
            System.out.println(i.toString());
        }
        
    }
}
