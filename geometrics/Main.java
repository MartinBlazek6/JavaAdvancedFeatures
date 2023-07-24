package geometrics;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(0, 0);
        Point2D pointOnCircle = new Point2D(3, 0);
        Circle circle = new Circle(center, pointOnCircle);

        System.out.println("Before Resizing:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        circle.resize(1.5);

        System.out.println("After Resizing:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
