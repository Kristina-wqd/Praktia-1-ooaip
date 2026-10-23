package praktika3.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task4 extends JFrame {
    public Task4() {
        super("Animation Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        add(new AnimationPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task4();
    }
}

class AnimationPanel extends JPanel implements ActionListener {
    private Timer timer;
    private int frame = 0; // номер текущего кадра

    public AnimationPanel() {
        // Таймер обновляет экран каждые 100 мс
        timer = new Timer(100, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Отрисовка "кадров"
        g.setColor(Color.BLACK);
        g.drawString("Кадр анимации: " + frame, 20, 30);

        // Имитация анимации: двигаем шарик
        int x = (frame * 10) % getWidth();
        g.setColor(Color.RED);
        g.fillOval(x, 150, 50, 50);

        // В работе вместо отрисовки здесь бы менялась картинка:
        // ImageIcon icon = new ImageIcon("frame_" + frame + ".png");
        // g.drawImage(icon.getImage(), 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame++; // Переход к следующему кадру
        if (frame > 50) {
            frame = 0;
        }
        repaint(); // Перерисовать панель
    }
}