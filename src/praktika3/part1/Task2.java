package praktika3.part1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс 
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод отрисовки
    public abstract void draw(Graphics g);
}

// Класс круга
class MyCircle extends Shape {
    private int radius;
    public MyCircle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

// Класс квадрата
class MySquare extends Shape {
    private int size;
    public MySquare(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }
}

public class Task2 extends JFrame {
    public Task2() {
        super("20 Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        // Добавляем панель с отрисовкой
        add(new ShapesPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}

// Панель для отрисовки
class ShapesPanel extends JPanel {
    private Shape[] shapes = new Shape[20];

    public ShapesPanel() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(500);
            int y = rand.nextInt(500);
            int size = rand.nextInt(50) + 20; // от 20 до 70

            // Случайно выбираем круг или квадрат
            if (rand.nextBoolean()) {
                shapes[i] = new MyCircle(c, x, y, size);
            } else {
                shapes[i] = new MySquare(c, x, y, size);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
}