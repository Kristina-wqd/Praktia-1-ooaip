package praktika2.part2;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle r = new MovableRectangle(0, 0, 50, 50, 5, 5);
        System.out.println(r);
        System.out.println("Скорости одинаковые? " + r.SpeedTest());

        r.moveRight();
        r.moveDown();
        System.out.println("После движения: " + r);
    }
}