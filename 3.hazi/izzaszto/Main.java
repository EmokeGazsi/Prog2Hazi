/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izzaszto;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String szo=sc.nextLine();
        String [] fszo=szo.split(" ");
        int n=Integer.parseInt(fszo[0]);
        String tel=fszo[1];
        Telepules []t=new Telepules [n];
        for(int i=0;i<n;i++){
            String sor=sc.nextLine();
            String [] s=sor.split(":");
            t[i]=new Telepules(s[0],Integer.parseInt(s[1]));
        }
        Szerepel(t,tel);
    }
    public static void Szerepel(Telepules [] t1, String nev){
        boolean igaze=false;
        int hom=0;
        for(int i=0;i<t1.length;i++){
            if(t1[i].getTelepules().compareTo(nev)==0){
                igaze=true;
                hom=t1[i].getHomerseklet();
            }
        }
        Telepules tmp;
        if(igaze==true){
            for(int i=0;i<t1.length-1;i++){
                for(int j=i+1;j<t1.length;j++){
                    if(t1[i].getHomerseklet()<t1[j].getHomerseklet()){
                        tmp=t1[i];
                        t1[i]=t1[j];
                        t1[j]=tmp;
                    }
                    else if(t1[i].getHomerseklet()==t1[j].getHomerseklet())
                        if(t1[i].getTelepules().compareTo(t1[j].getTelepules())>0){
                            tmp=t1[i];
                            t1[i]=t1[j];
                            t1[j]=tmp;
                        }
                }
            }
            for(int i=0;i<t1.length;i++)
            {
                if(t1[i].getHomerseklet()>hom){
                    System.out.println(t1[i].toString());
                }
                
            }
        }
        else
            System.out.println("missing data");
    }
}
