package praktika2.part1;

public class Animal implements Nameable {
    private String name;
    public Animal(String name) { this.name = name; }
    @Override public String getName() { return name; }
}