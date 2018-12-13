/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postaikuldemeny;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
        Scanner sc=null;
        String sor="";
        ArrayList<Iranyitoszam> list=new ArrayList<Iranyitoszam>();
        try{
            FileReader fr=new FileReader("sample1.txt");
            BufferedReader br=new BufferedReader(fr);
            sc=new Scanner(br);
            while(sc.hasNext()){
                sor=sc.nextLine();
                String [] tmp=sor.split(":");
                PostaiKuldemeny pk=new PostaiKuldemeny(tmp[0], tmp[2], tmp[3], Integer.parseInt(tmp[4]), Integer.parseInt(tmp[5]));
                for(Iranyitoszam i:list){
                    if(i.getIranyitoszam()==Integer.parseInt(tmp[1])){
                        i.getLista().add(pk);
                        i.setOsszeg(i.getOsszeg()+Integer.parseInt(tmp[5]));
                    }
                }
                if(!list.contains(new Iranyitoszam(Integer.parseInt(tmp[1])))){
                    Iranyitoszam i=new Iranyitoszam(Integer.parseInt(tmp[1]));
                    i.getLista().add(pk);
                    i.setOsszeg(i.getOsszeg()+pk.getCsomag_erteke());
                    list.add(i);
                }
            }
            
        }
        catch(IOException e){
            
        }
        for(Iranyitoszam i:list){
            Collections.sort(i.getLista());
            
        }
        for(Iranyitoszam i:list){
            System.out.println(i.toString());
            
        }
        Collections.sort(list);
        try{
            FileWriter fw=new FileWriter("ki1.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            for(Iranyitoszam i:list){
                bw.write(i.getIranyitoszam()+": "+i.getOsszeg()+"\n"+i.getLista());
                bw.write("\n");
            }
            bw.close();
        }
        catch(IOException e){
            
        }
    }
}
