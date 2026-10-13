package praktika2.part3;

import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        Date bd = new Date(106, 4, 31); // 2006-05-31
        Student s = new Student("Ильясова Кристина", bd);

        System.out.println("toString():     " + s);
        System.out.println("Короткий формат: " + s.getBirthDate("dd.MM.yy"));
        System.out.println("Средний формат:  " + s.getBirthDate("dd MMM yyyy"));
        System.out.println("Полный формат:   " + s.getBirthDate("EEEE, dd MMMM yyyy"));
    }
}