package praktika2.part1;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean checkSpeed() {
        return topLeft.getxSpeed() == bottomRight.getxSpeed()
                && topLeft.getySpeed() == bottomRight.getySpeed();
    }

    @Override public void moveUp() { if (checkSpeed()) { topLeft.moveUp(); bottomRight.moveUp(); } }
    @Override public void moveDown() { if (checkSpeed()) { topLeft.moveDown(); bottomRight.moveDown(); } }
    @Override public void moveLeft() { if (checkSpeed()) { topLeft.moveLeft(); bottomRight.moveLeft(); } }
    @Override public void moveRight() { if (checkSpeed()) { topLeft.moveRight(); bottomRight.moveRight(); } }

    @Override
    public String toString() {
        return "MovableRectangle(topLeft=" + topLeft + ", bottomRight=" + bottomRight + ")";
    }
}