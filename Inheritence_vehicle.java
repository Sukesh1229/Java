package WEEK6;
import java.util.*;
class Vehicle{
    protected int vehicleNO,insurenceNo;
    protected double consumption;
    protected String color;

    public void setVehicleNO(int vehicleNO) {
        this.vehicleNO = vehicleNO;
    }

    public void setInsurenceNo(int insurenceNo) {
        this.insurenceNo = insurenceNo;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getInsurenceNo() {
        return insurenceNo;
    }

    public int getVehicleNO() {
        return vehicleNO;
    }

    public String getColor() {
        return color;
    }
    public void displayConsumption(){
        System.out.println("consumption of vehicle is"+getConsumption());
    }
}
class TwoWheeler extends Vehicle{
    protected double maintenance,average;
    public void setMaintenance(double maintenance){
        this.maintenance=maintenance;
    }
    public void setAverage(double average){
        this.average=average;
    }

    public double getMaintenance() {
        return maintenance;
    }

    public double getAverage() {
        return average;
    }
    public void details(){
        System.out.println("DETAILS OF YOUR TWO WHEELER ARE AS FOLLOWS:");
        System.out.println("VEHICLE NUMBER: "+getVehicleNO());
        System.out.println("INSURENCE NUMBER: "+getInsurenceNo());
        System.out.println("COLOR OF VEHICLE: "+getColor());
        System.out.println("FUEL CONSUMPTION: "+getConsumption());
        System.out.println("MAINTENANCE CHAREGES: "+getMaintenance());
        System.out.println("AVERAGE: "+getAverage());
    }
}
class FourWheeler extends Vehicle{
    private double maintenance,average;
    public void setMaintenance(double maintenance){
        this.maintenance=maintenance;
    }
    public void setAverage(double average){
        this.average=average;
    }

    public double getMaintenance() {
        return maintenance;
    }

    public double getAverage() {
        return average;
    }
    public void details(){
        System.out.println("DETAILS OF YOUR FOUR WHEELER ARE AS FOLLOWS:");
        System.out.println("VEHICLE NUMBER: "+getVehicleNO());
        System.out.println("INSURENCE NUMBER: "+getInsurenceNo());
        System.out.println("COLOR OF VEHICLE: "+getColor());
        System.out.println("FUEL CONSUMPTION: "+getConsumption());
        System.out.println("MAINTENANCE CHAREGES: "+getMaintenance());
        System.out.println("AVERAGE: "+getAverage());
    }
}
public class Inheritence_vehicle {
    public static void main(String[] args){
           Scanner s= new Scanner(System.in);
           int n,m,i;
        System.out.println("ENTER DETAILS OF TWO WHEELER:");
        System.out.println("[VEHICLE_NO]");
        TwoWheeler t=new TwoWheeler();
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
        t.setAverage(s.nextDouble());
        FourWheeler f=new FourWheeler();
        System.out.println("ENTER DETAILS OF FOUR WHEELER:");
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
        f.setAverage(s.nextDouble());
        System.out.println("==================================================================================");
        System.out.println("================================TWO WHEELER=======================================");
        System.out.println("==================================================================================");
        t.details();
        System.out.println("==================================================================================");
        System.out.println("================================FOUR WHEELER=======================================");
        System.out.println("==================================================================================");
        f.details();


    }
}
