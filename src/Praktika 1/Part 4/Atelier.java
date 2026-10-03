package ru.mirea;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.S, 1500, "Красный"),
                new Pants(Size.M, 3000, "Черный"),
                new Skirt(Size.XS, 2000, "Синий"),
                new Tie(Size.L, 1000, "Серый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println("-------------------");
        atelier.dressMan(clothes);
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
                System.out.println(c);
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
                System.out.println(c);
            }
        }
    }
}