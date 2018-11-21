/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_3;

/**
 * A Teherautó osztályt az Autó osztályből származtatjuk, ezért megkapja az
 * ősosztály összes tukajdonságát és sajátja is lesz.
 * @author User
 */
public class Teherautó extends Autó {
    
    private int teherBírás;

    /**
     * az osztály paraméteres komstruktora, amely az ősosztály adattagjajit is
     * tartalmazza.
     * @param teherBírás a teherautó teherbírása
     * @param rendszám a teherautó rendszáma
     * @param teljesítmény a teherautó teljesítménye
     * @param automata automata-e
     */
    public Teherautó(int teherBírás, String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
        this.teherBírás = teherBírás;
    }

    /**
     * Lekérdező metódus, mely visszaadja az adatmező értékét.
     * @return a teherautó teherbírása
     */
    public int getTeherBírás() {
        return teherBírás;
    }

    /**
     * Visszaadja az osztály string reprezentációját.
     * @return a string reprezentáció
     */
    @Override
    public String toString() {
        return super.toString()+", teher bírás: "+this.teherBírás;
    }
    
}
