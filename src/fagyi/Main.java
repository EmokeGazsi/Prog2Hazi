/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fagyi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Rendeles> n_list=new ArrayList<Rendeles>();
        Scanner sc=null;
        String sor="";
        try{
            FileReader fr=new FileReader("sample4.txt");
            BufferedReader br=new BufferedReader(fr);
            sc=new Scanner(br);
            while(sc.hasNext()){
                sor=sc.nextLine();
                String [] tmp=sor.split(";");
                Rendeles r=new Rendeles();
                
                for(int i=1;i<tmp.length;i++){
                    r.getRendelt_fagyi().add(tmp[i]);
                }
                n_list.add(r);
            }
        }
        catch(IOException e){
            System.out.println("hiba");
        }
        Scanner sc2=new Scanner(System.in);
        ArrayList<Izek> list=new ArrayList<Izek>();
        while((sor=sc2.nextLine()).length()>0){
            String [] darabolt=sor.split(";");
            Izek i=new Izek(Integer.parseInt(darabolt[1]), darabolt[0]);
            list.add(i);
        }
        szamol(list, n_list);
        
    }
    
    public static void szamol(ArrayList<Izek> i_list,ArrayList<Rendeles> r_list){
        int szamlalo=0;
        int szum=0;
        int belso_szum=0;
        boolean teljesitheto=false;
        for(Rendeles i:r_list){
            for(Izek k:i_list){
                for(int j=0;j<i.getRendelt_fagyi().size();j++){
                    if(i.getRendelt_fagyi().get(j).compareTo(k.getNev())==0){
                        belso_szum+=k.getAr();
                        teljesitheto=true;
                    }                     
                        
                } 
                if(!teljesitheto)
                    continue;
            }
            if(teljesitheto){
                    szum+=belso_szum;
                    szamlalo++;
                    belso_szum=0;
                }
            teljesitheto=false;
            
        }
        System.out.println(szamlalo+"\n"+szum);
    }
}
