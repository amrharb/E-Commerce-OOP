public class ExpiredShipableProduct extends Product implements Shipable {
    boolean epxired;
    double weight;

    ExpiredShipableProduct(String name, double price, int quantity, boolean expired, double weight) {
        super(name, price, quantity);
        this.epxired = expired;
        this.weight = weight;
    }

    public void setExpired(boolean expired) {
        this.epxired = expired;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpired() {
        return epxired;
    }

    @Override
    public boolean isShipable() {
        return true;
    }
}
