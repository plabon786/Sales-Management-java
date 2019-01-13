
package minapos;

import java.util.Scanner;

public class main {
 public static void main(String[] args) {
     System.out.println("WELCOME TO MINA BAZAR");
       System.out.println("Enter Your Customer Type(If Customer Regular press 1, for  Member press 2):");
       Scanner input= new Scanner(System.in);
       int n= input.nextInt();
       
       if(n==1){
           System.out.println("YOU ARE A REGULAR CUSTOMER.");
           Re_Customer RC= new Re_Customer();
           RC.Input_Name();
           RC.Input_ID();
           RC.Input_Address();
           
           RC.display_Name();
           RC.display_ID();
           RC.display_Address();
       }
     
       else{
           System.out.println("YOU ARE A MEMBER CUSTOMER");
           Mem_Customer MC= new Mem_Customer();
           MC.Input_Name();
           MC.Input_ID();
           MC.Input_Address();
           
           MC.display_Name();
           MC.display_ID();
           MC.display_Address();
       }
       SalesPerson SP= new SalesPerson();
       SP.Input_SalesPersonName();
       SP.Input_SalesPersonID();
       
       Product P=new Product();
       P.Input_ProductName();
       P.Input_ProductID();
       P.Input_ProPrice();
       P.Tax(n);
    }  
 
}
