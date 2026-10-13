package praktika2.part1;

public class TestPrintable {
    public static void main(String[] args) {
        Printable[] items = new Printable[4];
        items[0] = new Book("Война и мир", "Л. Толстой");
        items[1] = new Shop("Пятёрочка", "ул. Ленина, 5");
        items[2] = new Book("Преступление и наказание", "Ф. Достоевский");
        items[3] = new Shop("Магнит", "пр. Мира, 12");

        for (Printable item : items) {
            item.print();
        }
    }
}