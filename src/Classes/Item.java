package Classes;

public class Item {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String name) {
        this.itemName = name;
    }

    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int price) {
        this.itemPrice = price;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int quantity){
        this.itemQuantity = quantity;
    }
}
