/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class Futtathato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tmp=true;
        int hany = Integer.parseInt(sc.nextLine());
        Hallgato t [] = new Hallgato [hany];
        for(int i=0;i<hany;i++){
            int keszult = Integer.parseInt(sc.nextLine());
            String tanul = sc.nextLine();
            if(tanul.compareTo("igaz")==0){
                tmp=true;
            }
            else if(tanul.compareTo("hamis")==0){
                tmp=false;
            }
            t[i]=new Hallgato(keszult,tmp);
            
        }
        Vegrehajt(t);
        
    }
    public static void Vegrehajt(Hallgato [] t){
        for(int i=0;i<t.length;i++){
            
            Dolgozat d1 = t[i].dolgozatotIr();
            Dolgozat d2 = t[i].dolgozatotIr();
            
            boolean m1 = d1.megfelelt();
            boolean m2 = d2.megfelelt();
            
            if(m1 == true && m2 == true)
            {
                System.out.println("Megfelelt");
            }
            else if(d1.getPontszam() == -1 && m1 == false)
            {
                System.out.println(d1.toString());
            }
            else if(d2.getPontszam() == -1 && m2 == false)
            {
                System.out.println(d2.toString());
            }
            else if( m1 == false || m2 == false)
            {
                System.out.println("Nem felelt meg");
            }
            else
            {
                System.out.println("Nem felelt meg");
            }
        }
    }

   
}
