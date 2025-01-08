import classes.Item;
import classes.Customer;
import classes.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Items
        List<Item> items = new ArrayList<>();
        items.add(new Item("Hoodie", 20000, 5));
        items.add(new Item("T-Shirt", 15000, 3));
        items.add(new Item("Jeans", 40000, 2));

        // Customer
        Customer customer = new Customer("Alfredo", 87007246);

        // Orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Shipping", "23.01.2025"));
        orders.add(new Order(2, "Delivered", "20.01.2025"));

        // Display customer information
        System.out.println(customer);

        // Display all orders
        orders.forEach(System.out::println);

        // Sorting items by price
        List<Item> sortedItems = items.stream()
                .sorted((i1, i2) -> Integer.compare(i1.getItemPrice(), i2.getItemPrice()))
                .collect(Collectors.toList());
        System.out.println("\nSorted Items by Price:");
        sortedItems.forEach(System.out::println);

        // Filter items with quantity > 2
        List<Item> filteredItems = items.stream()
                .filter(item -> item.getItemQuantity() > 2)
                .collect(Collectors.toList());
        System.out.println("\nFiltered Items (Quantity > 2):");
        filteredItems.forEach(System.out::println);

        // Search for an item by name
        String searchName = "Jeans";
        List<Item> searchResult = items.stream()
                .filter(item -> item.getItemName().equalsIgnoreCase(searchName))
                .collect(Collectors.toList());
        System.out.println("\nSearch Result for '" + searchName + "':");
        searchResult.forEach(System.out::println);
    }
}