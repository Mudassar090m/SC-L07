package task1;

/**
 * The contract every payment option must follow.
 * EcommerceCart only ever talks to this interface (black-box reuse).
 */
public interface PaymentMethod {
    boolean pay(double amount);
}
