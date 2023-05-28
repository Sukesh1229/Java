package WEEK4;
import java.util.*;
public class Reverse_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String w,k="";
        System.out.println("ENTER STRING:");
        w=s.next();
        int i;
        for(i=w.length()-1;i>=0;i--){
            k=k+w.charAt(i);
        }
        System.out.println("REVERSE OF GIVEN STRING IS:"+k);
    }
}
