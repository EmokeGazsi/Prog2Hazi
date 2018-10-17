/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        BudapestKupa []t=new BudapestKupa [n];
        for(int i=0;i<n;i++){
            String sor=sc.nextLine();
            String [] t1=sor.split(";");
            int sum=0;
            for(int j=4;j<t1.length;j++){
                sum+=Integer.parseInt(t1[j]);
                
            }
            t[i]=new BudapestKupa(Integer.parseInt(t1[0]),Integer.parseInt(t1[1]),Integer.parseInt(t1[2]),t1[3],sum);
            
            
        }
        Rendez(t);
        int m=Max(t);
        for(int i=0;i<t.length;i++){
            if(t[i].getResztav()==m){
                System.out.println(t[i].toString());
            }
        }
        
        
    }
    public static void Rendez(BudapestKupa []tomb){
        BudapestKupa tmp;
        for(int i=0;i<tomb.length-1;i++){
            for(int j=i+1;j<tomb.length;j++){
                if(tomb[i].getEv()>tomb[j].getEv()){
                    tmp=tomb[i];
                    tomb[i]=tomb[j];
                    tomb[j]=tmp;
                    
                }
                else if(tomb[i].getEv()==tomb[j].getEv()){
                    if(tomb[i].getHonap()>tomb[j].getHonap()){
                        tmp=tomb[i];
                        tomb[i]=tomb[j];
                        tomb[j]=tmp;
                    }
                    else if(tomb[i].getHonap()==tomb[j].getHonap()){
                        if(tomb[i].getNap()>tomb[j].getNap()){
                            tmp=tomb[i];
                            tomb[i]=tomb[j];
                            tomb[j]=tmp;
                        }
                        else if(tomb[i].getNap()==tomb[j].getNap()){
                            if(tomb[i].getTura_neve().compareTo(tomb[j].getTura_neve())>0){
                                tmp=tomb[i];
                                tomb[i]=tomb[j];
                                tomb[j]=tmp;
                            }
                        }
                    }
                }
            }
        }
    }
    public static int Max(BudapestKupa [] tombm){
        int max=tombm[0].getResztav();
        for(int i=1;i<tombm.length;i++){
            if(tombm[i].getResztav()>max){
                max=tombm[i].getResztav();
            }
        }
        return max;
    }
}
