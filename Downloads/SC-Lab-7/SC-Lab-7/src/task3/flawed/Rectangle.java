package task3.flawed;

/** The given base class. Its contract: any width and height are accepted. */
public class Rectangle {

    protected int width;
    protected int height;

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getArea() {
        return width * height;
    }
}
