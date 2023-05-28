import org.w3c.dom.ls.LSOutput;

import java.util.*;
class S_names{
    private int n;
    Scanner s=new Scanner(System.in);
    public void setN(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public void s_name(){
        String[] a = new String[n];
        System.out.println("enter names");
        int i, j;
        for (i = 0; i < n; i++) {
            a[i] = s.nextLine();
        }
        for (i = 0; i < n; i++) {
            String temp;
            for (j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
public class sort_names {
    public static void main(String[] args){
              S_names c=new S_names();
              Scanner sc=new Scanner(System.in);
              System.out.print("enter no of names:");
              int n;
              n= sc.nextInt();
              c.setN(n);
              c.s_name();
    }
}
