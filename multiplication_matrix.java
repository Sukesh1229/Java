import javax.imageio.stream.ImageInputStream;
import java.util.*;
class multiply{
    public void mul_matrix(int n1,int n2,int m1,int m2,int a[][],int b[][]){
        int i,j,k,sum=0;
        int[][] c=new int[n1][m2];
        if(m1==n2) {
            for (i = 0; i < n1; i ++) {
                for (j = 0; j < m2; j++) {
                    for (k = 0; k < m1; k++) {
                            sum=sum+(a[i][k]*b[k][j]);
                    }
                    c[i][j]=sum;
                    sum=0;
                }
            }
            for(i=0;i<n1;i++){
                for(j=0;j<m2;j++){
                    System.out.print(c[i][j]+"\t");

                }
                System.out.print("\n");
            }
        }
        else{
            System.out.println("matrix multiplication is not possible:");
        }

    }

}
public class multiplication_matrix {
    public static void main(String[] args){
        int n1,n2,m1,m2;
        Scanner s=new Scanner(System.in);
        System.out.print("enter no of row of matrix1:");
        n1=s.nextInt();
        System.out.print("enter no of columns of matrix1");
        m1=s.nextInt();
        System.out.print("enter no of row of matrix2:");
        n2=s.nextInt();
        System.out.print("enter no of columns of matrix2");
        m2=s.nextInt();
        int[][] a=new int[n1][m1];
        int[][] b=new int[n2][m2];
        int i,j;
        System.out.println("enter matrix2:");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter matrix2:");
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                b[i][j]=s.nextInt();
            }
        }
        multiply m=new multiply();
        m.mul_matrix(n1,m1,n2,m2,a,b);
    }
}
