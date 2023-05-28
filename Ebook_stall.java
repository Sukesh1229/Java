import java.util.*;
class Book{
    private String book_name,book_author;
    private int book_count;

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public void setBook_count(int book_count) {
        this.book_count = book_count;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public int getBook_count() {
        return book_count;
    }
}
class Customer{
    private int customer_id;
    private String customer_name,customer_address;

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public String getCustomer_name() {
        return customer_name;
    }
}
public class Ebook_stall {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("enter no of books:");
        n= s.nextInt();
        int i;
        Book b[]=new Book[n];
        for(i=0;i<n;i++){
            b[i]=new Book();
            String book_name,book_author;
            int book_count;
            System.out.println("[book_name] [author] [count]");
            book_name = s.next();
            book_author=s.next();
            book_count=s.nextInt();
            b[i].setBook_name(book_name);
            b[i].setBook_author(book_author);
            b[i].setBook_count(book_count);
        }
        System.out.print("enter no of customers:");
        int m= s.nextInt();
        Customer c[]=new Customer[m];
        for(i=0;i<m;i++){
            int customer_id;
            String customer_name,customer_address;
            c[i]=new Customer();
            System.out.println("[customer name] [ID] address");
            customer_name=s.next();
            customer_id=s.nextInt();
            customer_address=s.next();
            c[i].setCustomer_name(customer_name);
            c[i].setCustomer_id(customer_id);
            c[i].setCustomer_address(customer_address);
        }
        System.out.print("enter no of customers:");
        int w= s.nextInt();
        for(i=0;i<w;i++){
            System.out.print("Enter id of customer who need to buy:");
            int id=s.nextInt();
            System.out.print("enter name of book needed:");
            String name= s.next();
            int j,k,flag=0,flag1=0;
            for(j=0;j<m;j++){
                if(c[j].getCustomer_id()==id){
                    flag1=1;
                    for(k=0;k<n;k++){

                        if(b[k].getBook_name().compareTo(name)==0){
                           if(b[k].getBook_count()>0){
                               int r=b[k].getBook_count();
                               r=r-1;
                               b[k].setBook_count(r);
                               flag=1;
                               System.out.println(c[j].getCustomer_name()+" bought a book");
                               System.out.println("NAME OF BOOK:"+b[k].getBook_name());
                               System.out.println("REMAINING COUNT OF BOOK:"+b[k].getBook_count());
                           }else{
                               System.out.println("OUT OF STOCK");
                           }
                        }
                    }
                }
            }
            if(flag1==0){
                System.out.println("enter valid details:");
            }
        }
    }
}
