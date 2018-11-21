/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Emőke
 */
public class Dolgozat {
    public static void main(String[] args) {
        Ital [] itoka = new Ital [4];
        itoka[0]= new Ital("cola","2",200);
        itoka[1]= new SzeszesItal(4.5,"bor","1",450);
        itoka[2]= new SzeszesItal(6.2,"pezsgo","3",1000);
        itoka[3]= new SzeszesItal(2.6,"vodka","0,5",2500);
        HaromLegmagasabb(itoka);
    }
    public static void HaromLegmagasabb(Ital [] t){
        int n=0; 
        SzeszesItal [] tomb;
        tomb = new SzeszesItal [t.length];
        for(int i=0;i<t.length;i++){
            if(t[i] instanceof SzeszesItal){
                tomb[n]=(SzeszesItal)t[i];
                n++;                
            }
        }
        SzeszesItal tmp;
        for(int i=0;tomb[i+1]!=null;i++){
            for(int j=i+1;tomb[j]!=null;j++){
                if(tomb[i].getAlkoholTartalom()<tomb[j].getAlkoholTartalom()){
                    tmp=tomb[i];
                    tomb[i]=tomb[j];
                    tomb[j]=tmp;
                    
            }
        }
        }
        if(n<3){
            System.out.println("null");
        }
        else 
            for(int i=0;i<3;i++){
                System.out.println(tomb[i]);
            }
            
        
    }
}
