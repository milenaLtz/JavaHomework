public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    @Override
    public double area() {
        if (a < 0) {
            return Double.NaN;
        }
        return (Math.sqrt(3) / 4) * (a * a);
    }

    @Override
    public double perimiter() {
        if (a < 0) {
            return Double.NaN;
        }
        return 3 * a;
    }

    @Override
    public String info() {
        return String.format("equilateral triangle with site %.1f", a);
    }
}
