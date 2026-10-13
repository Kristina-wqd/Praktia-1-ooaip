package praktika2.part2;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'%n", name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                System.out.println("Журнал: " + ((Magazine) p).getName());
            }
        }
    }
}