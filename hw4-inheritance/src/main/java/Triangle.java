public class Triangle implements Figure {

    double a;

    double b;

    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimiter() {
        return a + b + c;
    }

    public String info(){
        return String.format("triangle with sites %1f", a, b, c);
    }

}
