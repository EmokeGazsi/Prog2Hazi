/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendeglatas;

/**
 *
 * @author Emőke
 */
public class Teszt {
    public static void main(String[] args) {
        VendeglatoIpariEgyseg [] t1= new VendeglatoIpariEgyseg[10];
        
        t1[0]= new Etterem("leves","Alma",25,false);
        t1[1]= new Etterem("foetel","Menza",10,false);
        t1[2]= new Etterem("eloetel","Campus",30,false);
        t1[3]= new Etterem("desszert","Lovi",47,false);
        t1[4]= new Etterem("salta","Godor",12,false);
        t1[5]= new Kocsma("feles","Valhalla",25,true);
        t1[6]= new Kocsma("froccs","Ibolya",10,true);
        t1[7]= new Kocsma("palinka","Mob",30,true);
        t1[8]= new Kocsma("bor","Bar",47,true);
        t1[9]= new Kocsma("sor","Pikolo",12,true);
        AdottItaltKinaloKocsmak("bor",t1);
        
        
        
    }
    public static void AdottItaltKinaloKocsmak(String Ital,VendeglatoIpariEgyseg [] t){
       Kocsma t2 [];
       String classtype;
        for(int i=0;i<10;i++){
            classtype = t[i].getClass().getName();
            
            if(classtype=="Vendeglatas.Etterem"){
                String s;
                s = t[i].getEtlap();
                
                if(t[i].getEtlap().compareTo(Ital) == 0){
                         System.out.println(t[i]);

                    }
            }
            else{
                String s;
                s = t[i].getSorlap();
               
                    if(t[i].getSorlap().compareTo(Ital) == 0){
                        System.out.println(t[i]);

                    }
                }
            }


        }
    }



