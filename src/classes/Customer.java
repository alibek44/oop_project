package classes;

import java.util.Objects;

public class Customer {
    public Customer() {}

    public Customer(String cName, int cPhone) {
        this.cName = cName;
        this.cPhone = cPhone;
    }

    private String cName;
    private int cPhone;


    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public int getCPhone() {
        return cPhone;
    }

    public void setCPhone(int cPhone) {
        this.cPhone = cPhone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cName='" + cName + '\'' +
                ", cPhone=" + cPhone +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;
        Customer customer = (Customer) obj;
        return cPhone == customer.cPhone &&
                Objects.equals(cName, customer.cName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cName, cPhone);
    }
}