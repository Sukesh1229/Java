package WEEK6;
import java.util.*;
class HourlyEmployee extends contract_employee{
    private int NumberOfHours,WagesPerHour;
    public void setNumberOfHours(int NumberOfHours){
        this.NumberOfHours=NumberOfHours;
    }
    public void setWagesPerHour(int WagesPerHour){
        this.WagesPerHour=WagesPerHour;
    }

    public int getNumberOfHours() {
        return NumberOfHours;
    }

    public int getWagesPerHour() {
        return WagesPerHour;
    }
    public int calculateWages(){
        return WagesPerHour*NumberOfHours;
    }
}
class WeeklyEmployee extends contract_employee{
    private int NumberOfWeeks,WagesPerWeek;
    public void setNumberOfWeeks(int NumberOfWeeks){
        this.NumberOfWeeks=NumberOfWeeks;
    }
    public void setWagesPerWeek(int WagesPerWeek){
        this.WagesPerWeek=WagesPerWeek;
    }

    public int getNumberOfWeeks() {
        return NumberOfWeeks;
    }

    public int getWagesPerWeek() {
        return WagesPerWeek;
    }
    public int calculateWages(){
        return (WagesPerWeek*NumberOfWeeks);
    }
}
public class Inheritance_contractEmployee {
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int n1,n2,i;
         System.out.print("Enter number of hourly based employees:");
         n1=s.nextInt();
        System.out.println("Enter number of weekly based employees:");
         n2=s.nextInt();
         WeeklyEmployee[] w=new WeeklyEmployee[n2];
         HourlyEmployee[] h=new HourlyEmployee[n1];
         System.out.println("===============================================================");
         System.out.println("\t"+"\t"+"ENTER DETAILS OF HOURLY BASED EMPLOYEES");
        System.out.println("===============================================================");
        System.out.println("[frstname] [lastname] [department] [desig] [hours] [wages]");
         for(i=0;i<n1;i++){
              h[i]=new HourlyEmployee();
              h[i].setFirst_name(s.next());
              h[i].setLast_name(s.next());
              h[i].setDepartment(s.next());
              h[i].setDesignation(s.next());
              h[i].setNumberOfHours(s.nextInt());
              h[i].setWagesPerHour(s.nextInt());
         }
        System.out.println("===============================================================");
        System.out.println("\t"+"\t"+"ENTER DETAILS OF WEEKLY BASED EMPLOYEES");
        System.out.println("===============================================================");
        System.out.println("[frstname] [lastname] [department] [desig] [weeks] [wages]");
        for(i=0;i<n2;i++){
            w[i]=new WeeklyEmployee();
            w[i].setFirst_name(s.next());
            w[i].setLast_name(s.next());
            w[i].setDepartment(s.next());
            w[i].setDesignation(s.next());
            w[i].setNumberOfWeeks(s.nextInt());
            w[i].setWagesPerWeek(s.nextInt());
        }
        System.out.println("===============================================================");
        System.out.println("\t"+"\t"+"SALARY AND DETAILS OF HOURLY BASED EMPLOYEES");
        System.out.println("===============================================================");
        System.out.println("  [name]   [department] [designation] [salary]");
        for(i=0;i<n1;i++){
            System.out.println(h[i].getFirst_name()+" \t"+h[i].getLast_name()+" \t"+h[i].getDepartment()+" \t"+h[i].getDesignation()+" \t"+h[i].calculateWages());
        }
        System.out.println("===============================================================");
        System.out.println("\t"+"\t"+"SALARY AND DETAILS OF WEEKLY BASED EMPLOYEES");
        System.out.println("===============================================================");
        System.out.println("  [name]   [department] [designation] [salary]");
        for(i=0;i<n2;i++){
            System.out.println(w[i].getFirst_name()+" "+w[i].getLast_name()+" "+w[i].getDepartment()+" "+w[i].getDesignation()+" "+w[i].calculateWages());
        }
    }
}
