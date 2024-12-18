import Classes.Item;
import Classes.Customer;
import Classes.Order;

public class Main {
    public static void main(String[] args) {
        Item nameObj = new Item();
        nameObj.setItemName("Hoodie");
        System.out.println(nameObj.getItemName());

        Item priceObj = new Item();
        priceObj.setItemPrice(50);
        System.out.println(priceObj.getItemPrice());

        Item quantityObj = new Item();
        quantityObj.setItemQuantity(3);
        System.out.println(quantityObj.getItemQuantity());

        Customer nameObj2 = new Customer();
        nameObj2.setCName("Alfredo");
        System.out.println(nameObj2.getCName());

        Customer phoneObj = new Customer();
        phoneObj.setCPhone(87007246);
        System.out.println(phoneObj.getCPhone());

        Order IDObj = new Order();
        IDObj.setOrderID(1);
        System.out.println(IDObj.getOrderID());
    }
}