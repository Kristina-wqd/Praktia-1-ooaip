package praktika2.part1;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable bread = new Product("Хлеб", 45.50);
        Priceable milk = new Product("Молоко", 89.90);
        Priceable cheese = new Product("Сыр", 320.00);

        System.out.println("Хлеб: " + bread.getPrice() + " руб.");
        System.out.println("Молоко: " + milk.getPrice() + " руб.");
        System.out.println("Сыр: " + cheese.getPrice() + " руб.");
    }
}