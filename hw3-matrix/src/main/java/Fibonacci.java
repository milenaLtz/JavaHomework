import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    private static double fib(double n) {
        Matrix22 matrix = new Matrix22(1, 1, 1, 0);
        if (n == 1 || n == 2) {
            return matrix.a;
        } else if (n == 0) {
            return matrix.d;
        } else if (n < 0) {
            double m = Math.abs(n);
            double num1 = matrix.a * matrix.a + matrix.b * matrix.c; //1
            double num2 = matrix.a * matrix.b + matrix.b * matrix.d; //-1
            double num3 = matrix.c * matrix.a + matrix.d * matrix.c;
            double num4 = matrix.c * matrix.b + matrix.d * matrix.d;
            for (int i = 1; i < m - 1; i++) {
                num1 = num1 * matrix.a + num2 * matrix.c; //-1
                double n1 = num1 - num2 * matrix.c / matrix.a;
                num2 = n1 * matrix.b + num2 * matrix.d; //2
                num3 = num3 * matrix.a + num4 * matrix.c; //2
                double n3 = num3 - num4 * matrix.c / matrix.a;
                num4 = n3 * matrix.b + num4 * matrix.d; //-3
            }
            if (n % 2 == 0) {
                double newnum = -num2;
                return newnum;
            }
            return num2;
        }
        double num1 = matrix.a * matrix.a + matrix.b * matrix.c;
        double num2 = matrix.a * matrix.b + matrix.b * matrix.d;
        double num3 = matrix.c * matrix.a + matrix.d * matrix.c;
        double num4 = matrix.c * matrix.b + matrix.d * matrix.d;
        for (int i = 2; i < n - 1; i++) {
            num1 = num1 * matrix.a + num2 * matrix.c;
            double n1 = num1 - num2 * matrix.c / matrix.a;
            num2 = n1 * matrix.b + num2 * matrix.d;
            num3 = num3 * matrix.a + num4 * matrix.c;
            double n3 = num3 - num4 * matrix.c / matrix.a;
            num4 = n3 * matrix.b + num4 * matrix.d;
        }
        return num1;
    }
}
