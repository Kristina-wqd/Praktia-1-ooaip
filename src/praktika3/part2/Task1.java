package praktika3.part2;

// Класс F 
class F {
    int i; 
    static String s; 

    void method() {
        System.out.println("Метод экземпляра");
    }

    static void smethod() {
        System.out.println("Статический метод");
    }
}

public class Task1 {
    public static void main(String[] args) {
        F f = new F();
        
        System.out.println("=== Допустимые вызовы ===");
        // 1. System.out.println(f.i); - Допустимо (переменная экземпляра через объект)
        System.out.println(f.i);
        
        // 2. System.out.println(f.s); - Допустимо (статическая через объект)
        System.out.println(f.s);
        
        // 3. f.method(); - Допустимо (метод экземпляра через объект)
        f.method();
        
        // 5. System.out.println(F.s); - Допустимо (статическая через класс)
        System.out.println(F.s);
        
        // 6. F.smethod(); - Допустимо (статический метод через класс)
        F.smethod();
        
        System.out.println("\n=== Недопустимые вызовы (закомментированы) ===");
        // 4. System.out.println(F.i); - Не допустимо (переменная экземпляра через класс)
        // System.out.println(F.i);
        
        // 7. F.method(); - Не допустимо (метод экземпляра через класс)
        // F.method();
    }
}