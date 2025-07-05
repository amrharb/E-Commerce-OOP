public class Main {
    public static void main(String[] args) {
        Product cheese = new ExpiredShipableProduct("Cheese", 100, 5, false, 0.2);
        Product biscuits = new ExpiredShipableProduct("Biscuits", 150, 2, false, 0.7);
        Product scratchCard = new NonExpiredNorShipable("Mobile Scratch Card", 50, 10);
        Customer customer = new Customer("Amr", 1000);
        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);
        Checkout checkout = new Checkout();
        checkout.checkout(cart, customer);
    }
}
