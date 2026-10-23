package praktika3.part2;

public class Circle {
    double radius;
    static int numberOfObjects = 0;

    // Конструктор без аргументов
    public Circle() {
        radius = 1.0;
        numberOfObjects++;
    }

    // Конструктор с аргументом
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    // Статический метод 
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Метод экземпляра 
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Геттер для радиуса
    public double getRadius() {
        return radius;
    }
}