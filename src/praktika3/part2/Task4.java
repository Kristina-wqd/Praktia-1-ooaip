package praktika3.part2;

import java.util.Date;

public class Task4 {
    /*
     * Ошибка в исходном коде:
     * При создании массива объектов Date[] dates = new Date[10];
     * все элементы массива по умолчанию равны null.
     * Вызов dates[0].toString() вызывал NullPointerException.
     */
    public static void main(String[] args) {
        Date[] dates = new Date[10];
        
        dates[0] = new Date();
        
        System.out.println(dates[0]); 
        System.out.println(dates[0].toString());
    }
}