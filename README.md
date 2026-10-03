# E-Commerce-OOP

A small Java exercise in object-oriented design: a product catalogue, a shopping cart, checkout and a shipping service, modelled with an abstract base class, interfaces and inheritance.

## Domain

- `Product`: abstract base class with name, price and quantity, plus `isExpired()` and `isShipable()`
- `ExpiredShipableProduct`, `NonExpiredNorShipable`: concrete products that are expirable and/or shippable
- `Shipable`: interface (`getName()`, `getWeight()`) implemented by anything the `ShippingService` can ship
- `Customer`, `Cart`, `CartItem`: a customer with a balance and the items they add
- `Checkout`: validates the cart (empty cart, expired product, low stock, insufficient balance), computes subtotal and shipping, and prints the receipt
- `ShippingService`: collects the shippable items and prints the shipment notice

## Run

```bash
javac *.java
java Main
```

`Main` builds a few products, fills a cart and runs one checkout; change the quantities or balance in `Main` to hit the error paths in `Checkout`.
