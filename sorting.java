import java.util.*;
class sort{
   private int n,i,j;
    Scanner s=new Scanner(System.in);
   public void setN(int n){
       this.n=n;
   }
   public int getN(){
       return n;
   }
    public void swap(){
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}
public class sorting {
    public static void main(String[] args){
        System.out.print("enter size fo array:");
        Scanner s=new Scanner(System.in);
        sort w=new sort();
        int n;
        n=s.nextInt();
        w.setN(n);
        w.swap();


    }
}
