/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szotarfeladat;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Szotar [] szavak=new Szotar [n];
        for(int i=0;i<n;i++){
            String sor=sc.nextLine();
            String [] s=sor.split(":");
            szavak[i]=new Szotar(s[0], s[1]);
        }
        Rendez(szavak);
        for(int i=0;i<szavak.length;i++){
            System.out.println(szavak[i].toString());
        }
    }
    public static void Rendez(Szotar [] tomb){
        Szotar tmp;
        for(int i=0;i<tomb.length-1;i++){
            for(int j=i+1;j<tomb.length;j++){
                if(tomb[i].getAngol_szo().compareTo(tomb[j].getAngol_szo())>0){
                    tmp=tomb[i];
                    tomb[i]=tomb[j];
                    tomb[j]=tmp;
                }
                else if(tomb[i].getAngol_szo().compareTo(tomb[j].getAngol_szo())==0){
                    if(tomb[i].getMagyar_szo().compareTo(tomb[j].getMagyar_szo())>0){
                        tmp=tomb[i];
                        tomb[i]=tomb[j];
                        tomb[j]=tmp;
                    }
                }
            }
        }
    }
}
