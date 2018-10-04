/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package házi1;

/**
 *
 * @author Emőke
 */
public class Rectangle {
    public double width;
    public double height;
    
    public Rectangle(){
        this.width=1;
        this.height=1;
    }
    
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
        
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (2*width)+(2*height);
    }
    public String toString(){
        return "szélesség:"+this.width+"\n"+"magassag:"+this.height+"\n"+"terulet:"+this.getArea()+"\n"+"kerulet:"+this.getPerimeter();
    }
    
}
