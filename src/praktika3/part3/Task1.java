package praktika3.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private JTextField num1 = new JTextField(10);
    private JTextField num2 = new JTextField(10);
    private JLabel resultLabel = new JLabel("Результат: ");

    public Task1() {
        super("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 200);

        // Поля ввода
        add(new JLabel("Число 1:"));
        add(num1);
        add(new JLabel("Число 2:"));
        add(num2);

        // Кнопки операций
        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(resultLabel);

        // Обработчики событий (анонимные классы)
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });

        setVisible(true);
    }

    private void calculate(char operation) {
        try {
            double n1 = Double.parseDouble(num1.getText().trim());
            double n2 = Double.parseDouble(num2.getText().trim());
            double result = 0;

            if (operation == '+') result = n1 + n2;
            else if (operation == '-') result = n1 - n2;
            else if (operation == '*') result = n1 * n2;
            else if (operation == '/') result = n1 / n2;

            resultLabel.setText("Результат: " + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ошибка ввода! Введите числа.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Task1();
    }
}