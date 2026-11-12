package task3.fixed;

import java.util.ArrayList;
import java.util.List;

public class FixedClient {

    public static void main(String[] args) {
        System.out.println("=== Lab Task 3 (after the fix): common Shape interface ===");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Square(5));

        // Client code depends only on Shape, and every Shape keeps its promise.
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.getArea());
        }

        // The old crash is now impossible: a Square cannot be treated as a Rectangle,
        // so this line would not even compile.
        // Rectangle r = new Square(5);

        Rectangle r = new Rectangle(1, 1);
        r.setDimensions(5, 10);
        System.out.println("Rectangle resized to 5 x 10, area = " + r.getArea());
        System.out.println("No crash: the architectural flaw is fixed.");
    }
}
