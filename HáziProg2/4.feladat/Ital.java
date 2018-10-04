/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package házi1;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Emőke
 */
public class Ital {
    
 protected String név;
 protected String kiszerelés;
 private static int ár;
 protected Date gyártásiDátum;
 
 public Ital(String név,String kiszerelés){
     this.név=név;
     this.kiszerelés=kiszerelés;
     this.ár=10;
     this.gyártásiDátum=java.sql.Date.valueOf(java.time.LocalDate.now());
 }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return this.név+", "+this.kiszerelés+", "+this.getÁr()+"Ft";
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(this.getÁr(), other.getÁr())) {
            return false;
        }
        return true;
    }
    public double getÁrEuro(){
        return this.getÁr()/350;
    }
 
}
