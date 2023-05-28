package WEEK6;
import java.util.*;
class Employee{
    protected String first_name,last_name;
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    public void setLast_name(String last_name){
        this.last_name=last_name;
    }
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
}
class contract_employee extends Employee{
    protected String department,designation;
    public void setDepartment(String department){
        this.department=department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }
    public void displayFullName(){
        System.out.println("FULL NAME OF CONTRACT EMPLOYEE:"+this.first_name+" "+this.last_name);
    }
}
class regular_employee extends Employee{
    protected String department,designation;
    public void setDepartment(String department){
        this.department=department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }
    public void displayFullName(){
        System.out.println("FULL NAME OF REGULAR EMPLOYEE:"+this.first_name+" "+this.last_name);
    }
}
public class Inheritance_employee {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        contract_employee c=new contract_employee();
        regular_employee r=new regular_employee();
        c.setFirst_name("THARUN");
        c.setLast_name("PATEL");
        c.setDepartment("CSE");
        c.setDesignation("HOD");
        c.displayFullName();
        System.out.println("DEPARTMENT IS:"+c.getDepartment());
        System.out.println("DESIGNATION:"+c.getDesignation());
        r.setFirst_name("PRAVEEN");
        r.setLast_name("CHINTU");
        r.setDepartment("CSE");
        r.setDesignation("ADMINISTARTOR");
        r.displayFullName();
        System.out.println("DEPARTMENT IS:"+r.getDepartment());
        System.out.println("DESIGNATION:"+r.getDesignation());

    }
}
