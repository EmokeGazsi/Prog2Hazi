/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadikper2;

import java.util.Scanner;

/**
 *
 * @author Emőke
 */
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine()); //mindig stringkent olvassa be a szamokat is?tehat itt az n az egy string neki?
        Hullamvasut [] t=new Hullamvasut [n];
        for(int i=0;i<t.length;i++){
            String sor=sc.nextLine();
            String [] tomb=sor.split(";");
            t[i]=new Hullamvasut(tomb[0], tomb[1], Integer.parseInt(tomb[2]), Integer.parseInt(tomb[3]));
        }
        Rendezem(t);
        for(int i=0;i<t.length;i++){
            System.out.println(t[i].toString());
        }
        
    }
    public static void Rendezem(Hullamvasut [] t){
        Hullamvasut tmp;
        for(int i=0;i<t.length-1;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i].getVarakozasi_ido()>t[j].getVarakozasi_ido()){
                    tmp=t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }
                else if(t[i].getVarakozasi_ido()==t[j].getVarakozasi_ido()){
                    if(t[i].getLegkisebb_magassag()<t[j].getLegkisebb_magassag()){
                        tmp=t[i];
                        t[i]=t[j];
                        t[j]=tmp;
                    }
                    else if(t[i].getLegkisebb_magassag()==t[j].getLegkisebb_magassag()){
                        if(t[i].getVilagneve().compareTo(t[j].getVilagneve())>0){
                            tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                    }
                }
            }
        }
    }
}
