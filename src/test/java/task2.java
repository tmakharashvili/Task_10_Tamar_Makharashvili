import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        for (String word : words){
            System.out.println(word.toUpperCase());
        }
    }
}
