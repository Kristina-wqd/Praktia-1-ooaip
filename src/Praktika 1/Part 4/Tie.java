package ru.mirea;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() { System.out.println("Одеваем мужчину в галстук."); }
    @Override
    public String toString() { return "Галстук -> " + super.toString(); }
}