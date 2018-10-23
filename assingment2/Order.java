
import java.util.ArrayList;
public class Order
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;
    private Customer customer;
    private long orderId;
    private address address;
    private payment payment;

    public Order(ShoppingCart shoppingCart)
    {
        items = new ArrayList<>();
        shoppingCart.transfer(items);
        this.customer = shoppingCart.getcustomer();
        orderId  = makeOrderId();
        
    }
    
    public Customer getcustomer(){
        return customer;
    }
    
    private long makeOrderId() {
        return (long)(Math.random() * 99999999999999L);
    }

    public address getaddress(){
        return address;
    }
    
    public payment getpayment(){
        return payment;
    }
    
    public String listItems(){
        String list = "";
        for(int i= 0; i < items.size(); i++){
            list += items.get(i).toString()+ "\n";
        }
        return list;
    }
   
}
