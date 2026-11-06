package praktika4.part2;

import java.util.Scanner;

public class ThrowsDemo {
    
    // Метод, который бросает исключение, если key == null
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    // Метод с циклом и try-catch 
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        // Цикл для повторного ввода
        while (!success) {
            System.out.print("Введите ключ (или 'null' для теста ошибки): ");
            String input = sc.nextLine();
            
            // Эмуляция null для проверки исключения
            String key = input.equals("null") ? null : input;

            try {
                String message = getDetails(key);
                System.out.println(message);
                success = true; // Если ошибки нет, выходим из цикла
            } catch (NullPointerException e) {
                System.out.println("Поймали исключение: " + e.getMessage());
                System.out.println("Попробуйте еще раз!\n"); // Даем второй шанс
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}