package praktika4.part1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите числа (0 для завершения):");
        printOdds();
    }

    public static void printOdds() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 0) return;
        
        if (n % 2 != 0) {
            System.out.println(n); // Печатаем только нечетные
        }
        
        printOdds(); // Вызываем себя снова
    }
}