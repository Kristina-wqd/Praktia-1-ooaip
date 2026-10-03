package ru.mirea;

public abstract class Clothes {
    Size size;
    double cost;
    String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Размер: " + size + " (" + size.getDescription() + "), Цена: " + cost + ", Цвет: " + color;
    }
}