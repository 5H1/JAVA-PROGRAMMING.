import java.io.*;
import java.util.Scanner;
class Invoice{
        String number;
        String description;
        int quantity;
        double price;
        //Define instance variables here
        public Invoice(String n,String d,int q,double p){ 
        //Define parameterized constructor here
        
        number=n;
        description=d;
        price=p;
        quantity=q;
        }
       // Setters
       void setNumber(String n){
           number=n;
           
       }
       void setDescription(String d){
           description=d;
       }
       void setQuantity(int q){
           quantity=q;
           if(q<0)
           quantity=0;
       }
       void setPrice(double p){
           price=p;
           if(p<0)
           price=0.0;
       }
       // Getters
       String getNumber(){
           return number;
       }
       String getDescription(){
           return description;
           
       }
       int getQuantity(){
           return quantity;
       }
       double getPrice(){
           return price;
       }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if(quantity<0){
                    quantity=0;
                }
                if(price<0){
                    price=0.0;
                }
                return  quantity*price;
                
       }
}
public class Main{
         public static void main(String []args){
                   Invoice myInvoice;
                   //Write your code here 
                   Invoice object1=new Invoice("22","strawberry cake",6,9.9);
                   Invoice object2=new Invoice("32","raspberry",4,5.2);
                   Invoice object3=new Invoice("13","grape",5,22.4);
                   //print the Invoice
                   System.out.println("This is an Invoice for the Item(s) Sold:"+"\n");
                   System.out.println(object1.getNumber() + " " + object1.getDescription() +" " + object1.getQuantity() + " "+ object1.getPrice() + " " + object1.getInvoiceAmount());
                   System.out.println(object2.getNumber() + " " + object2.getDescription() +" " + object2.getQuantity() + " " + object2.getPrice() + " " + object2.getInvoiceAmount());
                   System.out.println(object3.getNumber() + " " + object3.getDescription() + " " + object3.getQuantity() +" " + object3.getPrice()+" " + object3.getInvoiceAmount());
                   System.out.println(" ");
                   double total = object1.getInvoiceAmount() + object2.getInvoiceAmount() + object3.getInvoiceAmount();
                   System.out.println(total);
                   
         }
}







