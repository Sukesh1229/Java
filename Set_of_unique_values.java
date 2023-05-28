import java.util.*;
class values{
    int i=0,m;
    Scanner s=new Scanner(System.in);
    int []a=new int[5];
    public void read(){
        while(i<5){
            System.out.println("enter number:");
            m=s.nextInt();
            if(m>10 && m<=100){
                int j,k;
                for(j=0;j<i;j++){
                    if(a[j]==m){
                        break;
                    }
                }
                if(i==j){
                    a[i]=m;
                    for(k=0;k<=i;k++){
                        System.out.print(a[k]+" ");
                    }
                    i++;
                }else{
                    System.out.print("THE ARRAY IS:");
                    for(k=0;k<i;k++){
                        System.out.print(a[k]+" ");
                    }
                    System.out.println("enter unique value");
                }
            }else{
                System.out.println("enter valid number");
            }
        }
    }
}
public class Set_of_unique_values {
    public static void main(String[] args){
        values a=new values();
        a.read();

    }
}
