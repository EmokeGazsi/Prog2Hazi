/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora;

import com.sun.prism.shader.Texture_Color_AlphaTest_Loader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Emőke
 */
public class IdoAtalakito extends JFrame implements ActionListener {
    private JButton button;
    private JTextField nap1;
    private JTextField ora1;
    private JTextField perc1;
    private JTextField mp1;
    private JTextField nap2;
    private JTextField ora2;
    private JTextField perc2;
    private JTextField mp2;
    private JTextField nap_eredmeny;
    private JTextField ora_eredmeny;
    private JTextField perc_eredmeny;
    private JTextField mp_eredmeny;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    public IdoAtalakito(String title) throws HeadlessException {
        super(title);
        setVisible (true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.button= new JButton("Számol");
        this.nap1= new JTextField(5);
        this.ora1= new JTextField(5);
        this.perc1= new JTextField(5);
        this.mp1= new JTextField(5);
        this.nap2= new JTextField(5);
        this.ora2= new JTextField(5);
        this.perc2= new JTextField(5);
        this.mp2= new JTextField(5);
        this.nap_eredmeny= new JTextField(5);
        this.ora_eredmeny= new JTextField(5);
        this.perc_eredmeny= new JTextField(5);
        this.mp_eredmeny= new JTextField(5);
        this.label1 = new JLabel("nap");
        this.label2 = new JLabel("ora");
        this.label3 = new JLabel("perc");
        this.label4 = new JLabel("masodperc");
        this.label5 = new JLabel("nap");
        this.label6 = new JLabel("ora");
        this.label7 = new JLabel("perc");
        this.label8 = new JLabel("masodperc");
        this.label9 = new JLabel("nap");
        this.label10 = new JLabel("ora");
        this.label11 = new JLabel("perc");
        this.label12 = new JLabel("masodperc");
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        
        GridLayout gr = new GridLayout(4,1);
        setLayout(gr);
        
        p1.add(nap1);
        p1.add(label1);
        p1.add(ora1);
        p1.add(label2);
        p1.add(perc1);
        p1.add(label3);
        p1.add(mp1);
        p1.add(label4);
        p2.add(nap2);
        p2.add(label5);
        p2.add(ora2);
        p2.add(label6);
        p2.add(perc2);
        p2.add(label7);
        p2.add(mp2);
        p2.add(label8);
        p3.add(button);
        p4.add(nap_eredmeny);
        p4.add(label9);
        p4.add(ora_eredmeny);
        p4.add(label10);
        p4.add(perc_eredmeny);
        p4.add(label11);
        p4.add(mp_eredmeny);
        p4.add(label12);
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        
        p3.setLayout(new GridLayout(1,0));
        
        button.addActionListener(this);
        
        super.pack();
        
        
        
    }
    public static void main(String[] args) {
        IdoAtalakito idoatalakito= new IdoAtalakito("IdoAtalakito");
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
           int day1_in_sec=(Integer.parseInt(nap1.getText())*86400)+(Integer.parseInt(ora1.getText())*3600)+(Integer.parseInt(perc1.getText())*60)+Integer.parseInt(mp1.getText());
           int day2_in_sec=(Integer.parseInt(nap2.getText())*86400)+(Integer.parseInt(ora2.getText())*3600)+(Integer.parseInt(perc2.getText())*60)+Integer.parseInt(mp2.getText());
           int sum=day1_in_sec+day2_in_sec;
           int nap_ossz=sum/86400;
           sum-=(nap_ossz*86400);
           int ora_ossz=sum/3600;
           sum-=(ora_ossz*3600);
           int perc_ossz=sum/60;
           sum-=(perc_ossz*60);
           int mp_ossz=sum;
           nap_eredmeny.setText(Integer.toString(nap_ossz));
           ora_eredmeny.setText(Integer.toString(ora_ossz));
           perc_eredmeny.setText(Integer.toString(perc_ossz));
           mp_eredmeny.setText(Integer.toString(mp_ossz));
                    
    }
    
}
}
