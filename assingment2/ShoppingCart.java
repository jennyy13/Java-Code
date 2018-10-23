
import java.util.ArrayList;
public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private String timeStamp;
    private final long cartID;
    private ArrayList<Item> items;
    private int total;
    private Customer customer;
    private boolean open;
    
    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart(Customer customer)
    {
        this.timeStamp = timeStamp;
        this.cartID = makeItemID(); 
        this.customer = customer;
        items = new ArrayList<>();
        open = true;
    }
    // add accessor and mutators for all the above fields. 
    
     private long makeItemID() {
        return (long)(Math.random() * 99999999999999L);
    }
    
    public void addItem(Item item){
        if(open){
        items.add(item);
        }
        else {
        System.out.println("Sorry, the shopping cart is closed.");
        }
    }
    public void removeItem(Item item){
        items.remove(item);
    }
     
    public void close(){
        open = false;
    }
    
    public void transfer(ArrayList<Item> destinationList){
        while (items.size()>0){
            Item item = items.get(0);
            destinationList.add(item);
            items.remove(item);
        }
    }
    
    public Customer getcustomer(){
        return customer;      
    }
}

