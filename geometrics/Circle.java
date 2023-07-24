package geometrics;

import moves.Movable;
import moves.MoveDirection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Circle implements Movable,Resizable {
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

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.move(moveDirection);
        this.point.move(moveDirection);

        System.out.println("New Radius: " + getRadius());
        System.out.println("New Perimeter: " + getPerimeter());
        System.out.println("New Area: " + getArea());
        List<Point2D> slicePoints = getSlicePoints();
        System.out.println("New Slice points:");
        slicePoints.forEach(point ->  System.out.println("x: " + point.getX() + ", y: " + point.getY()));
    }

    @Override
    public void resize(double resizeFactor) {
        double newRadius = getRadius() * resizeFactor;

        double deltaX = point.getX() - center.getX();
        double deltaY = point.getY() - center.getY();
        double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        double newX = center.getX() + (deltaX / length) * newRadius;
        double newY = center.getY() + (deltaY / length) * newRadius;

        point.setX(newX);
        point.setY(newY);

        List<Point2D> slicePoints = getSlicePoints();
        slicePoints.forEach(point -> System.out.println("x: " + point.getX() + ", y: " + point.getY()));
    }
}
