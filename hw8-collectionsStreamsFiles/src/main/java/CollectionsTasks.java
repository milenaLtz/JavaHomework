
import org.assertj.core.internal.Lists;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionsTasks {
    public static <T> void reverseList(List<T> list) {
        if (list == null) {
            throw new RuntimeException("Wrong input data");
        }
        Collections.reverse(list);
    }

    public static <T> List<T> createReversedList(List<T> list) {
        if (list == null) {
            throw new RuntimeException("Wrong input data");
        }
        List<T> newList = list.stream()
            .collect(Collector.of(
                    () -> new ArrayDeque<T>(),
                    ArrayDeque::addFirst,
                    (q1, q2) -> {
                        q2.addAll(q1);
                    return q2;
                    }
                )
            )
            .stream().toList();
        return newList;
    }

    public static <T> void deleteEvenElements(List<T> list) {
        if (list == null) {
            throw new RuntimeException("Wrong input data");
        }
        list.removeIf(i -> (list.indexOf(i) % 2 == 0));
    }

    public static <T> List<T> createOddElementsList(List<T> list) {
        if (list == null) {
            throw new RuntimeException("Wrong input data");
        }
        return list.stream()
                .filter(i -> list.indexOf(i) % 2 != 0)
                .collect(Collectors.toList());
    }
}
