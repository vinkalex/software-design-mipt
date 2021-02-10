public class Circle {
    private double radius;

    public Circle() {}

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
