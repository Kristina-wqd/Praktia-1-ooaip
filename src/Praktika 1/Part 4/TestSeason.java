package ru.mirea;

public class TestSeason {
    public static void main(String[] args) {

        Season favoriteSeason = Season.SUMMER;

        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAverageTemperature() + "°C, " + season.getDescription());
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}