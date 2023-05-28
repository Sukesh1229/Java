package WEEK5;
import java.util.*;
class bill{
    int units;
    int charge=5;
    int extra_charge=0;
    public void display(){
        System.out.println("CHARGES TO BE PAID:"+((units*charge)+extra_charge));
    }
}
public class electricity_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bill b=new bill();
        System.out.println("ENTER UNITS CONSUMED:");
        b.units=sc.nextInt();
        if(b.units>100){
            b.extra_charge=10;
        }
        System.out.println("==================================");
        System.out.println("            T S N P D C L       ");
        System.out.println("==================================");
        System.out.println("UNITS CONSUMED:"+b.units);
        System.out.println("CHARGE PER UNIT:"+b.charge);
        System.out.println("EXTRA CHARGE:"+b.extra_charge);
        b.display();
        System.out.println("==================================");
        System.out.println("           THANK YOU            ");
        System.out.println("==================================");

    }
}
