/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emőke
 */
public class Metódusok {
    public static void Növekvő(int a, int b, int c){
        if(a<b && a<c)
        {
            if(b<c)
                System.out.println(a+","+b+","+c);
            else
                System.out.println(a+","+c+","+b);
        }
        else if(b<a && b<c)
        {
            if(a<c)
                System.out.println(b+","+a+","+c);
            else
                System.out.println(b+","+c+","+a);
        }
        else if(c<a && c<b)
        {
            if(a<b)
                System.out.println(c+","+a+","+","+b);
            else
                System.out.println(c+","+b+","+a);
                        
        }
                    
        
    }
    public static void Abszolut(double a,double b,double c){
        if(a<b && a<c)
            System.out.println("a minimum "+a);
        else if(b<c && b<a)
            System.out.println("a minimum "+b);
        else if(c<a && c<b)
            System.out.println("a minimum "+c);
        if(Math.abs(a)>Math.abs(b) && Math.abs(a)>Math.abs(c))
            System.out.println("a maximum "+Math.abs(a));
        else if(Math.abs(b)>Math.abs(a) && Math.abs(b)>Math.abs(c))
            System.out.println("a maximum "+Math.abs(b));
        else if(Math.abs(c)>Math.abs(a) && Math.abs(c)>Math.abs(b))
            System.out.println("a maximum "+Math.abs(c));
        
        }
    public static void kiiratas(double a,double b,double c,double d){
        System.out.println(a+","+b+","+c+","+d);
        if(d>=0)
            System.out.println(a+","+c+","+b+","+d);
        else
            System.out.println(a+","+b+","+d+","+c);
            
    }
    public static boolean haromszog(double a,double b,double c){
        if((a+b)>c && (a+c)>b && (b+c)>a)
            return true;
        else
            return false;
    }
    public static int szokoev(int a,int b){
        int db=0;
        for(int i=a+1;i<b;i++){
            if((i%100!=0 && i%4==0)||i%400==0)
                db++;
        }
        return db;
    }
    public static void erdemjegy(int a){
        switch(a){
            case 1: System.out.println("Elégtelen");
            break;
            case 2: System.out.println("Elégséges");
            break;
            case 3: System.out.println("Közepes");
            break;
            case 4: System.out.println("jó");
            break;
            case 5: System.out.println("Kiválo");
            break;
       
        }
    }
    public static int Hanyados(int a,int b){
        int hanyados=0;
        while(a>b){
            hanyados+=1;
            a-=b;
        }
        return hanyados;
    }
    public static boolean Primszam(int n){
        int szamlalo=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                szamlalo++;
        }
        if(szamlalo==2)
            return true;
        else
            return false;
    }
    public static void Fibonacci(int n){
        int a=0,b=1,c;
        int k;
        
        if(n==1)
            System.out.println(a);
        else if(n==2)
            System.out.print(a+" "+b+" ");
        else{
            c=a+b;
            k=3;
            System.out.print(a+","+b+","+c+" ");
            while(k<n){
                a=b;
                b=c;
                c=a+b;
                System.out.print(c+" ");
                k++;
            }
        }
            
    }
    public static int Megfordit(int n){
        int ujszam=0;
        while(n!=0){
            ujszam=ujszam*10+(n%10);
            n=n/10;
        }
        return ujszam;
    }
    public static long Faktorialis(int n){
        long szorzat=1;
        for(int i=1;i<=n;i++){
            szorzat*=i;
        }
        return szorzat;
    }
    public static void Megtalal(int n1,int n2,int k){
        for(int i=n1;i<=n2;i++){
            if(i%k==0)
                System.out.print(i+" ");
        }
    }
    
    public static int NFibonacci(int n){
        int a=0,b=1,c=a+b;
        if(n==0)
            return b;
        while(c<=n){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
    public static void Kob(){
        int sum=0;
        int n;
        for(int i=1;i<1000;i++){
            n=i;
            while(n!=0){
            sum+=Math.pow((n%10),3);
            n=n/10;
        }
            if(i==sum)
                System.out.print(sum+" ");
            sum=0;
        }
    }
    
    public static void main(String[] args) {
        Növekvő(8, 5, 3);
        Abszolut(5, 6.7, -16);
        kiiratas(23, 99, 1, 25);
        System.out.println(haromszog(3,4,5));
        System.out.println(szokoev(1990,2018));
        erdemjegy(5);
        System.out.println(Hanyados(23,4));
        System.out.println(Primszam(1009));
        Fibonacci(11);
        System.out.println(Megfordit(235));
        System.out.println(Faktorialis(5));
        Megtalal(45,89,3);
        System.out.println(NFibonacci(10));
        Kob();        
    }
}
