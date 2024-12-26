import classes.Item;
import classes.Customer;
import classes.Order;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("Hoodie", 20000, 5);
        Customer nameObj2 = new Customer();
        nameObj2.setCName("Alfredo");

        Customer phoneObj = new Customer();
        phoneObj.setCPhone(87007246);

        Order IDObj = new Order();
        IDObj.setOrderID(1);

        Order statusObj = new Order();
        statusObj.setOrderStatus("Shipping");

        Order dateObj = new Order();
        dateObj.setOrderDate("23.01.2025");

        System.out.println("Customer Info: "+nameObj2.getCName() + "/ Customer phone: "+phoneObj.getCPhone());
        System.out.println("Order ID: "+IDObj.getOrderID() + "/ Order Status: " + statusObj.getOrderStatus() + "/ Order Date: " + dateObj.getOrderDate());
        System.out.println("Item Name: "+item.getItemName()+ "/ Item price: "+item.getItemPrice()+ "/ Quantity: "+item.getItemQuantity());
    }

}