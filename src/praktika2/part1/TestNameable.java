package praktika2.part1;

public class TestNameable {
    public static void main(String[] args) {
        Nameable p = new Planet("Земля");
        Nameable c = new Car("Toyota");
        Nameable a = new Animal("Барсик");

        System.out.println("Планета: " + p.getName());
        System.out.println("Машина: " + c.getName());
        System.out.println("Животное: " + a.getName());
    }
}