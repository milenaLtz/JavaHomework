public class Matrix22 {
    double a;
    double b;
    double c;
    double d;

    public Matrix22(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Matrix22(double[][] e) {
        this.a = e[0][0];
        this.b = e[0][1];
        this.c = e[1][0];
        this.d = e[1][1];
    }

    public double trace() {
        return this.a + this.d;
    }

    public double det() {
        return this.a * this.d - this.b * this.c;
    }

    public double[][] get() {
        return new double[][]{{this.a, this.b}, {this.c, this.d}};
    }

    public String toString() {
        return String.valueOf(this.a) + " " + String.valueOf(this.b) + '\n' + String.valueOf(this.c) + " " + String.valueOf(this.d);
    }

    public void print() {
        double[][] mas = new double[][]{{this.a, this.b}, {this.c, this.d}};
        for (double[] i : mas) {
            for (double k : i) {
                System.out.print(k);
                System.out.print('\t');
            }
            System.out.println();
        }
    }

    public Matrix22 add(Matrix22 matrix) {
        double num1 = this.a + matrix.a;
        double num2 = this.b + matrix.b;
        double num3 = this.c + matrix.c;
        double num4 = this.d + matrix.d;
        double[][] mas = new double[][]{{num1, num2}, {num3, num4}};
        return new Matrix22(mas);
    }

    public Matrix22 mul(Matrix22 matrix) {
        double num1 = this.a * matrix.a + this.b * matrix.c;
        double num2 = this.a * matrix.b + this.b * matrix.d;
        double num3 = this.c * matrix.a + this.d * matrix.c;
        double num4 = this.c * matrix.b + this.d * matrix.d;
        double[][] mas = new double[][]{{num1, num2}, {num3, num4}};
        return new Matrix22(mas);
    }

    public Matrix22 pow(int n) {
        if (n == 1) {
            return new Matrix22(new double[][]{{this.a, this.b}, {this.c, this.d}});
        }
        Matrix22 mas = new Matrix22(this.a, this.b, this.c, this.d);
        double num1 = this.a * this.a + this.b * this.c;
        double num2 = this.a * this.b + this.b * this.d;
        double num3 = this.c * this.a + this.d * this.c;
        double num4 = this.c * this.b + this.d * this.d;
        for (int i = 1; i < n - 1; i++) {
            num1 = num1 * this.a + num2 * this.c;
            double n1 = num1 - num2 * this.c / this.a;
            num2 = n1 * this.b + num2 * this.d;
            num3 = num3 * this.a + num4 * this.c;
            double n3 = num3 - num4 * this.c / this.a;
            num4 = n3 * this.b + num4 * this.d;
        }
        this.a = num1;
        this.b = num2;
        this.c = num3;
        this.d = num4;

        return this;
    }
}
