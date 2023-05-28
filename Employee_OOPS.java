import java.util.*;

class Employee_N{
    private int id,sal,age;
    private String name,gen,des,ad;
    Employee_N() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getSal() {
        return sal;
    }

    public String getAd() {
        return ad;
    }

    public String getDes() {
        return des;
    }

    public String getGen() {
        return gen;
    }
}
public class Employee_OOPS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of employees:");
        int n=sc.nextInt();
        Employee_N[] e= new Employee_N[n];
        int i=0;
        while(i<n){
            //
            e[i]=new Employee_N();
            System.out.println("ID NAME GENDER AGE SAL DESIGNATION ADDRESS");
            int id,age,sal;
            String name,gender,des,ad;
            id=sc.nextInt();
            name=sc.next();
            gender=sc.next();
            age=sc.nextInt();
            sal=sc.nextInt();
            des=sc.next();
            ad=sc.next();
            e[i].setId(id);
            e[i].setName(name);
            e[i].setGen(gender);
            e[i].setDes(des);
            e[i].setAd(ad);
            e[i].setSal(sal);
            e[i].setAge(age);

            i++;
        }
        System.out.println("enter id");
        int d=sc.nextInt();
        for(i=0;i<n;i++){
            if(e[i].getId()==d) {
                System.out.println("name:"+e[i].getName());
                System.out.println("Id:"+e[i].getId());
                System.out.println("gender:"+e[i].getGen());
                System.out.println("age:"+e[i].getAge());
                System.out.println("Salary:"+e[i].getSal());
                System.out.println("Designation:"+e[i].getDes());
                System.out.println("address:"+e[i].getAd());
                break;
            }
        }
        if(i==n){
            System.out.println("not found");
        }
    }
}
