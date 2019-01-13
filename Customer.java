
package minapos;

import java.util.Scanner;

public class Customer {
    protected String Name;
    protected String ID;
    protected String Address;
   
  Scanner input= new Scanner (System.in);
  
  public Customer(){
      
    }
    public String get_CustName(){
    return Name;
    }
    
    public String get_CustID(){
    return ID;
    }
    
    public String get_CustAddress(){
    return Address;
    }
}
