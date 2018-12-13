/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antikvar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Antikvarium> list=new ArrayList<>();
        
       try{
           FileReader fr=new FileReader("sample.txt");
           BufferedReader br=new BufferedReader(fr);
           
           String sor;
           while((sor=br.readLine())!=null){
               String [] tmp=sor.split(";");
               Antikvarium uj=new Antikvarium(tmp[tmp.length-2], Integer.parseInt(tmp[tmp.length-1]));
               for(int i=0;i<tmp.length-2;i++){
                   uj.getSzerzok().add(tmp[i]);
               }
               list.add(uj);
           }
           br.close();
       }
       catch(IOException e){
           System.out.println("Fajl hiba");
       }
       Collections.sort(list);
        for(Antikvarium i:list){
            System.out.println(i);
        }
        
    }
}
