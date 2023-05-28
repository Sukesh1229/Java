package WEEK4;
import java.util.*;
class read{
    private String s;
    public void setS(String s){
        this.s=s;
    }

    public String getS() {
        return s;
    }
}
public class String_method_equals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER 1ST STRING:");
        read s=new read();
        read s1=new read();
        s.setS(sc.next());
        System.out.print("ENTER 2ND STRING:");
        s1.setS(sc.next());
        if(s.getS().equals(s1.getS())){
            System.out.println(s.getS()+" & "+s1.getS()+" are equal");
        }else if(s.getS().equalsIgnoreCase(s1.getS())){
            System.out.println(s.getS()+" & "+s1.getS()+" are equal if we ignore case");
        }else{
            System.out.println(s.getS()+" & "+s1.getS()+" are not equal");
        }
    }
}
