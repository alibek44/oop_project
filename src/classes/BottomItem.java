package classes;

public class BottomItem extends Item {
    public BottomItem() {}

    public BottomItem(String itemName, int itemPrice, int itemQuantity, String material, String fitment, int waistSize) {
        super(itemName, itemPrice, itemQuantity);
        this.material = material;
        this.fitment = fitment;
        this.waistSize = waistSize;
    }

    private String material;
    private String fitment;
    private int waistSize;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(){
        this.material = material;
    }
    public String getFitment(){
        return fitment;
    }
    public void setFitment(){
        this.fitment = fitment;
    }
    public int getSize(){
        return waistSize;
    }
    public void setSize(){
        this.waistSize = waistSize;
    }
    @Override
    public String toString(){
        return "BottomItem{" + "name="+ getItemName() +
                ", price="+ getItemPrice() +
                ", quantity="+ getItemQuantity() +
                ", material=" + material +
                ", fitment=" + fitment +
                ", size=" + waistSize +'}';
    }

}
