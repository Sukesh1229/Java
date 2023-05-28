import java.util.*;
class employee_details{
    private int n,i;
    int[] id;
    int[] sal;
    int[] age;
    String[] name;
    String[] gen;
    String[] des;
    String[] ad;
    Scanner sc = new Scanner(System.in);
     public void setN(int n){
         this.n=n;
         id=new int[n];
         sal=new int[n];
         age=new int[n];
         name=new String[n];
         gen=new String[n];
         des=new String[n];
         ad=new String[n];

     }
     public int getN(){
         return n;
     }

    public void get_details() {
        for (i = 0; i < n; i++) {
            System.out.print("enter name");
            name[i] = sc.next();
            System.out.print("enter gender");
            gen[i] = sc.next();
            System.out.print("enter designation:");
            des[i] = sc.next();
            System.out.print("enter address:");
            ad[i] = sc.next();
            System.out.print("enter ID:");
            id[i] = sc.nextInt();
            System.out.print("enter salary");
            sal[i] = sc.nextInt();
            System.out.print("enter age");
            age[i] = sc.nextInt();

        }
    }
    public void search_details(){
              int key;
              key=sc.nextInt();
              for(i=0;i<n;i++){
                  if(id[i]==key){
                      System.out.println(name[i]);
                      break;
                  }
              }
              if(i==n){
                  System.out.println("not found");
              }
    }
}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter no of employees:");
        n = sc.nextInt();
        employee_details a=new employee_details();
        a.setN(n);
        a.get_details();
        a.search_details();
    }
}
