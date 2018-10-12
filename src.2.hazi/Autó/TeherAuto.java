/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autó;

/**
 *
 * @author Emőke
 */
public class TeherAuto extends Auto{
    private int maxSzallithatoTeher;

    public TeherAuto(int maxSzallithatoTeher, String rendszam, int motorTeljesitmeny) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "TeherAuto{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}';
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
        final TeherAuto other = (TeherAuto) obj;
        if (this.maxSzallithatoTeher != other.maxSzallithatoTeher) {
            return false;
        }
        return true;
    }
    
}
