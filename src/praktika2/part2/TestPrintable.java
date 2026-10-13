package praktika2.part2;

public class TestPrintable {
    public static void main(String[] args) {
        Printable[] items = new Printable[] {
            new Book("Война и мир", "Л. Н. Толстой", 1863),
            new Magazine("Хакер"),
            new Book("Отцы и дети", "И. Тургенев", 1862),
            new Magazine("Компьютерра"),
            new Book("Преступление и наказание", "Ф. Достоевский", 1866)
        };

        System.out.println("=== Все объекты ===");
        for (Printable p : items) {
            p.print();
        }

        System.out.println("\n=== Только книги ===");
        Book.printBooks(items);

        System.out.println("\n=== Только журналы ===");
        Magazine.printMagazines(items);
    }
}