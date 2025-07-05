import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private double shippingCostforKg = 30;

    void checkout(Cart cart, Customer customer) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
        }
        double subtotal = 0;
        double total = 0;
        List<Pair<Shipable, Integer>> items = new ArrayList<>();
        for (CartItem item : cart.items) {
            if (item.getProduct().isExpired()) {
                System.out.println(item.getProduct().name + " is expired");
                return;
            }
            if (item.getProduct().getQuantity() < item.getQuantity()) {
                System.out.println(item.getProduct().name + "'s stock is too low");
                return;
            }
            subtotal += item.getProduct().getPrice() * item.getQuantity();
            if (item.getProduct().isShipable()) {
                items.add(new Pair(item.getProduct(), item.getQuantity()));
            }
        }
        ShippingService shippingService = new ShippingService();
        double itemsWeight = shippingService.shipWeight(items);
        double shippingFees = itemsWeight * shippingCostforKg;
        if (customer.getBalance() < subtotal + itemsWeight * shippingFees) {
            System.out.println("Not enough balance");
            return;
        }
        shippingService.shipNotice(items);
        System.out.println("Total package weight : " + itemsWeight + " Kg");
        System.out.println("- * Checkout receipt **\n");
        total = subtotal + shippingFees;
        System.out.println("Subtotal: $" + subtotal + "\nShipping Fees: $" + shippingFees + "\nAmount: $" + total);
        customer.setBalance(customer.getBalance() - total);
        System.out.println("Your Current Balance: $" + customer.getBalance());
    }
}