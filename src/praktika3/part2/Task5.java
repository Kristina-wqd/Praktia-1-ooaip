package praktika3.part2;

public class Task5 {
    public static void main(String[] args) {
        // Создаем массив из 5 кругов
        Circle[] circles = new Circle[5];
        
        // Заполняем случайными радиусами 
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 100);
        }

        System.out.println("Все круги:");
        Circle maxCircle = circles[0]; // берем первый как "максимальный"
        
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Круг %d: радиус = %.2f, площадь = %.2f\n", 
                    i + 1, circles[i].getRadius(), circles[i].getArea());
            
            // Сравниваем площади
            if (circles[i].getArea() > maxCircle.getArea()) {
                maxCircle = circles[i];
            }
        }
        
        System.out.println("\nКруг с максимальной площадью:");
        System.out.printf("Радиус = %.2f, Площадь = %.2f\n", maxCircle.getRadius(), maxCircle.getArea());
    }
}