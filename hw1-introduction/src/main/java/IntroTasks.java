public class IntroTasks {
    public static boolean is3Digit(int a) {
        return a >= 100 && a < 1000;
    }

    public static boolean isLast5(int a) {
        return a % 10 == 5;
    }

    public static boolean isSameDigits(int a) {
        if (a == 0) {
            return false;
        }
        int x = (a % 100) / 10;
        int y = a % 10;
        return x == y;
    }

    public static boolean isLeapYear(int a) {
        return a % 4 == 0 && (a % 400 == 0 || a % 100 != 0);
    }

    public static String cat(int a) {
        int b = Math.abs(a);
        if (b  == 12 || b == 13 || b == 14 || b == 11 || b == 0) {
            return String.format(a + " kotov");
        } else if (b % 100 == 12 || b % 100 == 13 || b % 100 == 14 || b % 100 == 11) {
            return String.format(a + " kotov");
        } else if (b % 10 == 2 || b % 10 == 3 || b % 10 == 4) {
            return String.format(a + " kota");
        } else if (b % 10 >= 5 && b % 10 <= 9) {
            return String.format(a + " kotov");
        }
        return String.format(a + " kot");
    }

    public static String getQuadraticEquationSolution(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        if (a == 0 && b == 0 && c == 0) {
            return "there are infinitely many solutions";
        } else if (a == 0 && b != 0 && c == 0) {
            int x = 0 / b;
            return "one solution x =" + x;
        } else if (a == 0 && b != 0 && c != 0) {
            int x = (-c) / (b);
            return "one solution x =" + x;
        } else if (d == 0) {
            int x = -b / (2 * a);
            return "one solution x =" + x;
        } else if (d > 0 && a != 0) {
            double x1 = ((-b + Math.sqrt(d)) / (2 * a));
            double x2 = ((-b - Math.sqrt(d)) / (2 * a));
            double y1 = x1;
            double y2 = x2;

            if (x1 < x2) {
                y1 = x1;
                y2 = x2;
            } else {
                y1 = x2;
                y2 = x1;
            }
            int g1 = (int) y1;
            int g2 = (int) y2;
            return "two solutions x1 = " + g1 + ", x2 = " + g2;
        }
        return "no solution";
    }

    public static boolean isPrimality(int a) {
        int count1 = 0;
        for (int i = 1; i <= a + 1; i++) {
            if (a % i == 0) {
                count1 += 1;
            }
        }
        return count1 == 2;
    }
}
