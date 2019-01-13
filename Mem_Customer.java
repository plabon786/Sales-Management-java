
package minapos;

public class Mem_Customer extends Customer implements Inter_Customer{

  @Override
    public void Input_Name() {
        System.out.println("Enter Customer Name:");
        Name= input.nextLine();
    }

    @Override
    public void display_Name() {
        System.out.println("Name:"+Name);
    }

    @Override
    public void Input_ID() {
       System.out.println("Enter Customer ID:");
        ID= input.nextLine();
    }

    @Override
    public void display_ID() {
     System.out.println("ID:"+ID);   
    }

    @Override
    public void Input_Address() {
        System.out.println("Enter Customer Address:");
        Address= input.nextLine();
    }

    @Override
    public void display_Address() {
        System.out.println("Address:"+Address); 
    }

}
