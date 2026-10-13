package praktika2.part4;

import java.util.GregorianCalendar;

public class Task5 {
    public static void main(String[] args) {
        // === Задача 1: текущий год, месяц, день ===
        GregorianCalendar now = new GregorianCalendar();
        int year = now.get(GregorianCalendar.YEAR);
        int month = now.get(GregorianCalendar.MONTH) + 1; // 0–11, поэтому +1
        int day = now.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("=== Текущая дата ===");
        System.out.println("Год:   " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День:  " + day);

        // === Задача 2: установка времени через setTimeInMillis ===
        GregorianCalendar custom = new GregorianCalendar();
        custom.setTimeInMillis(1234567898765L);

        int year2 = custom.get(GregorianCalendar.YEAR);
        int month2 = custom.get(GregorianCalendar.MONTH) + 1;
        int day2 = custom.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\n=== Дата для 1234567898765L мс ===");
        System.out.println("Год:   " + year2);
        System.out.println("Месяц: " + month2);
        System.out.println("День:  " + day2);
    }
}