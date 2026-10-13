package praktika2.part3;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату (дд.мм.гггг): ");
        String input = sc.nextLine();

        Date userDate = sdf.parse(input);
        Date now = new Date();

        System.out.println("Текущая дата:  " + sdf.format(now));
        System.out.println("Ваша дата:     " + sdf.format(userDate));

        int cmp = userDate.compareTo(now);
        if (cmp < 0) {
            System.out.println("Ваша дата РАНЬШЕ текущей.");
        } else if (cmp > 0) {
            System.out.println("Ваша дата ПОЗЖЕ текущей.");
        } else {
            System.out.println("Даты совпадают.");
        }
    }
}