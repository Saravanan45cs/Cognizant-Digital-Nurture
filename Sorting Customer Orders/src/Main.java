import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("O001", "Alice", 250.00));
        orders.add(new Order("O002", "Bob", 150.00));
        orders.add(new Order("O003", "Charlie", 350.00));
        orders.add(new Order("O004", "David", 200.00));

        // Sort using Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Orders sorted using Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Sort using Quick Sort
        QuickSort.quickSort(orders, 0, orders.size() - 1);
        System.out.println("\nOrders sorted using Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
