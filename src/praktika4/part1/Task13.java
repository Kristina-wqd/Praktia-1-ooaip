package praktika4.part1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите числа (0 для завершения):");
        printOddIndices();
    }

    public static void printOddIndices() {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n == 0) return;
        System.out.println(n); // Выводим 1-е, 3-е, 5-е...
        
        int skip = sc.nextInt();
        if (skip == 0) return; // Пропускаем 2-е, 4-е...
        
        printOddIndices();
    }
}