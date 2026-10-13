package praktika2.part2;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexAbs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Длина окружности через PI из интерфейса
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}