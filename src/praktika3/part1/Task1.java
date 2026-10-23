package praktika3.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Task1() {
        super("AC Milan vs Real Madrid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Создаем панель для кнопок
        JPanel buttonPanel = new JPanel();
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);

        // Создаем панель для текста
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Color.WHITE);

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        lastScorerLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        winnerLabel.setFont(new Font("Arial", Font.BOLD, 18));

        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        lastScorerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        winnerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        textPanel.add(Box.createVerticalStrut(20));
        textPanel.add(resultLabel);
        textPanel.add(Box.createVerticalStrut(15));
        textPanel.add(lastScorerLabel);
        textPanel.add(Box.createVerticalStrut(15));
        textPanel.add(winnerLabel);

        add(buttonPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        // Обработчик нажатия на кнопку Милана
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateScore("AC Milan");
            }
        });

        // Обработчик нажатия на кнопку Мадрида
        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateScore("Real Madrid");
            }
        });

        setVisible(true);
    }

    private void updateScore(String scorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + scorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Task1();
    }
}