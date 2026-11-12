package task3.fixed;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setDimensions(width, height);
    }

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
