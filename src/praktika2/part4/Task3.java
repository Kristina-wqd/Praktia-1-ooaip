package praktika2.part4;

import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        // Массив значений прошедшего времени (в миллисекундах)
        long[] times = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 100000000000L};

        System.out.println("Даты для разных значений прошедшего времени:");
        System.out.println("============================================");

        for (long t : times) {
            Date date = new Date(t);
            System.out.println(t + " мс  ->  " + date.toString());
        }

        // Также продемонстрируем конструктор по умолчанию (текущее время)
        Date now = new Date();
        System.out.println("\nТекущее время:");
        System.out.println("Прошло с 01.01.1970: " + now.getTime() + " миллисекунд");
        System.out.println(now.toString());
    }
}