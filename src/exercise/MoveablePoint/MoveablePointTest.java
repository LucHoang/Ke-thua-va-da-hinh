package exercise.MoveablePoint;

import exercise.Point2DAnd3D.Point3D;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2,4);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2,6,8,9);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
