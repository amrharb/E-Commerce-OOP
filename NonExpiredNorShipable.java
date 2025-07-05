public class NonExpiredNorShipable extends Product {

    NonExpiredNorShipable(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isExpired() {
        return false;
    }
    @Override
    public boolean isShipable() {
        return false;
    }
}
