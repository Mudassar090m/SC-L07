package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Lab Task 1: Black-Box Reuse (Composition via Interfaces) ===");

        // Same cart class, two different payment methods plugged in from outside.
        System.out.println("\n--- Cart paying by credit card ---");
        EcommerceCart cartA = new EcommerceCart(new CreditCardPayment("1234567890123456"));
        cartA.addItem("Keyboard", 4500.0);
        cartA.addItem("Mouse", 1500.0);
        cartA.checkout();

        System.out.println("\n--- Cart paying by JazzCash ---");
        EcommerceCart cartB = new EcommerceCart(new JazzCashPayment("03001234567"));
        cartB.addItem("USB Cable", 800.0);
        cartB.addItem("Phone Case", 1200.0);
        cartB.checkout();

        // A payment that fails: the cart reports failure without knowing why or which type it is.
        System.out.println("\n--- Cart with an invalid JazzCash number ---");
        EcommerceCart cartC = new EcommerceCart(new JazzCashPayment("12345"));
        cartC.addItem("Notebook", 300.0);
        cartC.checkout();

        // Proof of dynamic behaviour: one loop, one piece of cart code, many payment types.
        System.out.println("\n--- One loop, different payment methods chosen at runtime ---");
        List<PaymentMethod> methods = new ArrayList<>();
        methods.add(new CreditCardPayment("9999888877776666"));
        methods.add(new JazzCashPayment("03111234567"));
        for (PaymentMethod method : methods) {
            EcommerceCart cart = new EcommerceCart(method);
            cart.addItem("Headphones", 3000.0);
            cart.checkout();
        }
    }
}
