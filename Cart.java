import java.util.*;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    void add(Product product, int quantity) {
        if (product.getQuantity() < quantity) {
            System.out.println("Not enough quantity");
            return;
        }
        items.add(new CartItem(product, quantity));
    }

    boolean isEmpty() {
        return items.isEmpty();
    }
}
