package praktika2.part2;

public class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() { return name; }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году%n", name, author, year);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book) {
                System.out.println("Книга: " + ((Book) p).getName());
            }
        }
    }
}