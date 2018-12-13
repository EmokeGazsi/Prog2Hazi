/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merlegeles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Merlegeles> list=new ArrayList<Merlegeles>();
        try{
            FileReader fr=new FileReader(new File("sample.txt"));
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            while((sor=br.readLine())!=null){
                String [] tmp =sor.split(":");
                Merlegeles m=new Merlegeles(tmp[0], tmp[1]);
                for(Merlegeles i:list){
                    if(m.equals(i)){
                        i.getDatum().add(tmp[2]);
                        i.setBevetel(i.getBevetel()+Integer.parseInt(tmp[3]));
                    }
                }
                if(!(list.contains(m))){
                    m.getDatum().add(tmp[2]);
                    m.setBevetel(Integer.parseInt(tmp[3]));
                    list.add(m);
                }
            }
            br.close();
        }
        
        
        catch(IOException e){
            System.out.println("Fájl hiba");
        }
        Collections.sort(list);
        
        try{
            FileWriter fw=new FileWriter(new File("ki.txt"));
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<list.size();i++){
                bw.write(list.get(i).toString()+"\n");
            }
            bw.close();
            
            
        }
        catch(IOException e){
            
        }
    }
}
