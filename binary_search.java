import java.util.*;
class start{

    public void b_search(int n,int k,int a[]){
        int j,flag=0;
        int i=0;
        j=n-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(a[mid]==k){
                flag=1;
                break;
            }else if(a[mid]<k){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        if(flag==0){
            System.out.println("not found");
        }else{
            System.out.println("found");
        }
    }
}
public class binary_search {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size array:");
        int t;
        t=s.nextInt();
        int[] a=new int[t];
        start b=new start();
        int i;
        System.out.println("enter elements:");
        for(i=0;i<t;i++){
          a[i]=s.nextInt();
        }
        int l;
        System.out.print("enter key:");
        l=s.nextInt();
        b.b_search(t,l,a);
    }
}
