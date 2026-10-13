package praktika2.part3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {
        String surname = "Ильясова Кристина";

        // Дата получения задания (например, 1 октября 2026)
        Date received = new Date(126, 9, 1); // 126 = 2026 год, 9 = октябрь (месяцы 0–11)

        // Дата сдачи — текущая
        Date submitted = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + surname);
        System.out.println("Получено: " + sdf.format(received));
        System.out.println("Сдано:    " + sdf.format(submitted));
    }
}