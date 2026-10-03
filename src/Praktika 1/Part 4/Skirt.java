package ru.mirea;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressWomen() { System.out.println("Одеваем женщину в юбку."); }
    @Override
    public String toString() { return "Юбка -> " + super.toString(); }
}