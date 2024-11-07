import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        words.stream().filter(word ->word.length()>4)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
