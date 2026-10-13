package praktika2.part3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = sc.nextInt();
        System.out.print("Введите месяц (1–12): ");
        int month = sc.nextInt();
        System.out.print("Введите день: ");
        int day = sc.nextInt();
        System.out.print("Введите часы: ");
        int hour = sc.nextInt();
        System.out.print("Введите минуты: ");
        int minute = sc.nextInt();

        // Создание через Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hour, minute, 0);
        cal.set(Calendar.MILLISECOND, 0);

        // Создание через Date (та же дата)
        Date date = cal.getTime();

        System.out.println("\nЧерез Calendar: " + cal.getTime());
        System.out.println("Через Date:     " + date);
        System.out.println("Год: " + cal.get(Calendar.YEAR)
                + ", Месяц: " + (cal.get(Calendar.MONTH) + 1)
                + ", День: " + cal.get(Calendar.DAY_OF_MONTH)
                + ", Время: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
    }
}