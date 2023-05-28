import java.util.*;
class Product_details{
    private int product_id;
    private String product_name;
    private int product_quantity;
    private double product_price;
    Product_details(){

    }
    public void setProduct_id(int id){
        product_id=id;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public double getProduct_price() {
        return product_price;
    }
    public int getProduct_quantity() {
        return product_quantity;
    }

    public String getProduct_name() {
        return product_name;
    }
}
public class Mail_order {
    public static void main(String[] args){
           int n;
           Scanner s=new Scanner(System.in);
           System.out.print("enter number of products");
           n=s.nextInt();
           Product_details[] p=new Product_details[n];
           int i=0;
           while(i<n){
               p[i]=new Product_details();
               String name;
               int id,quantity;
               double price;
               System.out.println("NAME ID PRICE QUANTITY");
               name=s.next();
               id=s.nextInt();
               price=s.nextDouble();
               quantity=s.nextInt();
               p[i].setProduct_name(name);
               p[i].setProduct_id(id);
               p[i].setProduct_price(price);
               p[i].setProduct_quantity(quantity);
               i++;
           }
           System.out.println("name "+"id "+"price "+"quantity ");
           for(i=0;i<n;i++){
               System.out.println(p[i].getProduct_name()+" | "+p[i].getProduct_id()+" | "+p[i].getProduct_price()+" | "+p[i].getProduct_quantity());
           }
           System.out.print("enter the no products you need to buy:");
           int m;
           double sum=0;
           m=s.nextInt();
           for(i=0;i<m;i++){
               int l,q;
              System.out.print("enter id of product:");
              l=s.nextInt();
              System.out.print("enter quantity pf product:");
              q=s.nextInt();
              switch(l){
                  case 1:
                      sum=sum+(p[0].getProduct_price()*q);
                      break;
                  case 2:
                      sum=sum+(p[1].getProduct_price()*q);
                      break;
                  case 3:
                      sum=sum+(p[2].getProduct_price()*q);
                      break;
                  case 4:
                      sum=sum+(p[3].getProduct_price()*q);
                      break;
                  case 5:
                      sum=sum+(p[4].getProduct_price()*q);
                      break;
              }
           }
           System.out.println("The total price is:"+sum);
    }

}
