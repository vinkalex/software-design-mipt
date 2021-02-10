public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double a, double b) {
        length = a;
        width = b;
    }

    public double area() {
        return length * width;
    }
}
