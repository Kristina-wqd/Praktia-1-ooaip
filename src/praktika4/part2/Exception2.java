package praktika4.part2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Вы ввели не целое число!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        } catch (Exception e) {
            System.out.println("Какая-то другая ошибка...");
        } finally {
            System.out.println("Блок finally выполнен.");
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo();
    }
}