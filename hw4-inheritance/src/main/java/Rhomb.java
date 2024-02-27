public class Rhomb implements Figure {

    double a;

    double b;

    public Rhomb(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        if (a < 0) {
            return Double.NaN;
        }
        return (a * b) / 2;
    }

    @Override
    public double perimiter() {
        if (a < 0) {
            return Double.NaN;
        }
        return 2 * Math.sqrt(a * a + b * b);
    }

    @Override
    public String info() {
        return String.format("rhomb with sites %.1f", a) + String.format(" and %.1f", b);
    }

}
