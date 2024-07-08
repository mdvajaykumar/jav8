import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> input1 = Arrays.asList("a", "bb", "ccc", "d", "ee", "fff");

        Map<Integer, List<String>> answer =input1.stream().collect(Collectors.groupingBy(s->s.length()));

    }
}