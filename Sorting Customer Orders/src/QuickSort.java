import java.util.*;


public class QuickSort {
    public static void quickSort(ArrayList<Order> orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Order> orders, int low, int high) {
        double pivot = orders.get(high).getTotalPrice();
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            if (orders.get(j).getTotalPrice() < pivot) {
                i++;
                Collections.swap(orders, i, j);
            }
        }

        Collections.swap(orders, i + 1, high);
        return i + 1;
    }
}
