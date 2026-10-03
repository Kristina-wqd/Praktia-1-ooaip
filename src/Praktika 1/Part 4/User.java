package ru.mirea;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private List<Product> cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    public String getLogin() { return login; }
    public boolean checkPassword(String password) { return this.password.equals(password); }
    public List<Product> getCart() { return cart; }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println("Товар '" + product.getName() + "' добавлен в корзину.");
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста!");
            return;
        }
        double total = 0;
        System.out.println("Вы купили:");
        for (Product p : cart) {
            System.out.println("- " + p);
            total += p.getPrice();
        }
        System.out.println("Итого: " + total + " руб.");
        cart.clear();
    }
}