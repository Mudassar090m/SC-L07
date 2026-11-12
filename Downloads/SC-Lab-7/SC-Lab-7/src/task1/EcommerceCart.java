package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * A shopping cart that is given its payment method from outside
 * (dependency injection through the constructor).
 *
 * Notice: this class never mentions CreditCardPayment or JazzCashPayment.
 * It only knows the PaymentMethod interface, so any new payment type
 * can be used without changing this class.
 */
public class EcommerceCart {

    private static class Item {
        private final String name;
        private final double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    private final PaymentMethod paymentMethod;
    private final List<Item> items = new ArrayList<>();

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }

    public boolean checkout() {
        double total = getTotal();
        System.out.println("Checking out " + items.size() + " item(s), total PKR " + total);
        boolean success = paymentMethod.pay(total);
        System.out.println(success ? "Order confirmed." : "Order failed: payment was not completed.");
        return success;
    }
}
