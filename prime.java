import java.util.*;
class check{
    int n;
    int i=0;
    public void prim(){
        for(i=2;i<n;i++){
              if(n%i==0){
			break;
}
}
if(i==n){
	System.out.println("prime number");
}
else{
    System.out.println("not a prime");
}
}

}
class prime{
      public static void main(String[] args){
         check c=new check();
	 Scanner s=new Scanner(System.in);
         System.out.print("enter number:");
         c.n=s.nextInt();
	c.prim();
}
}