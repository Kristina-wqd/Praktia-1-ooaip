package praktika3.part3;

import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {
    public Task3() {
        super("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // 1. Создаем строку меню
        JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0)); // Закрытие
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Paste"));

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // 2. Создаем панель с двумя кнопками (GridLayout)
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1, 10, 10)); // 2 строки, 1 столбец

        JTextField textField = new JTextField("Текстовое поле");
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        centerPanel.add(textField);
        
        JPanel btnPanel = new JPanel(new FlowLayout());
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        centerPanel.add(btnPanel);

        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}