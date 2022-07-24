package module4;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UsingApis {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(collecting(list));
        System.out.println(teeing(list));
        System.out.println(learnings());
        System.out.println(formatting(1_000_000_000));
    }

    private static List<Integer> collecting(List<Integer> list) {
        return list.stream()
                .map(i -> i*2)
                .collect(Collectors.toList());
    }

    record Page(List<Integer> pageOfData, long numMatches) {
    }
    private static Page teeing(List<Integer> list) {
        return null;
    }

    private static String learnings() {
        return "";
    }

    private static String formatting(int number) {
        return "";
    }
}
