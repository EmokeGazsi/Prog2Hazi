
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emőke
 */
public class kopapirollo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Random rnd = new Random();
         String szavak;
         
       szavak=sc.nextLine();
       while(szavak.compareTo("vege")!=0){
           int rand=rnd.nextInt(3);
           switch(szavak){
               case "ko":
                   if(rand==0)
                       System.out.println("dontetlen");
                   else if(rand==1)
                       System.out.println("vesztettel");
                   else
                       System.out.println("nyertel");
                   break;
               case "papir":
                   if(rand==0)
                       System.out.println("nyertel");
                   else if(rand==1)
                       System.out.println("dontetlen");
                   else
                       System.out.println("vesztettel");
                   break;
               case "ollo":
                   if(rand==0)
                       System.out.println("vesztettel");
                   else if(rand==1)
                       System.out.println("nyertel");
                   else
                       System.out.println("dontetlen");
                   break;
                               
           }
           szavak=sc.nextLine();
           
       }
}
}
   

