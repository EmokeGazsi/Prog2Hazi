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
public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2)-4*a*c;
    }
    
    
    public double getRoot1(){
        if(getDiscriminant()<0)
            return 0;
        else
        return (-b+(Math.sqrt(getDiscriminant())))/2*a*c;
    }
    public double getRoot2(){
        if(getDiscriminant()<0)
            return 0;
        else
        return (b+(Math.sqrt(getDiscriminant())))/2*a*c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
    
     

   


