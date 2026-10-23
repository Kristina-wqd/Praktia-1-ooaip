package praktika3.part1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Task3 extends JFrame {
    private String imagePath;

    public Task3(String imagePath) {
        super("Task 3 - Просмотр картинки");
        this.imagePath = imagePath;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        add(new ImagePanel());
        setVisible(true);
    }

    class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Если аргумент не передан
            if (imagePath == null || imagePath.isEmpty()) {
                g.drawString("Ошибка: Путь к картинке не передан!", 50, 50);
                return;
            }

            File f = new File(imagePath);
            // Если файл не найден
            if (!f.exists()) {
                g.drawString("Ошибка: Файл не найден по пути: " + imagePath, 50, 50);
                return;
            }

            // Загружаем и рисуем картинку
            Image img = new ImageIcon(imagePath).getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        // Берем первый аргумент (путь к картинке), если он есть
        String path = (args.length > 0) ? args[0] : "";
        System.out.println("Программа получила путь: " + path);
        new Task3(path);
    }
}