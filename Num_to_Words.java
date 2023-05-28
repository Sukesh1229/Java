package WEEK5;

import java.util.Scanner;

class R_Words{
    String[] ones;
    String[] digits;
    String ey;
    String[] tens;
    int v;
    R_Words(){
        v=0;
        ones= new String[10];
        ones[0]="zero";
        ones[1]="one";
        ones[2]="two";
        ones[3]="three";
        ones[4]="four";
        ones[5]="five";
        ones[6]="six";
        ones[7]="seven";
        ones[8]="eight";
        ones[9]="nine";
        tens= new String[10];
        tens[0]="";
        tens[1]="een";
        tens[2]="twenty";
        tens[3]="thirty";
        tens[4]="forty";
        tens[5]="fifty";
        tens[6]="sixty";
        tens[7]="seventy";
        tens[8]="eighty";
        tens[9]="ninety";
        digits= new String[4];
        digits[0]="";
        digits[1]="";
        digits[3]="Thousand";
        digits[2]="hundred";
    }
    public String word(int n){
        if(n>1000){
            int o=n/1000;
            String y=ones[o]+digits[3]+" "+word(n%1000);
            return y;
        }
        if(n>100){
            int x=n/100;
            String y=ones[x]+digits[2]+" "+word(n%100);
            return y;
        }
        if(n>=20){
            int x=n/10;
            String y=tens[x]+ones[n%10]+" ";
            return y;
        }
        if(n==13){
            return "thirteen";
        }
        if(n==12){
            return "twelve";
        }
        if(n==11){
            return "eleven";
        }
        if(n==10){
            return "ten";
        }
        if(n<10){
            return ones[n];
        }
        int x=n%10;
        return ones[x]+"teen";
    }
}

public class Num_to_Words {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        R_Words rw= new R_Words();
        while(true){
            int x=scan.nextInt();
            System.out.println(rw.word(x));
        }

    }
}
