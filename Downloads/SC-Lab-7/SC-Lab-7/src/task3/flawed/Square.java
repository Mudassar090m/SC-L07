package task3.flawed;

/**
 * The flawed subclass. It forces width == height by throwing an exception.
 * That is a STRONGER precondition than Rectangle has, which breaks the
 * Liskov Substitution Principle.
 */
public class Square extends Rectangle {

    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("Square requires equal sides, got w=" + w + " and h=" + h);
        }
        super.setDimensions(w, h);
    }
}
