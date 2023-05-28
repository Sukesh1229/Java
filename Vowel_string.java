package WEEK4;
import java.util.*;
public class Vowel_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1;
        System.out.println("enter string");
        s1=s.next();
        int i=s1.length();
        int j,v=0,c=0;
        System.out.println("VOWELS ARE:");
        for(j=0;j<i;j++){
            switch(s1.charAt(j)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println(s1.charAt(j)+" is a vowel");
                    v++;
                    break;
                case ' ':
                     break;
                default:
                    System.out.println(s1.charAt(j)+"is a consonant");
                    c++;
                    break;
            }
        }
        System.out.println("vowel:"+v);
        System.out.println("consonants: "+c);
    }
}
