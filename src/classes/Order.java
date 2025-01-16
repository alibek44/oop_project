package classes;

import java.util.Objects;

public class Order {
    public Order() {}

    public Order(int orderID, String orderStatus, String orderDate) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
    }

    private int orderID;
    private String orderStatus;
    private String orderDate;


    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order order = (Order) obj;
        return orderID == order.orderID &&
                Objects.equals(orderStatus, order.orderStatus) &&
                Objects.equals(orderDate, order.orderDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderID, orderStatus, orderDate);
    }
}