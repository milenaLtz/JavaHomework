public class Circle implements Figure {

    double a;

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        if (a < 0) {
            return Double.NaN;
        }
        return (a * a) * Math.PI;
    }

    @Override
    public double perimiter() {
        if (a < 0) {
            return Double.NaN;
        }
        return 2 * a * Math.PI;
    }

    @Override
    public String info() {
        return String.format("круг с радиусом %.1f", a);
    }
}
