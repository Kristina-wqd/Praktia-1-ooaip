package praktika2.part1;

public class Shop implements Printable {
    private String name;
    private String address;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override public void print() {
        System.out.println("Магазин: \"" + name + "\", адрес: " + address);
    }
}