/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kektura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Kektura> n_list=new ArrayList<Kektura>();
        Scanner sc=null;
        String sor="";
        try{
            FileReader fr=new FileReader("sample3.txt");
            BufferedReader br=new BufferedReader(fr);
            sc=new Scanner(br);
            while((sor=sc.nextLine())!=null){
                String [] tmp=sor.split(":");
                Kektura k=new Kektura(tmp[0]);
                for(Kektura i:n_list){
                    if(i.equals(k)){
                        i.getKezdo().add(tmp[1]);
                        i.getVege().add(tmp[2]);
                    }
                }
                if(!n_list.contains(k)){
                    k.getKezdo().add(tmp[1]);
                    k.getVege().add(tmp[2]);
                    n_list.add(k);
                }
               
            }
           
            
        }
        catch(IOException e){
            
        }
        Collections.sort(n_list);
        for(Kektura i:n_list){
            if(osszefuggo(i)){
                System.out.println(i.toString());
            }
        }
    }
    
    public static boolean osszefuggo(Kektura k){
        for(int i=0;i<k.getKezdo().size()-1;i++){
            if(k.getKezdo().get(i).compareTo(k.getKezdo().get(i+1))!=0 &&
                    k.getKezdo().get(i).compareTo(k.getVege().get(i+1))!=0 &&
                        k.getVege().get(i).compareTo(k.getVege().get(i+1))!=0 &&
                            k.getVege().get(i).compareTo(k.getKezdo().get(i+1))!=0){
                return false;
            }
            
        }
        return true;
    }
}
