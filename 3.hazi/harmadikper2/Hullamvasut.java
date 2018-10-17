/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadikper2;

/**
 *
 * @author Emőke
 */
public class Hullamvasut {
    private String hullamvasut_neve;
    private String vilagneve;
    private int legkisebb_magassag;
    private int varakozasi_ido;

    public Hullamvasut(String hullamvasut_neve, String vilagneve, int legkisebb_magassag, int varakozasi_ido) {
        this.hullamvasut_neve = hullamvasut_neve;
        this.vilagneve = vilagneve;
        this.legkisebb_magassag = legkisebb_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }

    public String getHullamvasut_neve() {
        return hullamvasut_neve;
    }

    public String getVilagneve() {
        return vilagneve;
    }

    public int getLegkisebb_magassag() {
        return legkisebb_magassag;
    }

    public int getVarakozasi_ido() {
        return varakozasi_ido;
    }

    public void setHullamvasut_neve(String hullamvasut_neve) {
        this.hullamvasut_neve = hullamvasut_neve;
    }

    public void setVilagneve(String vilagneve) {
        this.vilagneve = vilagneve;
    }

    public void setLegkisebb_magassag(int legkisebb_magassag) {
        this.legkisebb_magassag = legkisebb_magassag;
    }

    public void setVarakozasi_ido(int varakozasi_ido) {
        this.varakozasi_ido = varakozasi_ido;
    }

    @Override
    public String toString() {
        return "Hullamvasut{" + "hullamvasut_neve=" + hullamvasut_neve + ", vilagneve=" + vilagneve + ", legkisebb_magassag=" + legkisebb_magassag + ", varakozasi_ido=" + varakozasi_ido + '}';
    }
    
}
