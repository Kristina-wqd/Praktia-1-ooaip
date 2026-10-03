package ru.mirea;

public class TestMovable {
    public static void main(String[] args) {
        // Тестируем MovablePoint
        MovablePoint p = new MovablePoint(1, 1, 2, 3);
        System.out.println("До: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("После: " + p);

        // Тестируем MovableCircle
        MovableCircle c = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("\nДо: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("После: " + c);

        // Тестируем MovableRectangle
        MovableRectangle r = new MovableRectangle(0, 0, 10, 10, 2, 2);
        System.out.println("\nДо: " + r);
        r.moveUp();
        r.moveRight();
        System.out.println("После: " + r);
    }
}