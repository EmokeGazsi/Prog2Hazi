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
public class Szamologep extends JFrame implements ActionListener{
    private JButton button;
    private JButton Backspace;
    private JButton CE;
    private JButton C;
    private JButton MC;
    private JButton MR;
    private JButton MS;
    private JButton M_plusz;
    private JButton egy;
    private JButton ketto;
    private JButton harom;
    private JButton negy;
    private JButton ot;
    private JButton hat;
    private JButton het;
    private JButton nyolc;
    private JButton kilenc;
    private JButton nulla;
    private JButton plusz_minusz;
    private JButton pont;
    private JButton per;
    private JButton csillag;
    private JButton minusz;
    private JButton plusz;
    private JButton sqrt;
    private JButton szazalek;
    private JButton egyperx;
    private JButton egyenlo;
    private JTextField mezo;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    private JTextField szamok;
    private int szum=0;
    
    public Szamologep(String title) throws HeadlessException{
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.button=new JButton("              ");
        this.Backspace=new JButton("Backspace");
        this.CE=new JButton("CE");
        this.C=new JButton("C");
        this.MC=new JButton("MC");
        this.MR=new JButton("MR");
        this.MS=new JButton("MS");
        this.M_plusz=new JButton("M+");
        this.csillag=new JButton("*");
        this.egy=new JButton("1");
        this.egyenlo=new JButton("=");
        this.egyperx=new JButton("1/x");
        this.harom=new JButton("3");
        this.hat=new JButton("6");
        this.het=new JButton("7");
        this.ketto=new JButton("2");
        this.kilenc=new JButton("9");
        this.minusz=new JButton("-");
        this.negy=new JButton("4");
        this.nulla=new JButton("0");
        this.nyolc=new JButton("8");
        this.ot=new JButton("5");
        this.per=new JButton("/");
        this.plusz=new JButton("+");
        this.plusz_minusz=new JButton("+/-");
        this.pont=new JButton(".");
        this.sqrt=new JButton("sqrt");
        this.szazalek=new JButton("%");
        this.szamok=new JTextField(25);
        
        this.p1=new JPanel();
        this.p2=new JPanel();
        this.p3=new JPanel();
        this.p4=new JPanel();
        this.p5=new JPanel();
        this.p6=new JPanel();
        this.p7=new JPanel();
        
        GridLayout gr= new GridLayout(6,0);
        setLayout(gr);
        p1.add(szamok);
        
        p2.add(button);
        p2.add(Backspace);
        p2.add(CE);
        p2.add(C);
        
        p3.add(MC);
        p3.add(het);
        p3.add(nyolc);
        p3.add(kilenc);
        p3.add(per);
        p3.add(sqrt);
        
        p4.add(MR);
        p4.add(negy);
        p4.add(ot);
        p4.add(hat);
        p4.add(csillag);
        p4.add(szazalek);
        
        p5.add(MS);
        p5.add(egy);
        p5.add(ketto);
        p5.add(harom);
        p5.add(minusz);
        p5.add(egyperx);
        
        p6.add(M_plusz);
        p6.add(nulla);
        p6.add(plusz_minusz);
        p6.add(pont);
        p6.add(plusz);
        p6.add(egyenlo);
        
        
       this.add(p1);
       this.add(p2);
       this.add(p3);
       this.add(p4);
       this.add(p5);
       this.add(p6);
       
       p1.setLayout(new GridLayout(1,0));
       p2.setLayout(new GridLayout(1,0));
       p3.setLayout(new GridLayout(1,0));
       p4.setLayout(new GridLayout(1,0));
       p5.setLayout(new GridLayout(1,0));
       p6.setLayout(new GridLayout(1,0));
       
        
       
        
//    Backspace.addActionListener(this);
//    CE.addActionListener(this);
//    C.addActionListener(this);
//    MC.addActionListener(this);
//    MR.addActionListener(this);
//    MS.addActionListener(this);
//    M_plusz.addActionListener(this);
    egy.addActionListener(this);
    ketto.addActionListener(this);
    harom.addActionListener(this);
    negy.addActionListener(this);
    ot.addActionListener(this);
    hat.addActionListener(this);
    het.addActionListener(this);
    nyolc.addActionListener(this);
    kilenc.addActionListener(this);
    nulla.addActionListener(this);
//    plusz_minusz.addActionListener(this);
//    pont.addActionListener(this);
//    per.addActionListener(this);
//    csillag.addActionListener(this);
//    minusz.addActionListener(this);
    plusz.addActionListener(this);
//    sqrt.addActionListener(this);
//    szazalek.addActionListener(this);
//    egyperx.addActionListener(this);
    egyenlo.addActionListener(this);
       
    super.pack();
        
        
        
    }
    public static void main(String[] args) {
        Szamologep szamologep=new Szamologep("Szamologep");
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
//        int szum=Integer.parseInt(szamok.getText());
        if(e.getSource()==this.plusz){
            szum+=Integer.parseInt(this.szamok.getText());
            this.szamok.setText("");
        }
        else if(e.getSource()==this.egyenlo){
            szum+=Integer.parseInt(this.szamok.getText());
            this.szamok.setText(Integer.toString(szum));
            szum=0;
        }
        
        
      
       
    
}
}
