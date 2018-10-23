import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionTest
{
    
    
    public static void main(String[] args)
    {
       TransactionTest test = new TransactionTest();
       test.transaction2(); // calls the method with our test scenario
    }
    
    public void transaction1(){  
        
    //1. Create New Customer
    Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");
    ShoppingCart cart = new ShoppingCart(customer);
    Item item1 = new Item("dress", 123456);
    item1.setPrice(20);
    cart.addItem(item1);
    Item item2 = new Item("shoes", 678900);
    item2.setPrice(20);
    cart.addItem(item2);
    Item item3 = new Item("trousers", 456789);
    item3.setPrice(20);
    cart.addItem(item3);
    Order order = new Order(cart);
    address address = new address("7","Mainstreet","Galway", "H91X0EP", 
    "Ireland");

    String datestring = "2018-10-20";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    Date orderDate = dateFormat.parse(datestring);
    payment payment = new payment(customer, address, "Visa", 1234567, 20.00, null/*orderDate*/);
    email email = new email(address, customer, order, payment);
    email.createEmail();
    
  
    }
    
    public void transaction2(){  
        
    
    Customer customer2 = new Customer("Roisin", "Monaghan", "roisin@zmail.com");
    ShoppingCart cart2 = new ShoppingCart(customer2);
    Item item2_1 = new Item("dress", 567849);
    item2_1.setPrice(10);
    cart2.addItem(item2_1);
    Item item2_2 = new Item("scarf", 686354);
    item2_2.setPrice(25);
    cart2.addItem(item2_2);
    Item item2_3 = new Item("hat", 213845);
    item2_3.setPrice(10);
    cart2.addItem(item2_3);
    //cart2.displayItems_Total();
    cart2.removeItem(item2_3);
    Order order2 = new Order(cart2);
    address address2 = new address("6", "mainstreet", "Mayo", "H91X0EP", "Croatia");
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    Date orderDate2 = dateFormat.parse("2018-10-27");
    payment payment2 = new payment(customer2, address2, "Visa", 1234567, 20.00, null/*orderDate2*/);
    email email2 = new email(address2, customer2, order2, payment2);
    email2.createEmail();
          
    }
}