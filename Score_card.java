package WEEK5;
import java.util.*;
class subjects{
   int marks,credits,t_credits;
   String name,grade;

}

public class Score_card {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int n=sc.nextInt();
        subjects s[]=new subjects[n];
        int i,sum=0,flag=0,t=0;
        System.out.println("[SUBNAME] [MARKS]  [CREDITS]");
        for(i=0;i<n;i++){
            s[i]=new subjects();
            s[i].name=sc.next();
            s[i].marks=sc.nextInt();
            s[i].credits=sc.nextInt();
            t=t+s[i].credits;
            if(s[i].marks>=90){
                s[i].grade="EX";
                s[i].t_credits=(s[i].credits*10);
            }else if(s[i].marks>=80 && s[i].marks<90){
                s[i].grade="A";
                s[i].t_credits=(s[i].credits*9);
            }else if(s[i].marks>=70 && s[i].marks<80){
                s[i].grade="B";
                s[i].t_credits=(s[i].credits*8);
            }else if(s[i].marks>=60 && s[i].marks<70){
                s[i].grade="C";
                s[i].t_credits=(s[i].credits*7);
            }else if(s[i].marks>=50 && s[i].marks<60){
                s[i].grade="D";
                s[i].t_credits=(s[i].credits*6);
            }else if(s[i].marks>=40 && s[i].marks<50){
                s[i].grade="P";
                s[i].t_credits=(s[i].credits*5);
            }else{
                s[i].grade="R";
                flag=1;
                s[i].t_credits=(s[i].credits*0);
            }
            sum=sum+s[i].t_credits;
        }
        System.out.println("==========================================================================");
        System.out.println("        RAJIV GANDHI UNIVERSITY OF KNOWLEDGE AND TECH       ");
        System.out.println("==========================================================================");
        System.out.println("SUBJECT\t CREDITS\t GRADE\tT_CREDITS");
        for(i=0;i<n;i++){
            System.out.println(s[i].name+"\t\t"+s[i].credits+"\t\t"+s[i].grade+"\t\t"+s[i].t_credits);
        }
        System.out.println("======================================");
        double f=(sum/t);
        if (flag == 0) {
            System.out.println("TOTAL CREDITS"+"\t\t\t\t\t"+sum);
            System.out.println("CGPA"+"\t\t\t\t\t\t\t"+f);
        }else{
            System.out.println("TOTAL CREDITS"+"\t\t\t\t\t"+0.0);
            System.out.println("CGPA"+"\t\t\t\t\t\t\t"+0.0);
        }

    }
}
