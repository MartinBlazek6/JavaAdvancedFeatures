package geometrics;

import lombok.AllArgsConstructor;
import lombok.Data;
import moves.Movable;
import moves.MoveDirection;

public class Point2D  implements Movable {
    private double x,y;

    @Override
    public void move(MoveDirection moveDirection) {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
