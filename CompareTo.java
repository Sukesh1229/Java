import java.util.*;
class input{
    private String s;

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}  
public class CompareTo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        input i=new input();
        input j=new input();
        System.out.print("ENTER 1ST STRING:");
        i.setS(s.next());
        System.out.print("ENTER 2nd STRING:");
        j.setS(s.next());
        if(i.getS().compareTo(j.getS())>0){
            System.out.println(i.getS()+" greater than "+j.getS());
        }else if(i.getS().compareTo(j.getS())<0){
            System.out.println(i.getS()+" less than "+j.getS());
        }else{
            System.out.println(i.getS()+" equal to "+j.getS());
        }
    }
}
