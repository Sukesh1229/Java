package WEEK7;
import java.util.*;
abstract class Employee{
    abstract void getAmount(int n,int s);
}
class H_employee extends Employee{
    private int n,s;

    public void setS(int s) {
        this.s = s;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    @Override
    void getAmount(int n, int s) {
        System.out.println("SALARY TO BE PAID FOR HOURLY EMPLOYEE:"+(n*s));
    }
}
class W_employee extends Employee{
    private int n,s;

    public void setS(int s) {
        this.s = s;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    @Override
    void getAmount(int n, int s) {
        System.out.println("SALARY TO BE PAID FOR WEEKLY EMPLOYEE:"+(n*s));
    }
}
public class Abstract_employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,s1,s2;
        System.out.print("Enter no of hours worked:");
        n1= sc.nextInt();
        System.out.print("Enter wages per hr:");
        s1= sc.nextInt();
        System.out.print("Enter no of weeks worked:");
        n2= sc.nextInt();
        System.out.print("Enter wages per week:");
        s2= sc.nextInt();
        H_employee h=new H_employee();
        W_employee w=new W_employee();
        h.getAmount(n1,s1);
        w.getAmount(n2,s2);
    }
}
