# E-Commerce-OOP

A small Java exercise in object-oriented design: a product catalogue, a shopping cart, checkout and a shipping service, modelled with interfaces and inheritance.

## Domain

- `Product`: base class with name, price and quantity
- `ExpiredShipableProduct`, `NonExpiredNorShipable`: product variants that are expirable and/or shippable
- `Shipable`: interface (`getName()`, `getWeight()`) implemented by anything the `ShippingService` can ship
- `Customer`, `Cart`, `CartItem`: a customer with a balance and the items they add
- `Checkout`: validates the cart (stock, expiry, balance), computes subtotal and shipping, and prints the receipt
- `ShippingService`: collects the shippable items and prints the shipment notice

## Run

```bash
javac *.java
java Main
```

`Main` builds a few products, fills a cart and runs checkout, including the error cases (empty cart, expired product, insufficient balance).
