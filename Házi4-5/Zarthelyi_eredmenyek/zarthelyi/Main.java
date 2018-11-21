/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ZartHelyi> lista=new ArrayList<ZartHelyi>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        while(sor.length()>0){
            String [] darabolt=sor.split(";");
            ZartHelyi uj=new ZartHelyi(darabolt[0],Integer.parseInt(darabolt[1]));
            for(ZartHelyi z:lista){
                if(z.equals(uj))
                    z.setPont(z.getPont()+uj.getPont());
            }
            if(!lista.contains(uj)){
                lista.add(uj);
            }
            sor=sc.nextLine();
        }
        Collections.sort(lista);
        for(ZartHelyi i:lista){
            System.out.println(i.toString());
        }
    }
}
