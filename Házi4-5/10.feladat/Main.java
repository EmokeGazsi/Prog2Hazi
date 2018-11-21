/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


 * @author User
 */
public class Main {
    
    
    public static List<Teherautó> tonna(Autó[] auto){
    
        List<Teherautó> l = new ArrayList<>();
          
        for (Autó i : auto) {
            if (i instanceof Teherautó) {
                if(((Teherautó) i).getTeherBírás()>20)
                    l.add((Teherautó)i);
            }
        }
        
        return l;
    }
    
    
    public static void elsőhárom(List<Autó> auto){
        
        Autó[] autok = auto.toArray(new Autó[auto.size()]);
        Autó tmp2;
    
        if(autok.length<3)
            for(Autó tmp:autok)
                System.out.println(tmp);
        else 
            for(int i=0; i<autok.length-1; i++)
                for (int j=0; j<autok.length; j++)
                    if(autok[i].getTeljesítmény()>autok[j].getTeljesítmény()){
                        tmp2 = autok[i];
                        autok[i]=autok[j];
                        autok[j]=tmp2;
                    }
                            
        for(int k=0; k<3; k++)
            System.out.println(autok[k].toString());
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String rendszám = sc.nextLine();
        
        Autó a1 = new Autó(rendszám, 100 , true);
        
        System.out.println(a1.toString());
        System.out.println(Autó.szabályos(a1));
    
        Autó[] autók = new Autó[4];
    
        for(int i=0; i<4; i++){
            String[] sor_elemei=sc.nextLine().split(" ");
            if(i<2)
                autók[i]= new Autó(sor_elemei[0], Integer.parseInt(sor_elemei[1]), Boolean.parseBoolean(sor_elemei[2]));
            else
                autók[i]= new Teherautó(Integer.parseInt(sor_elemei[1]), sor_elemei[0], Integer.parseInt(sor_elemei[3]), Boolean.parseBoolean(sor_elemei[2]));
        }  
   
        for(Autó tmp:autók)
            System.out.println(tmp.toString());
    
        
        Autó[] k = new Autó[]{
            new Autó("ABC123", 70, true),
            new Autó("ABC143", 50, true),
            new Autó("ABC153", 130, true),
            new Autó("ABC163", 240, true),
            new Autó("ABC173", 340, true),
            new Teherautó(40 ,"ABC183", 470, true),
            new Teherautó(19 ,"ABC193", 670, true),
            new Teherautó(42, "ABC203", 570, true)
        };
    
        Autó[] k2 = new Autó[]{
            new Autó("ABC123", 70, true),
            new Autó("ABC143", 50, true),
            new Autó("ABC153", 130, true),
            new Autó("ABC163", 240, true),
            new Autó("ABC173", 340, true),
        };
             
        Autó a2 = new Autó("ABC542", 100 , true);
   
        a2.addExtra(a2, new String[]{"Nagy kijelző"});
        System.out.println(a2.getExtrák());
     
        a2.törölExtra(a2);
        System.out.println(a2.getExtrák());
   
        for(Autó tmp:tonna(k))
            System.out.println(tmp);
    
        List<Autó> autó = Arrays.asList(k2);
    
        elsőhárom(autó);
   
        System.out.println(Autó.hánydb());
    }
}



