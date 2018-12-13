/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsofeladat;

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
        ArrayList<Elelmiszer> e_lista=new ArrayList<>();
        ArrayList<TartosElelmiszer> t_lista=new ArrayList<>();
        
        String sor="";
        Scanner sc=null;
        try{
            FileReader fl=new FileReader("file.txt");
            BufferedReader br=new BufferedReader(fl);
            sc=new Scanner(br);
            while(sc.hasNext()){                                    //addig olvassa maig van kovetkezo sor a fajlban
                sor=sc.nextLine();
                String [] tmp=sor.split(";");
                if(tmp[0].compareTo("T")==0){
                    TartosElelmiszer t=new TartosElelmiszer(tmp[1], tmp[2],Double.parseDouble(tmp[3]));
                    for(TartosElelmiszer i:t_lista){
                        if(i.equals(t)){
                           i.setMennyiseg(i.getMennyiseg()+Integer.parseInt(tmp[4]));
                        }
                    }
                    if(!t_lista.contains(t)){
                        t_lista.add(t);
                               
                    }
                }
                else if(tmp[0].compareTo("E")==0){
                    Elelmiszer e=new Elelmiszer(tmp[1],tmp[2],Double.parseDouble(tmp[3]),Integer.parseInt(tmp[4]));
                    for(Elelmiszer i:e_lista){
                        if(i.equals(e)){
                            i.setMennyiseg(i.getMennyiseg()+Integer.parseInt(tmp[5]));
                        }
                    }
                    if(!e_lista.contains(e)){
                        e_lista.add(e);
                    
                }
            }
            
        }
        
    }catch(IOException e)
                {
                    
                }
        try{
            Scanner sc2=new Scanner(System.in);
            sor=sc.nextLine();
            String [] termek=sor.split(";");
            boolean van=false;
            if(termek.length>2){
                if(termek[0].compareTo("T")==0){
                    TartosElelmiszer te2=new TartosElelmiszer(termek[1], termek[2], Double.parseDouble(termek[3]));
                    if(!t_lista.contains(te2))
                        throw new NincsEleg(sor, "Nincs a megadott termekbol");
                    for(TartosElelmiszer i:t_lista){
                        if(i.equals(te2)){
                            if(i.getMennyiseg()<Integer.parseInt(termek[4])){
                                int kulonbseg=Integer.parseInt(termek[4])-i.getMennyiseg();
                                i.setMennyiseg(0);
                                throw new NincsEleg(sor,"Nincs eleg mennyiseg,kulonbseg "+Integer.toString(kulonbseg));
                                
                                
                            }
                            else 
                                i.setMennyiseg(i.getMennyiseg()-Integer.parseInt(termek[4]));
                        }
                    }
                }
                if(termek[0].compareTo("E")==0){
                    Elelmiszer e2=new Elelmiszer(termek[1], termek[2], Double.parseDouble(termek[3]), Integer.parseInt(termek[4]));
                    if(!e_lista.contains(e2))
                        throw new NincsEleg(sor, "Nincs a megadott termekbol");
                    for(Elelmiszer i:e_lista){
                        if(i.equals(e2)){
                            if(i.getMennyiseg()<Integer.parseInt(termek[5])){
                                int kulonbseg2=Integer.parseInt(termek[5])-i.getMennyiseg();
                                i.setMennyiseg(0);
                                throw new NincsEleg(sor, "Nincs eleg mennyiseg,kulonbseg:  "+Integer.toString(kulonbseg2));
                            }
                            else
                                i.setMennyiseg(i.getMennyiseg()-Integer.parseInt(termek[5]));
                        }
                    }
                    
                }
            }
            
            else
            {
                if(termek[0].compareTo("T")==0){
                    for(TartosElelmiszer i:t_lista){
                        if(i.getNev().equals(termek[1])){
                            van=true;
                            i.setMennyiseg(i.getMennyiseg()-1);
                        }
                       
                    }
                    if(van==false){
                        throw new NincsEleg(sor,"Nincs a megadott termek");
                    }
                    
                }
                else if(termek[0].compareTo("E")==0){
                    for(Elelmiszer i:e_lista){
                        if(i.getNev().equals(termek[1])){
                            van=true;
                            
                            
                        }
                    }
                    if(van==false){
                        throw new NincsEleg(sor, "Nincs a megadott termek");
                    }
                }
            }
        }
        catch(NincsEleg ne){
            System.out.println(ne.getSor()+" "+ne.getMessage());
        }
        
        for(Elelmiszer i:e_lista){
            if(i.getMennyiseg()==0){
                e_lista.remove(i);
            }
        }
        for(TartosElelmiszer i:t_lista){
            if(i.getMennyiseg()==0){
                t_lista.remove(i);
            }
        }
        
        AkciosArElelmiszer(e_lista, 45);
        AkciosArTartos(t_lista, 25);
            
}
    
    public static void AkciosArElelmiszer(ArrayList<Elelmiszer> lista,int szazalek){
        for(Elelmiszer i:lista){
            i.setEgyseg_ara(i.getEgyseg_ara()*(szazalek/100));
        }
    }
    
     public static void AkciosArTartos(ArrayList<TartosElelmiszer> lista,int szazalek){
        for(TartosElelmiszer i:lista){
            i.setEgyseg_ara(i.getEgyseg_ara()*(szazalek/100));
        }
    }
    
}
