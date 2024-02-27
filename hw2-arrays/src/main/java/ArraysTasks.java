import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.codehaus.groovy.runtime.ArrayUtil;

public class ArraysTasks {
    public static int[] even(int n) {
        if (n < 0) {
            return new int[0];
        }
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (i+1)*2;
        }
        return mas;
    }

    public static boolean allSimilar(int[] a) {
        if (a.length == 0) {
            return false;
        }
        int index = 0;
        int n = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                index++;
            }
        }
        return index == a.length;
    }

    public static boolean hasSimilar(int[] b) {
        for (int j = 0; j < b.length; j++){
            int current = b[j];
            for (int i = j + 1; i < b.length; i++) {
                if (b[i] == current) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double mean(int[] c) {
        double sum = 0;
        if (c.length == 0) {
            return 0;
        }
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        return sum / c.length;

    }

    public static void shift(int[] d) {
        if (d.length != 0) {
            int f = d[d.length - 1];
            for (int j = d.length - 1; j > 0; j--) {
                d[j] = d[j - 1];
            }
            d[0] = f;
        }
    }

    public static int[] copyShift(int[] e) {
        if (e.length == 0) {
            return new int[0];
        }
        int g = e[e.length - 1];
        int[] m = new int[e.length];
        for (int j = e.length - 1; j > 0; j--) {
            m[j] = e[j - 1];
        }
        m[0] = g;
        return m;
    }
}
