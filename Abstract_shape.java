package WEEK7;
import java.util.*;
abstract class shape{
    abstract float getArea(int r,int a);
    abstract float getVolume(int r,int a);
}
class measure extends shape{
    int r,a;
    public void setA(int a){
        this.a=a;
    }
    public void setR(int r){
        this.r=r;
    }

    public int getA() {
        return a;
    }

    public int getR() {
        return r;
    }

    @Override
    float getArea(int r, int a) {
        System.out.println("AREA OF SQUARE : "+(a*a));
        System.out.println("AREA OF CIRCLE : "+(3.14*r*r));
        System.out.println("AREA OF CUBE : "+(6*a*a));
        System.out.println("AREA OF SPHERE : "+(4*3.14*r*r));
        return 0;
    }

    @Override
    float getVolume(int r, int a) {
        System.out.println("VOLUME OF CUBE : "+(a*a*a));
        System.out.println("VOLUME OF SPHERE : "+((4/3)*3.14*r*r*r));
        return 0;
    }
}
public class Abstract_shape {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,r;
        System.out.print("ENTER SIDE OS SQUARE:");
        a=s.nextInt();
        System.out.print("ENTER RADIUS OF CIRCLE:");
        r=s.nextInt();
        measure m=new measure();
        m.getArea(r,a);
        m.getVolume(r,a);
    }
}
