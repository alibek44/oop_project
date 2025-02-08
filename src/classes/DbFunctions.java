package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String password) {
        Connection conn=null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection( "jdbc:postgresql://localhost:5432/"+dbname, user, password);
            if (conn != null) {
                System.out.println("Connection is successful");
            }
            else {
                System.out.println("Connection failed");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
    public void create_table(Connection conn, String table_name) {
        Statement stmt;
        try{
            String query = "CREATE TABLE "+table_name+"(customer_ID SERIAL, name varchar(50), phone_number int, order_ID int, primary key(customer_ID), FOREIGN KEY (order_ID) REFERENCES orders(order_ID))";
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void insert_data(Connection conn, String table_name, String name, int phone_number, int order_ID) {
        Statement statement;
        try {
            String query = String.format("insert into %s(name, phone_number, order_ID) values('%s','%s','%s');", table_name, name, phone_number, order_ID);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert_data_orders(Connection conn, String table_name, String order_status, String order_date, int item_ID) {
        Statement statement;
        try{
            String query = String.format("insert into %s(order_status, order_date, item_ID) values('%s', '%s', '%s');", table_name, order_status, order_date, item_ID);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert_data_items(Connection conn, String table_name, String name, int price, int quantity) {
        Statement statement;
        try{
            String query = String.format("insert into %s(name, price, quantity) values('%s','%s','%s');", table_name, name, price, quantity);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void read_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s",table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            System.out.println("Customers table:");
            while (rs.next()) {
                System.out.print(rs.getString("customer_ID")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getString("phone_number")+" ");
                System.out.println(rs.getString("order_ID")+" ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void read_data_orders(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s",table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            System.out.println("Orders Table:");
            while (rs.next()) {
                System.out.print(rs.getString("order_ID")+" ");
                System.out.print(rs.getString("order_status")+" ");
                System.out.println(rs.getString("order_date")+" ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void read_data_items(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s",table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            System.out.println("Items Table:");
            while (rs.next()) {
                System.out.print(rs.getString("item_ID")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getString("price")+" ");
                System.out.println(rs.getString("quantity")+" ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void update_name(Connection conn, String table_name, String old_name, String new_name) {
        Statement statement;
        try{
            String query = String.format("update %s set = '%s' where name = '%s';", table_name, new_name, old_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void delete_row(Connection conn, String table_name, String name) {
        Statement statement;
        try{
            String query = String.format("delete from %s where name = '%s'", table_name, name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void drop_table(Connection conn, String table_name) {
        Statement statement;
        try{
            String query = String.format("DROP TABLE IF EXISTS %s", table_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Tables deleted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
