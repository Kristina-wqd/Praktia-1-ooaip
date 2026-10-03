package ru.mirea;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(a1);

        a1.setEmail("new_email@somewhere.com");

        System.out.println("Имя: " + a1.getName());
        System.out.println("Пол: " + a1.getGender());
        System.out.println("Новый email: " + a1.getEmail());
        System.out.println("Обновленный объект: " + a1);
    }
}