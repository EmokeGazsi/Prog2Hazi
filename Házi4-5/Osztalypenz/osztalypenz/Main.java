/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Osztalypenz> lista =new ArrayList<Osztalypenz>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        while(sor.length()>0){
            String [] darabolt=sor.split(";");
            Osztalypenz uj=new Osztalypenz(darabolt[0],Integer.parseInt(darabolt[1]));
            for(Osztalypenz i:lista){
                if(i.equals(uj)){
                    i.setBefizetett(i.getBefizetett()+uj.getBefizetett());
                }
            }
            if(!lista.contains(uj)){
                lista.add(uj);
            }
            sor=sc.nextLine();
        }
        Collections.sort(lista);
        for(Osztalypenz o:lista){
            
            System.out.println(o.toString());
        }
    }
}
