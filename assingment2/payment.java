
import java.util.*;
public class payment
{
    // instance variables - replace the example below with your own
    private Customer customer;
    private String creditcardtype;
    private int creditcardnum;
    private Date date;
    private address address;
    private String bankName;
    private double paymentamount;
    private boolean valid;

    /**
     * Constructor for objects of class payment
     */
    public payment(Customer customer1, address address1, String creditcardtype, 
    int creditcardnum, double paymentamount, Date date)
    {
      customer = customer1;
      address = address1;
      this.creditcardtype = creditcardtype;
      this.creditcardnum = creditcardnum;
      this.paymentamount = paymentamount;
      this.date = date;
      
      valid = ((creditcardtype == "Visa") || (creditcardtype == "MasterCard"));
          
     
    }
    
    public boolean isValid()
    {
      return valid;      
     }
}
