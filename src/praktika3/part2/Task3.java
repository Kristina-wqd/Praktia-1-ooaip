package praktika3.part2;

public class Task3 {
    /*
     * Ответы на вопросы:
     * 1) Можно ли вызвать метод экземпляра из статического метода? 
     *    - НЕТ, только если не создан объект этого класса.
     * 2) Можно ли вызвать статический метод из метода экземпляра? 
     *    - ДА, можно.
     * 3) Исправленный код класса C:
     */
    
    public static void main(String[] args) {
        Task3 c = new Task3();
        c.method1();
    }

    public void method1() {
        method2();
    }

    public static void method2() {
        Circle c = new Circle(5);
        System.out.println("What is area " + c.getArea());
    }
}