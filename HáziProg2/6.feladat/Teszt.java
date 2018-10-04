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
public class Teszt {
    public static void main(String[] args) {
        LinearEquation a=new LinearEquation(1,2,3,4,5,6);
        if(a.isSolvable())
            System.out.println(a.getX()+" "+a.getY());
         else
            System.out.println("the equation has no solution");
    }
}
