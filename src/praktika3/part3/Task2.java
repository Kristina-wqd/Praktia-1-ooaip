package praktika3.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame {
    private JComboBox<String> countryCombo;
    private JTextArea infoArea;

    public Task2() {
        super("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(350, 200);

        String[] countries = {"Australia", "China", "England", "Russia"};
        countryCombo = new JComboBox<>(countries);
        infoArea = new JTextArea(3, 25);
        infoArea.setEditable(false);

        add(countryCombo);
        add(infoArea);

        // Обработчик выбора в ComboBox
        countryCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) countryCombo.getSelectedItem();
                if (selected.equals("Australia")) {
                    infoArea.setText("Столица: Канберра\nКонтинент: Австралия");
                } else if (selected.equals("China")) {
                    infoArea.setText("Столица: Пекин\nКонтинент: Азия");
                } else if (selected.equals("England")) {
                    infoArea.setText("Столица: Лондон\nКонтинент: Европа");
                } else if (selected.equals("Russia")) {
                    infoArea.setText("Столица: Москва\nКонтинент: Евразия");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}