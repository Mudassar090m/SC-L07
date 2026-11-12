package task1;

public class CreditCardPayment implements PaymentMethod {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Credit card: invalid amount " + amount);
            return false;
        }
        if (cardNumber == null || cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            System.out.println("Credit card: card declined, number must be 16 digits.");
            return false;
        }
        String lastFour = cardNumber.substring(12);
        System.out.println("Credit card: paid PKR " + amount + " using card ending " + lastFour);
        return true;
    }
}
