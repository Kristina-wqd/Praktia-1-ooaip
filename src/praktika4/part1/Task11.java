package praktika4.part1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите числа (для выхода введите два нуля подряд):");
        int result = countOnes();
        System.out.println("Количество единиц: " + result);
    }

    public static int countOnes() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 0) {
            int next = sc.nextInt();
            if (next == 0) {
                return 0; // Нашли два нуля подряд, конец
            } else {
                return countOnes(); // Был один ноль, продолжаем
            }
        } else {
            if (n == 1) {
                return 1 + countOnes();
            } else {
                return countOnes();
            }
        }
    }
}