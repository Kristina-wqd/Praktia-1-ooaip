package ru.mirea;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() { System.out.println("Одеваем мужчину в штаны."); }
    @Override
    public void dressWomen() { System.out.println("Одеваем женщину в штаны."); }
    @Override
    public String toString() { return "Штаны -> " + super.toString(); }
}