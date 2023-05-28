import java.util.*;
class search{
    private int n;
    Scanner s=new Scanner(System.in);

    public void setN(int m) {
        n = m;
    }
    public int getN(){
        return n;
    }
    public void ls(){
        int[] a=new int[n];
        int i,k;
        System.out.println("enter array:");
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print("enter key:");
        k=s.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==k){
                System.out.println("found");
                break;
            }
        }
        if(i==n){
            System.out.println(" not found");
        }

    }
}
public class linear {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        search l=new search();
        System.out.print("enetr size of array:");
        int t;
        t=s.nextInt();
        l.setN(t);
        l.ls();
    }
}
