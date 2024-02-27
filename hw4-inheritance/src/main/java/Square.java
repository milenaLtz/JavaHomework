public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double area() {
        if (a < 0) {
            return Double.NaN;
        }
        return a * a;
    }

    @Override
    public double perimiter() {
        if (a < 0) {
            return Double.NaN;
        }
        return a * 4;
    }

    @Override
    public String info() {
        return String.format("square with site %.1f", a);
    }


}
