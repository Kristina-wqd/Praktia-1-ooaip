package ru.mirea;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Product> products;

    public Catalog(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Product> getProducts() { return products; }

    public void addProduct(Product product) {
        products.add(product);
    }
}