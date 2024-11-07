import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");

       int i = 0;
       while (i<names.size()){
           System.out.println(names.get(i));
           i++;
       }
    }
}
