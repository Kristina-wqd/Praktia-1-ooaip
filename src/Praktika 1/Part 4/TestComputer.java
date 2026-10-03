package ru.mirea;

public class TestComputer {
    public static void main(String[] args) {
        Processor cpu = new Processor("Intel Core i7", 8, 3.6);
        Memory ram = new Memory(16, "DDR4");
        Monitor screen = new Monitor(27.0, "2560x1440");

        Computer myPC = new Computer(ComputerBrand.ASUS, cpu, ram, screen);
        System.out.println(myPC);
    }
}