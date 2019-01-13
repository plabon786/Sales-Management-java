
package minapos;

import java.util.Scanner;

public class Product {
    private String Name;
    private String ID;
    private double ProPrice;
    private final double T= 0.2;
    Scanner input= new Scanner(System.in);
    Product(){
        
    }
    
    public void Input_ProductName(){
       System.out.println("Enter Product Name:");
       Name= input.nextLine();
   }
   public void display_ProductName() {
        System.out.println("Name:"+Name);
    }
   
   public void Input_ProductID(){
       System.out.println("Enter Product ID:");
       ID= input.nextLine();
   }
   public void display_ProductID() {
        System.out.println("ID:"+ID);
    }
   public void Input_ProPrice(){
       System.out.println("Enter Product Price:");
      ProPrice= input.nextDouble();
   }
   public void display_proPrice() {
        System.out.println("proPrice:"+ProPrice);
    }
   public void Tax(double T){
     T= ProPrice*T;
   }
   
}
