package org.example.geometrics;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.moves.Movable;
import org.example.moves.MoveDirection;

@Data
@AllArgsConstructor
public class Point2D  implements Movable {
    private double x,y;

    @Override
    public void move(MoveDirection moveDirection) {

    }
}
