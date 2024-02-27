public class RightTriangle extends Triangle {

    public RightTriangle(double a, double b) {
        super(a, b, 0);
    }

    @Override
    public double area() {
        if (a < 0 || b < 0) {
            return Double.NaN;
        }
        return (a * b) / 2;
    }

    @Override
    public double perimiter() {
        if (a < 0 || b < 0) {
            return Double.NaN;
        }
        return Math.sqrt(a * a + b * b) + a + b;
    }

    @Override
    public String info() {
        return String.format("right triangle with sites %.1f and %.1f", a, b);
    }

}
