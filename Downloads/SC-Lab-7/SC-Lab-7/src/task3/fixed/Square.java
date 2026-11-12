package task3.fixed;

/**
 * Square no longer extends Rectangle. It has its own single "side" value,
 * so there is no way to give it two different dimensions.
 */
public class Square implements Shape {

    private int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
