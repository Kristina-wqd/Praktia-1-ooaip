package praktika3.part2;

public class Task2 {
    int count;

    // main статический
    public static void main(String[] args) {
        Task2 t = new Task2();
        System.out.println("Count: " + t.getCount());
        System.out.println("Factorial of 5: " + factorial(5));
    }

    // getCount не статический
    public int getCount() {
        return count;
    }

    // factorial статистический
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}