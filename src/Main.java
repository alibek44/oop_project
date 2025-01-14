import classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Items
        List<BottomItem> bottomItems = new ArrayList<>();
        bottomItems.add(new BottomItem("Jeans", 49000, 5,"Raw jeans", "strait", 40));
        bottomItems.add(new BottomItem("Shorts", 22000, 3, "linen", "regular", 44));
        bottomItems.add(new BottomItem("Trousers", 99000, 2, "cotton", "relaxed", 40));

        List<TopItem> topItems = new ArrayList<>();
        topItems.add(new TopItem("T-Shirt", 22000, 9, "M", "loose"));
        topItems.add(new TopItem("Sweater", 30000, 5, "L", "regular"));
        topItems.add(new TopItem("Cardigan", 79000, 1, "XL", "regular"));

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
        List<BottomItem> sortedBottom = bottomItems.stream()
                .sorted((i1, i2) -> Integer.compare(i1.getItemPrice(), i2.getItemPrice()))
                .collect(Collectors.toList());
        System.out.println("\nSorted Bottom Items by Price:");
        sortedBottom.forEach(System.out::println);

        List<TopItem> sortedTop = topItems.stream()
                .sorted((i1,i2) ->Integer.compare(i1.getItemPrice(), i2.getItemPrice()))
                .collect(Collectors.toList());
        System.out.println("\nSorted Top Items by Price:");
        sortedTop.forEach(System.out::println);


        // Filter items with quantity > 2
        List<BottomItem> filteredBottom = bottomItems.stream()
                .filter(item -> item.getItemQuantity() > 2)
                .collect(Collectors.toList());
        System.out.println("\nFiltered Bottom Items (Quantity > 2):");
        filteredBottom.forEach(System.out::println);

        List<TopItem> filteredTop = topItems.stream()
                .filter(item -> item.getItemQuantity() > 2)
                .collect(Collectors.toList());
        System.out.println("\nFiltered Top Items (Quantity > 2):");
        filteredTop.forEach(System.out::println);

        // Search for an item by name
        String searchName = "Jeans";
        List<BottomItem> searchResult = bottomItems.stream()
                .filter(item -> item.getItemName().equalsIgnoreCase(searchName))
                .collect(Collectors.toList());
        System.out.println("\nSearch Result for '" + searchName + "':");
        searchResult.forEach(System.out::println);

        String searchName2 = "T-Shirt";
        List<TopItem> searchResult2 = topItems.stream()
                .filter(item -> item.getItemName().equalsIgnoreCase(searchName2))
                .collect(Collectors.toList());
        System.out.println("\nSearch Result for '" + searchName2 + "':");
        searchResult2.forEach(System.out::println);
    }
}