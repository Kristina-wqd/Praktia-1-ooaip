package ru.mirea;

public class Task7 {
    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Факториал " + number + " = " + result);
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}