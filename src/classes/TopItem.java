package classes;

public class TopItem extends Item {
    public TopItem(){}
    private String size;
    private String fit;

    public TopItem(String itemName, int itemPrice, int itemQuantity, String size, String fit) {
        super(itemName, itemPrice, itemQuantity);
        this.size = size;
        this.fit = fit;
    }
    public String getSize() {
        return size;
    }
    public void setSize() {
        this.size = size;
    }
    public String getFit() {
        return fit;
    }
    public void setFit() {
        this.fit = fit;
    }
    @Override
    public String toString() {
        return "TopItem{" + "name=" + getItemName() +
                ", price=" + getItemPrice() +
                ", quantity=" + getItemQuantity() +
                ", size=" + size +
                ", type=" + fit + '}';
    }
}
