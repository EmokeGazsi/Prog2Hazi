/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyumolcs;

/**
 *
 * @author Emőke
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bor [] tomb = new Bor[3];
        tomb[0]= new Bor("lila", "Tokaj", "edes", 45.0);
        tomb[1]= new Aszu(5, "pirso", "Badacsony", "szaraz", 10.0);
        tomb[2]= new Bor("piros", "Eger", "szaraz", 35.3);
        Keres(tomb);
    }
    public static void Keres(Bor [] t){
        for(int i=0;i<t.length;i++){
            if(t[i] instanceof Aszu){
                Aszu a=(Aszu)t[i];
                if(a.hanyPuttonyos()==5)
                    System.out.println(a.toString());
            }
        }
    }
    
}
