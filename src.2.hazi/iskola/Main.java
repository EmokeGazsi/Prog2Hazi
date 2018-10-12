/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nap=sc.nextLine();
        int n=Integer.parseInt(sc.nextLine());
        Ora t[]=new Ora[n];
        for(int i=0;i<n;i++){
            int kod=Integer.parseInt(sc.nextLine());
            int kezdet=Integer.parseInt(sc.nextLine());
            String nev=sc.nextLine();
            t[i]=new Ora(kod, nev, kezdet);
        }
        Orarend o= new Orarend(nap);
        for(int i=0;i<n;i++){
            System.out.println(o.oratHozzaad(t[i])); 
            
        }
        System.out.println(o.toString());
        
    }
}
