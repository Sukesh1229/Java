package WEEK4;
import java.util.*;
public class Alphabet_occurences {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sc,w;
        System.out.println("enter sentence");
        sc=s.nextLine();
        System.out.println("enter alphabet");
        w=s.next();
        int i=sc.indexOf(w);
        int count=0;
        while(i>=0){
            count++;
            i=sc.indexOf(w,i+1);
        }
        System.out.println("count "+count);
    }
}
