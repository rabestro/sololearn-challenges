// https://www.sololearn.com/learn/5045/

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anadrome {

    public static void main(final String[] args) {
        final var input = new Scanner(System.in);
        final var word = input.nextLine();
        input.close();

        final var isAnadrome = word.chars()
                .mapToObj(Integer::new)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() % 2 != 0)
                .count() < 2;

        System.out.println(isAnadrome ? "yes" : "no");
    }
}
