/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autó;

import java.util.Date;

/**
 *
 * @author Emőke
 */
public class Test {
    public static void main(String[] args) {
        TeherAuto[] tomb=new TeherAuto[10];
        Auto[] tomb1=new Auto[10];
        
        tomb[0]=new TeherAuto(2000,"abc123",1500);
        tomb[1]=new TeherAuto(2500,"adf123",1300);
        tomb[2]=new TeherAuto(1000,"kbc123",550);
        tomb1[0]=new Auto("hjf597",57436);
        tomb1[1]=new Auto("bfhj25",587000);
        tomb1[2]=new Auto("abc123",1458);
        rendezMaxSzallithatoTeherCsokkenoleg(tomb);
//        for(int i=0;i<3;i++){
//            System.out.println(tomb[i]);
//                    
//        }
        System.out.println("a maximalis teljesitmeny:"+keresMaxMotorTeljesitmeny(tomb1));
        
    }
    static void rendezMaxSzallithatoTeherCsokkenoleg(TeherAuto [] teher){
       TeherAuto tmp;
       for(int i=0;i<2;i++)
       {
           for(int j=i+1;j<3;j++){
               if(teher[i].getMaxSzallithatoTeher()<teher[j].getMaxSzallithatoTeher()){
                   tmp=teher[i];
                   teher[i]=teher[j];
                   teher[j]=tmp;
               }
           }
       }
    }
    static Auto keresMaxMotorTeljesitmeny(Auto [] auto){
        Auto max=auto[0];
        for(int i=1;i<3;i++){
            if(max.getMotorTeljesitmeny()<auto[i].getMotorTeljesitmeny()){
                max=auto[i];
            }
        }
        return max;
    }
    
}
