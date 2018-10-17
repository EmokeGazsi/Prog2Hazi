/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HosszuLepes;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Lepes [] t=new Lepes[n];
        for(int i=0;i<n;i++){
            String sor=sc.nextLine();
            String [] s=sor.split(";");
            int kek_szamlalo=0;
            int egyeb_szamlalo=0;
            for(int j=0;j<s[1].length();j++){
                if(s[1].charAt(j)=='K')
                {
                    kek_szamlalo++;
                }
                else if(s[1].charAt(j)=='P' || s[1].charAt(j)=='S' || s[1].charAt(j)=='Z'){
                    egyeb_szamlalo++;
                }
            }
            t[i]=new Lepes( kek_szamlalo, egyeb_szamlalo,s[0],s[1]);
        }
        Rendez(t);
        for(int i=0;i<t.length;i++){
            System.out.println(t[i].getNev());
        }
    }
    public static void Rendez(Lepes [] tomb){
        Lepes tmp;
        for(int i=0;i<tomb.length-1;i++){
            for(int j=i+1;j<tomb.length;j++){
                if(tomb[i].getKszum()<tomb[j].getEgyeb_szum()){
                    tmp=tomb[i];
                    tomb[i]=tomb[j];
                    tomb[j]=tmp;
                }
                else if(tomb[i].getKszum()==tomb[j].getEgyeb_szum()){
                    if(tomb[i].getNev().compareTo(tomb[j].getNev())>0){
                        tmp=tomb[i];
                        tomb[i]=tomb[j];
                        tomb[j]=tmp;
                    }
                }
            }
        }
    }
}
