import java.util.*;
class dice{
    public int roll(){
        Random r=new Random();
        return r.nextInt(6);
    }
}
public class Rolling_dice {
    public static void main(String[] args){
          int i;
          dice dice1=new dice();
          dice dice2=new dice();
          int successful_attempts=0;
          for(i=0;i<10;i++){
              int a= dice1.roll();
              int b= dice2.roll();
              if(a==b){
                  successful_attempts++;
              }
          }
          System.out.println("the number of successful attempts are:"+successful_attempts);
    }
}
