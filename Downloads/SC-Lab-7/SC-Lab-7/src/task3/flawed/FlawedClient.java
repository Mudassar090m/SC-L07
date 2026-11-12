package task3.flawed;

/** Client code written against Rectangle. It should work for ANY Rectangle. */
public class FlawedClient {

    // This method trusts the Rectangle contract: "setDimensions accepts any w and h".
    static void resizeAndPrint(Rectangle r) {
        r.setDimensions(5, 10);
        System.out.println("Area after resizing to 5 x 10 = " + r.getArea());
    }

    public static void main(String[] args) {
        System.out.println("=== Lab Task 3 (before the fix): LSP violation ===");

        System.out.println("\nPassing a real Rectangle:");
        resizeAndPrint(new Rectangle());

        System.out.println("\nPassing a Square as a Rectangle:");
        try {
            resizeAndPrint(new Square());
        } catch (IllegalArgumentException e) {
            System.out.println("SYSTEM CRASH: " + e);
            System.out.println("A Square could not stand in for a Rectangle, so substitution is broken.");
        }
    }
}
