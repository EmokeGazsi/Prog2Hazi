/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_3;

import java.util.Arrays;
import java.util.List;

/**
 * A feladat megoldásához implementáltuk a Comparable interfészt!
 * @author User
 */
public class Autó implements Comparable<Autó>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private static int db=0;
    private List<String> extrák;

    /**
     * Az osztály paraméteres konstruktora.
     * @param rendszám az autó rendszáma
     * @param teljesítmény az autó típusa
     * @param automata autómata-e
     */
    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        hánydb();
    }

    /**
     * Lekérdező metódus, mely visszaadja az adatmező értékét.
     * @return a rendszám, sztring
     */
    public String getRendszám() {
        return rendszám;
    }

    /**
     * Lekérdező metódus, mely visszaadja az adatmező értékét.
     * @return a teljesítmény, egész
     */
    public int getTeljesítmény() {
        return teljesítmény;
    }

    /**
     * Lekérdező metódus, mely visszaadja az adatmező értékét.
     * @return autómata-e, logikai érték
     */
    public boolean isAutomata() {
        return automata;
    }

    /**
     * Lekérdező metódus, mely visszaadja az adatmező értékét.
     * @return az autó extrái, string típusú lista
     */
    public List<String> getExtrák() {
        return extrák;
    }
    
    /**
     * Lehetővé tesszük, hogy egy autó új extrát kapjon.
     * @param a egy Autó objektum
     * @param extrák extrák
     * @return az 'új' Autó objektum, extrákkal
     */
    public Autó addExtra(Autó a, String[] extrák) {
        List<String> extrák1=Arrays.asList(extrák);
        
        a.extrák=extrák1;
        
        return a;
    }
    
    /**
     * Lehetővé tesszük, hogy egy létező extra törölhető legyen!
     * @param a egy Autó objektum
     * @return az 'új' Autó objektum, extrák nélkül
     */
    public Autó törölExtra(Autó a){
        a.extrák=null;
        
        return a;
    }
    
    /**
     * Ez a metódus megszámolja, hogy hány autót hoztak eddig forgalomba.
     * @return forgalomban lévő autók száma
     */
    public static int hánydb() {
        return Autó.db++;
    }

    /**
     * Visszaadja az osztály string reprezentációját.
     * @return a string reprezentáció
     */
    @Override
    public String toString() {
        return "Autó " + "rendszáma: " + rendszám + ", teljesítménye: " + teljesítmény + ", automata: " + automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    /**
     * Mély összehasonlítást végez az aktuális és a paraméterként kapott objektum között.
     * @param obj általános objektum, amivel szeretnénk az egyezőséget vizsgálni
     * @return logikai érték, az egyenlőségnek megfelelően igaz vagy hamis.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Autó))
            return false;
        
        Autó a=(Autó)obj;
        
        return this.rendszám.equals(a.getRendszám());
    }   

    /**
     * Kiegészítettük az Autó osztály definícióját úgy, hogy a példányai 
     * teljesítményük alapján összehasonlíthatók legyenek.
     * @param t Autó típusú objektum
     * @return egész szám
     */
    @Override
    public int compareTo(Autó t) {
        return this.teljesítmény-t.teljesítmény;
    }
    
    /**
     * Olyan metódus, amely igazzal tér vissza, ha az autó rendszáma szabályos,
     * azaz pontosan 6 karakter hosszúságú, amelyből az első három betű, a 
     * második három pedig számjegy.
     * @param a Autó típusú objektum
     * @return logikai érték
     */
    public static boolean szabályos(Autó a){
        String rendszám =a.getRendszám();
        int count=0;
        int count2=0;
        
        char[] chars=rendszám.toCharArray();
        
        for(int i=0; i<3; i++)
            if(Character.isLetter(chars[i]))
                count++;
        
        char[] számok=rendszám.toCharArray();
        
        for(int j=3; j<6; j++)
            if(Character.isDigit(számok[j]))
                count2++;
        
        if(count==3 && count2==3)
            return true;
        
        return false;
    }
    
}