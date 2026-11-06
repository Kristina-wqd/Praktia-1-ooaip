package praktika4.part1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число без нулей: ");
        int n = sc.nextInt();
        System.out.println("Развернутое число: " + reverse(n, 0));
        sc.close();
    }

    // Рекурсивный метод разворота
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }
}