package WEEK4;
import java.util.*;
public class Concate_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1,s2;
        System.out.println("enter first string:");
        s1=s.next();
        System.out.println("enter second string:");
        s2=s.next();
        s1=s1.concat(s2);
        System.out.println(s1);
    }
}
