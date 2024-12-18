package Classes;

public class Order {
    int orderID;
    String orderStatus;
    String orderDate;

    public int getOrderID(){
        return orderID;
    }
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public String getOrderStatus(){
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }
    public String getOrderDate(){
        return orderDate;
    }
    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }

}
