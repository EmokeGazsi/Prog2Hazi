/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emőke
 */
public class Main {
    public static void main(String[] args) {
        pont p1= new pont(4,5);
        pont p2= new pont(10.6,7.8);
        pont p3= new pont(1,2);
        pont p4= new pont(14,5.5);
        p1.setB(p1.getB()+5);
        System.out.println(p1.getB());
        p2.setB(p2.getB()+5);
        System.out.println(p2.getB());
        p3.setA(p3.getA()-3.4);
        System.out.println(p3.getA());
        p4.setA(p4.getA()-3.4);
        System.out.println(p4.getA());
        
    }
}
