import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamsTasks {

    public static void main(String[] args) {
        coins();
    }

    public static int sumN(int n) {
        if (n < 0) {
            throw new RuntimeException("Wrong input data");
        }
        return IntStream.range(1, n)
                .sum();
    }

    public static int sumN3(int n) {
        if (n < 0) {
            throw new RuntimeException("Wrong input data");
        }
        return IntStream.range(1, n)
                .map(x -> x * x * x)
                .sum();
    }

    public static List<Integer> oddNumbersList(List<Integer> list) {
        if (list == null) {
            throw new RuntimeException("Wrong input data");
        }
        List<Integer> list2 = list.stream()
                .filter(id -> id % 2 != 0)
                .toList();
        return list2;
    }

    public static void coins() {
        long i =  new Random()
                .ints(100, 1, 3)
                .filter(x -> x == 1)
                .count();
        System.out.println(i + " number, " + (100 - i) + " head ");
    }
}
