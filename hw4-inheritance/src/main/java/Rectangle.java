public class Rectangle implements  Figure {

    double a;

    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        if (a < 0 || b < 0) {
            return Double.NaN;
        }
        return a * b;
    }

    @Override
    public double perimiter() {
        if (a < 0 || b < 0) {
            return Double.NaN;
        }
        return 2 * a + 2 * b;
    }

    @Override
    public String info() {
        return String.format("rectangle with sites %.1f", a) + String.format(" and %.1f", b);
    }

}
