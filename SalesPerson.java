
package minapos;

import java.util.Scanner;

public class SalesPerson{
    public String Name;
    public String ID;
    Scanner input= new Scanner(System.in);
   public void Input_SalesPersonName(){
       System.out.println("Enter Sales Person Name:");
       Name= input.nextLine();
   }
   public void display_SalesPersonName() {
        System.out.println("Name:"+Name);
    }
   
   public void Input_SalesPersonID(){
       System.out.println("Enter Sales Person ID:");
       ID= input.nextLine();
   }
   public void display_SalesPersonID() {
        System.out.println("ID:"+ID);
    }
}
