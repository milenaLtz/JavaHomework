import groovy.json.JsonOutput;

import java.util.Arrays;

public class MultidimentionalArrays {

    public static void main(String[] args) {
        char[][] c = createTable(20, '.');
        printTable(c);
        System.out.println("============ lets fill the lines: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);
        System.out.println("============ lets fill the lines: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }
    public static void printTable(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static void printTableAligned(int[][] b) {
        int max  = 0;
        for (int[] a : b) {
            if (a.length > max) {
                max = a.length;
            }
        }
        int[] masnew = new int[max];
        for (int[] a : b) {
            if (a != null) {
                for (int j = 0; j < a.length; j++) {
                    String size = String.valueOf(a[j]);
                    if (size.length() > masnew[j]) {
                        masnew[j] = size.length();
                    }
                }
            }
        }
        for (int[] a : b) {
            if (a != null) {
                for (int j = 0; j < a.length; j++) {
                    String format = "%" + masnew[j] + "d";
                    System.out.printf(format, a[j]);
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static char[][] createTable(int a, char b) {
        char symb = b;
        char[][] chr = new char[a][a];
        for (int i = 0; i < chr.length; i++) {
            for (int j = 0; j < chr.length; j++) {
                chr[i][j] = symb;
            }
        }
        return chr;
    }

    private static void printTable(char[][] c) {
        for (char[] i : c) {
            for (char l : i) {
                System.out.print(l);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void fillFirstAndLastLines(char[][] c, char d) {
        for (int i = 0; i < c.length; i++) {
            c[0][i] = d;
            c[c.length - 1][i] = d;
        }
    }


    private static void fillFirstAndLastColumns(char[][] c, char d) {
        for (int i=0; i < 20; i++) {
            c[i][0] = d;
            c[i][c.length - 1] =d;
        }
    }
}
