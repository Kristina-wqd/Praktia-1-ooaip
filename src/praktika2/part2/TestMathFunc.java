package praktika2.part2;

public class TestMathFunc {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("2^10 = " + mc1.power(2, 10));
        System.out.println("|3 + 4i| = " + mc1.complexAbs(3, 4));

        MathFunc mf = new MathFunc();
        System.out.println("Длина окружности R=10: " + mf.circleLength(10));
        System.out.println("PI из интерфейса = " + MathCalculable.PI);
    }
}