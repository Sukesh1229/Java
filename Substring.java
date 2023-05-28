package WEEK4;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String m,sub;
        System.out.println("enter main staring");
        m=s.nextLine();
        System.out.println("Enter sub string:");
        sub=s.nextLine();
        System.out.println("enter char to start:");
        char l=s.next().charAt(0);
        System.out.println("enter char to start:");
        char mk=s.next().charAt(0);
        int a=m.indexOf(l);
        int b=m.indexOf(mk);
        System.out.println("GIVEN STRING STARTS WITH THE SUB STRING:"+m.startsWith(sub));
        System.out.println("GIVEN STRING ENDS WITH THE SUB STRING:"+m.endsWith(sub));
        System.out.println("SUB STRING IN THE MAIN STRING IS:"+m.substring(a,b));

    }
}
