package ru.mirea;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Сумма через цикл while
        int sumWhile = 0;
        int i = 0;
        while (i < size) {
            sumWhile += arr[i];
            i++;
        }
        System.out.println("Сумма (цикл while): " + sumWhile);

        // 2. Сумма через do-while + поиск max и min
        int sumDoWhile = 0;
        int max = arr[0];
        int min = arr[0];
        int j = 0;

        do {
            sumDoWhile += arr[j];
            if (arr[j] > max) max = arr[j];
            if (arr[j] < min) min = arr[j];
            j++;
        } while (j < size);

        System.out.println("Сумма (цикл do-while): " + sumDoWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        sc.close();
    }
}