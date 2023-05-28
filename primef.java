import java.util.*;
class factors{
       int i,j,n;
   public void fact(){
       for(i=2;i<=n;i++){
             if(n%i==0){
                    for(j=2;j<i;j++){
			if(i%j==0){
				break;	
				}

			}
		if(i==j){
			System.out.println( i +" ");
			}
		}
		

}
}    
}
class primef{
      public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		factors f=new factors();
                System.out.print("ENTER NUMBER:");
                f.n=s.nextInt();
		f.fact();	
	}
}