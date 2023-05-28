package WEEK5;
import java.util.*;
class sal{
    int salary;
    double hre,da;
}
public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SALARY:");
        sal s=new sal();
        s.salary=sc.nextInt();
        s.hre=((s.salary*18)/100);
        s.da=((s.salary*27)/100);
        System.out.println("======================");
        System.out.println("    SALARY SLIP");
        System.out.println("======================");
        System.out.println("SALARY:"+s.salary);
        System.out.println("HRE:"+s.hre);
        System.out.println("DA:"+s.da);
        System.out.println("TOTAL SALARY:"+(s.salary+s.da+s.hre));
    }
}
