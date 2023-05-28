import java.util.*;

import static java.lang.Math.sqrt;

class Findroots{
    private int a,b,c;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public void root(){
        System.out.println("The given equation:"+a+"X^2"+"+"+b+"X"+"+"+c);
        int d=(b*b)-(4*a*c);
        double r1,r2;
        if(d>0){
            System.out.println("roots are real and unequal:");
            r1=(-b-(sqrt(d)))/2*a;
            r2=(-b+(sqrt(d)))/2*a;
            System.out.println("first root:"+r1);
            System.out.println("second root"+r2);
        }else if(d==0){
            System.out.println("roots are real and equal:");
            r1=(-b-(sqrt(d)))/2*a;
            r2=(-b+(sqrt(d)))/2*a;
            System.out.println("first root:"+r1);
            System.out.println("second root"+r2);
        }else{
            System.out.println("roots are imaginary:");
            r1=(-b-(sqrt(d)))/2*a;
            r2=(-b+(sqrt(d)))/2*a;
            System.out.println("first root:"+r1);
            System.out.println("second root"+r2);
        }
    }
}
public class Quadratic_equation {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i,j,k;
        Findroots f=new Findroots();
        System.out.print("enter a value:");
        i=s.nextInt();
        System.out.print("enter b value:");
        j=s.nextInt();
        System.out.print("enter c value:");
        k=s.nextInt();
        f.setA(i);
        f.setB(j);
        f.setC(k);
        f.root();
    }
}
