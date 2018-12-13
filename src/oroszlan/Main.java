/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oroszlan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<String>();
        ArrayList<OroszlanUvoltes> olist=new ArrayList<OroszlanUvoltes>();
        Scanner sc=null;
        String sor="";
        try{
            FileWriter fw=new FileWriter("ki2");
            BufferedWriter bw=new BufferedWriter(fw);
            while(sc.hasNext()){
                sor=sc.nextLine();
                String []tmp=sor.split(":");
                for(int i=1;i<lista.size();i++){
                    lista.add(tmp[i]);
                }
                OroszlanUvoltes o=new OroszlanUvoltes(tmp[0], lista);
                
                
                
            }
        }
        catch(IOException e){
            
        }
    }
}
