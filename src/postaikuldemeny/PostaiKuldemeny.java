/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postaikuldemeny;

/**
 *
 * @author Emőke
 */
public class PostaiKuldemeny implements Comparable<PostaiKuldemeny>{
    private String cimzett_neve;
    private String telepules;
    private String utca;
    private int hazszam;
    private int csomag_erteke;

    public PostaiKuldemeny(String cimzett_neve, String telepules, String utca, int hazszam, int csomag_erteke) {
        this.cimzett_neve = cimzett_neve;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.csomag_erteke = csomag_erteke;
    }

    public String getCimzett_neve() {
        return cimzett_neve;
    }

    public String getTelepules() {
        return telepules;
    }

    public String getUtca() {
        return utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public int getCsomag_erteke() {
        return csomag_erteke;
    }

    public void setCimzett_neve(String cimzett_neve) {
        this.cimzett_neve = cimzett_neve;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public void setHazszam(int hazszam) {
        this.hazszam = hazszam;
    }

    public void setCsomag_erteke(int csomag_erteke) {
        this.csomag_erteke = csomag_erteke;
    }

    @Override
    public String toString() {
        return telepules+", "+utca+" "+hazszam+"., "+cimzett_neve+", "+csomag_erteke+" Ft";
    }

    

  
    @Override
    public int compareTo(PostaiKuldemeny o) {
        
            if(this.telepules.compareTo(o.getTelepules())==0){
                if(this.utca.compareTo(o.getUtca())==0){
                    if(this.hazszam==o.getHazszam()){
                        if(this.cimzett_neve.compareTo(o.getCimzett_neve())==0){
                            return (-1)*Integer.compare(this.csomag_erteke, o.getCsomag_erteke());
                        }
                        else
                            return this.cimzett_neve.compareTo(o.getCimzett_neve());
                    }
                    else
                        return Integer.compare(this.hazszam, o.getHazszam());
                }
                else
                    return this.utca.compareTo(o.getUtca());
            }
            else
                return this.telepules.compareTo(o.getTelepules());
        }
    
    
    
}
