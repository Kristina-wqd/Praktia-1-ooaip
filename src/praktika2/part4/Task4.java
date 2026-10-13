package praktika2.part4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        // Создаём генератор с начальным значением 1000
        Random generator = new Random(1000);

        System.out.println("50 случайных чисел от 0 до 99 (seed = 1000):");
        System.out.println("==============================================");

        for (int i = 0; i < 50; i++) {
            int number = generator.nextInt(100);
            System.out.print(number + " ");

            // Переход на новую строку каждые 10 чисел
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}