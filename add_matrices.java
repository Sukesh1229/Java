import java.util.*;
class Add{
    public void add_matrix(int n,int m,int a[][],int b[][]){
        int[][] c=new int[n][m];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
public class add_matrices {
        public static void main(String[] args){
            int n,m;
            Scanner s=new Scanner(System.in);
            System.out.print("enter no of rows:");
            n=s.nextInt();
            System.out.print("enter no of columns:");
            m=s.nextInt();
            int[][] a=new int[n][m];
            int[][] b=new int[n][m];
            int i,j;
            System.out.println("enter elements of first matrix");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("enter elements of second matrix");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    b[i][j]=s.nextInt();
                }
            }
            Add ad=new Add();
            ad.add_matrix(n,m,a,b);
        }
}
