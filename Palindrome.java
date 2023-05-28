import java.util.*;
class Check{
      int m,n,i;
     public void pal(){
		m=n;
		while(n>0){
			i=i*10;
                         i=i+(n%10);
			n=n/10;
		}
	if(i==m){
		System.out.println("palindrome");
		}
	else{
		System.out.println("not palindrome");
		}
	}
}
class Palindrome{
           public static void main(String[] args){
			Scanner s=new Scanner(System.in);
			Check p=new Check();
			System.out.println("ENTER NUMBER:");
			p.n=s.nextInt();
			p.pal();
		}
}