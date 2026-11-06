package praktika4.part1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        
        System.out.print("Цифры справа налево: ");
        printRight(n);
        System.out.println();
        
        sc.close();
    }

    // Рекурсивный метод для вывода цифр справа налево
    public static void printRight(int n) {
        // Базовый случай: если число закончилось, останавливаемся
        if (n == 0) {
            return;
        }
        
        // Шаг рекурсии: 
        // 1. Сначала берем последнюю цифру (n % 10) и печатаем её
        System.out.print(n % 10 + " ");
        
        // 2. Затем отсекаем её (n / 10) и вызываем метод снова
        printRight(n / 10);
    }
}