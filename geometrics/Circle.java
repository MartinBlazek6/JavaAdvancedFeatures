package geometrics;

import java.util.ArrayList;
import java.util.List;

public class Circle {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        double deltaX = center.getX() - point.getX();
        double deltaY = center.getY() - point.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints() {
        List<Point2D> slicePoints = new ArrayList<>();

        double angle = Math.atan2(point.getY() - center.getY(), point.getX() - center.getX());

        for (int i = 0; i < 4; i++) {
            double x = center.getX() + getRadius() * Math.cos(angle);
            double y = center.getY() + getRadius() * Math.sin(angle);
            slicePoints.add(new Point2D(x, y));
            angle += Math.PI / 2;
        }

        return slicePoints;
    }
}
