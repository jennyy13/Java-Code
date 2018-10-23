
public class email
{
    private address address;
    private Customer customer;
    private Order order;
    private payment payment;
     
   public email( address address, Customer customer, Order order, 
   payment payment)
    {
   this.address = address;
   this.customer = customer;
   this.order = order;
   this.payment = payment;
   
  }

    public void sendSuccessMessage(){
         System.out.println("Dear" + " " +
    order.getcustomer().getFirstName() +" " + order.getcustomer().getEmailAddress());
    System.out.println("Order:" + " "+ order.listItems());
    System.out.println("Address:" + " " + address.getnumorname()+ ", " + address.getstreet()+ ", " + 
    address.getcity()+ ", " + address.getzip() + ", " + address.getcountry());
   }

    public void sendUnsuccessMessage(){
     
    System.out.println("Dear" + " " +
    order.getcustomer().getFirstName() +" " + order.getcustomer().getEmailAddress());
    System.out.println("The payment was unsuccessful so the order has not been made.");
   }

    public void createEmail(){
    if(payment.isValid())
    sendSuccessMessage();
    
    else 
    sendUnsuccessMessage();
    }
}
 

