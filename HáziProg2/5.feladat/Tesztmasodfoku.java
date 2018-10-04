/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package házi1;

/**
 *
 * @author Emőke
 */
public class Tesztmasodfoku {
    public static void main(String[] args) {
        QuadraticEquation a=new QuadraticEquation(12,43,10);
        QuadraticEquation b=new QuadraticEquation(1.2,132,30);
        QuadraticEquation c=new QuadraticEquation(52,6,80);
        if(a.getDiscriminant()>0)
            System.out.println(a.getRoot1()+' '+a.getRoot2());
        else if(a.getDiscriminant()==0)
           System.out.println(a.getRoot1());
        else
            System.out.println("the equation has no roots");
         if(b.getDiscriminant()>0)
            System.out.println(b.getRoot1()+' '+b.getRoot2());
        else if(b.getDiscriminant()==0)
            System.out.println(b.getRoot1());
        else
            System.out.println("the equation has no roots");
          if(c.getDiscriminant()>0)
            System.out.println(c.getRoot1()+' '+c.getRoot2());
        else if(c.getDiscriminant()==0)
            System.out.println(c.getRoot1());
        else
            System.out.println("the equation has no roots");
          
         System.out.println(java.time.LocalDate.now());





        
        
    }
}
