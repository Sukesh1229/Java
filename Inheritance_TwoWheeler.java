package WEEK6;
import java.util.*;
class Geared extends TwoWheeler{
    double avg;
    protected String type,name;
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public String getName() {
        return name;
    }
    public void setAvg(double avg){
        this.avg=avg;
    }
    public double getAvg(){
        return avg;
    }
    public void Gear_details(){
        System.out.println("DETAILS OF YOUR GEARED TWO WHEELER ARE AS FOLLOWS:");
        System.out.println("VEHICLE TYPE:"+getType());
        System.out.println("VEHICLE NAME"+getName());
        System.out.println("VEHICLE NUMBER: "+getVehicleNO());
        System.out.println("INSURENCE NUMBER: "+getInsurenceNo());
        System.out.println("COLOR OF VEHICLE: "+getColor());
        System.out.println("FUEL CONSUMPTION: "+getConsumption());
        System.out.println("MAINTENANCE CHAREGES: "+getMaintenance());
        System.out.println("AVERAGE: "+getAvg());
    }
}

class Non_Geared extends TwoWheeler{
    double avg;
    protected String type,name;
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public String getName() {
        return name;
    }
    public void setAvg(double avg){
        this.avg=avg;
    }
    public double getAvg(){
        return avg;
    }
    public void Non_Gear_details(){
        System.out.println("DETAILS OF YOUR NON-GEARED TWO WHEELER ARE AS FOLLOWS:");
        System.out.println("VEHICLE TYPE:"+getType());
        System.out.println("VEHICLE NAME"+getName());
        System.out.println("VEHICLE NUMBER: "+getVehicleNO());
        System.out.println("INSURENCE NUMBER: "+getInsurenceNo());
        System.out.println("COLOR OF VEHICLE: "+getColor());
        System.out.println("FUEL CONSUMPTION: "+getConsumption());
        System.out.println("MAINTENANCE CHAREGES: "+getMaintenance());
        System.out.println("AVERAGE: "+getAvg());
    }
}
public class Inheritance_TwoWheeler {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,m,i;
        System.out.println("ENTER DETAILS OF GEARED TWO WHEELER:");
        Geared t=new Geared();
        System.out.println("[TYPE]");
        t.setType(s.next());
        System.out.println("[NAME]");
        t.setName(s.next());
        System.out.println("[VEHICLE_NO]");
        t.setVehicleNO(s.nextInt());
        System.out.println("[INSURENCE]");
        t.setInsurenceNo(s.nextInt());
        System.out.println("[COLOR]");
        t.setColor(s.next());
        System.out.println("[COMSUMPTION]");
        t.setConsumption(s.nextDouble());
        System.out.println("[MAINTENANCE]");
        t.setMaintenance(s.nextDouble());
        System.out.println("[AVERAGE]");
        t.setAvg(s.nextDouble());
        Non_Geared f=new Non_Geared();
        System.out.println("ENTER DETAILS OF NON GEARED WHEELER:");
        System.out.println("[TYPE]");
        f.setType(s.next());
        System.out.println("[NAME]");
        f.setName(s.next());
        System.out.println("[VEHICLE_NO]");
        f.setVehicleNO(s.nextInt());
        System.out.println("[INSURENCE]");
        f.setInsurenceNo(s.nextInt());
        System.out.println("[COLOR]");
        f.setColor(s.next());
        System.out.println("[COMSUMPTION]");
        f.setConsumption(s.nextDouble());
        System.out.println("[MAINTENANCE]");
        f.setMaintenance(s.nextDouble());
        System.out.println("[AVERAGE]");
        f.setAvg(s.nextDouble());
        System.out.println("==================================================================================");
        System.out.println("================================GEARED=======================================");
        System.out.println("==================================================================================");
        t.Gear_details();
        System.out.println("==================================================================================");
        System.out.println("================================NON GEARED=======================================");
        System.out.println("==================================================================================");
        f.Non_Gear_details();


    }
}
