package task1;

public class JazzCashPayment implements PaymentMethod {

    private final String mobileNumber;

    public JazzCashPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("JazzCash: invalid amount " + amount);
            return false;
        }
        if (mobileNumber == null || mobileNumber.length() != 11 || !mobileNumber.startsWith("03")) {
            System.out.println("JazzCash: failed, mobile number must be 11 digits starting with 03.");
            return false;
        }
        System.out.println("JazzCash: paid PKR " + amount + " from account " + mobileNumber);
        return true;
    }
}
