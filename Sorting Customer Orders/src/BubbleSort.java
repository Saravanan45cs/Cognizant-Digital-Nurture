import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public static void bubbleSort(ArrayList<Order> orders) {
        int n = orders.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders.get(j).getTotalPrice() > orders.get(j + 1).getTotalPrice()) {
                    // Swap orders[j] and orders[j + 1]
                    Collections.swap(orders, j, j + 1);
                }
            }
        }
    }
}
