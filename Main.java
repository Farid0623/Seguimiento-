package sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(0, 2, 4, 6, 8, 10, 12);
        List<Integer> SortedNumber = number.stream()
                .filter(n -> n < 10)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(SortedNumber);
    }
    }

