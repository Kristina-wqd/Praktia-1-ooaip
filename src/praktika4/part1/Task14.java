package praktika4.part1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        printLeft(n);
        System.out.println();
        sc.close();
    }

    public static void printLeft(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        printLeft(n / 10); // Идем вглубь до первой цифры
        System.out.print(n % 10 + " "); // Печатаем на обратном пути
    }
}