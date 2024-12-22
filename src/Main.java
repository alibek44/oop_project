import Classes.Item;
import Classes.Customer;
import Classes.Order;

public class Main {
    public static void main(String[] args) {
        Item nameObj = new Item();
        nameObj.setItemName("Hoodie");

        Item priceObj = new Item();
        priceObj.setItemPrice(50);

        Item quantityObj = new Item();
        quantityObj.setItemQuantity(3);

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
        System.out.println("Item Name: "+nameObj.getItemName()+ "/ Item price: "+priceObj.getItemPrice()+ "/ Quantity: "+quantityObj.getItemQuantity());
    }

}