public abstract class Product {
    String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract boolean isExpired();

    abstract boolean isShipable();

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
