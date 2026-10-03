package ru.mirea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<User> users = new ArrayList<>();
        users.add(new User("admin", "1234"));
        users.add(new User("user", "0000"));


        List<Catalog> catalogs = new ArrayList<>();
        Catalog electronics = new Catalog("Электроника");
        electronics.addProduct(new Product("Смартфон", 50000));
        electronics.addProduct(new Product("Ноутбук", 80000));

        Catalog clothes = new Catalog("Одежда");
        clothes.addProduct(new Product("Футболка", 2000));
        clothes.addProduct(new Product("Джинсы", 5000));

        catalogs.add(electronics);
        catalogs.add(clothes);

        System.out.println("=== Вход в магазин ===");
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        User currentUser = null;
        for (User u : users) {
            if (u.getLogin().equals(login) && u.checkPassword(password)) {
                currentUser = u;
                break;
            }
        }

        if (currentUser == null) {
            System.out.println("Неверный логин или пароль!");
            return;
        }
        System.out.println("Добро пожаловать, " + currentUser.getLogin() + "!");

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Просмотр каталогов");
            System.out.println("2. Просмотр товаров в каталоге");
            System.out.println("3. Корзина (купить)");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Доступные каталоги:");
                    for (int i = 0; i < catalogs.size(); i++) {
                        System.out.println((i + 1) + ". " + catalogs.get(i).getName());
                    }
                    break;
                case 2:
                    System.out.print("Введите номер каталога: ");
                    int catIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (catIndex >= 0 && catIndex < catalogs.size()) {
                        Catalog cat = catalogs.get(catIndex);
                        System.out.println("Товары в каталоге '" + cat.getName() + "':");
                        List<Product> prods = cat.getProducts();
                        for (int i = 0; i < prods.size(); i++) {
                            System.out.println((i + 1) + ". " + prods.get(i));
                        }
                        System.out.print("Введите номер товара для добавления в корзину (0 - отмена): ");
                        int prodIndex = scanner.nextInt() - 1;
                        scanner.nextLine();
                        if (prodIndex >= 0 && prodIndex < prods.size()) {
                            currentUser.addToCart(prods.get(prodIndex));
                        }
                    } else {
                        System.out.println("Неверный номер каталога.");
                    }
                    break;
                case 3:
                    currentUser.checkout();
                    break;
                case 4:
                    System.out.println("Выход из магазина. До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}